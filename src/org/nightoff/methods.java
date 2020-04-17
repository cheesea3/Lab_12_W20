package org.nightoff;

import java.util.InputMismatchException;
import java.util.Scanner;

public class methods { //class dedicated just to the methods


    public static void poschecker(int userint) {
        if (userint > 0) { //checks to see if it's not negative doesnt include 0 because that is not neither
            System.out.println("Positive " + userint); //this not only lets them know that its positive but also prints it out for them
        }
        else { //this part means the number entered was negative
            System.out.println("You entered " + userint + "." + "\nThis is not a positive integer. Try again."); // lets user know of error
            menu.launch(); //returns to start() due to invalid integer
        }
    }


    public static void menuinput(Scanner userinput) { //takes the passed in scanner from before, declared earlier on for organization
        String option = userinput.nextLine(); //stores the usersinput for menu selection
        switch (option) { //switch for multi way branching and speeed
            case "stop":  //function if string is quit
                Main.stop(); //takes the program to its death

                break;
            case "pause":  //function if userinput is says pause
                Main.pause();//returns user

                break;
            case "start":  //function if string is quit
                try {
                    int userint; //declares the variable before hand so it can be modified to catch exception without compile issues
                    System.out.println("Enter in a positive integer and assign it to a variable of type int"); //prompts user to do something
                    userint = userinput.nextInt();//handled to take int for the function poschecker
                    methods.poschecker(userint);//function to validate if its positive
                } catch (InputMismatchException e) {
                    System.out.println("Something went wrong.\nExiting...");
                }
                break;
            default:  //final case when the options above aren't reaad
                System.out.println("Invalid menu option, please try again"); //lets the user know that the menu option was invalid

                menuinput(userinput); //loops user back to the beginning of menuinput function to try again

                break;
        }
    }

}
