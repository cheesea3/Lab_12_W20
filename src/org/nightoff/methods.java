package org.nightoff;

import java.util.InputMismatchException;
import java.util.Scanner;

public class methods { //class dedicated just to the methods


    public static void poschecker(int userint) {
        if (userint > 0) { //checks to see if it's not negative doesnt include 0 because that is not neither
            try {
                System.out.println("Success!");
                Thread.sleep(1000); //delays a few seconds
                System.out.println(new String(new char[20]).replace("\0", "\r\n")); //clears the screen
                math(userint);//passes positive integer to math() to get the sum up to two different numbers
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else { //this part means the number entered was negative
            System.out.println("You entered " + userint + "." + "\nThis is not a positive integer. Try again."); // lets user know of error
            menu.launch(); //returns to start() due to invalid integer
        }
    }

    public static void math(int userint) {
        int firstterm = 1;
        int commondifference = 1;
        int sum = 0;
        for (int i = 0; i < userint; i++) {
            sum = sum + firstterm;
            firstterm = firstterm + commondifference;
        }
        result(userint, sum, firstterm, commondifference);
    }


    public static void result(int userint, int sum, int firstterm, int commondifference) {
        try {
            System.out.println("Loading results...");
            Thread.sleep(1000); //delays a few seconds
            System.out.println(new String(new char[24]).replace("\0", "\r\n")); //clears the screen

            System.out.println("The sum of " + "1" + " to " + userint + " is " + sum); //

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


    public static void menuinput(Scanner userinput) { //takes the passed in scanner from before, declared earlier on for organization
        String option = userinput.nextLine(); //stores the usersinput for menu selection
        switch (option) { //switch for multi way branching and speeed
            case "stop":  //function if string is quit
                Main.stop(); //takes the program to its death

                break;
            case "pause":  //function if userinput is says pause
                Main.pause();//UNFINISHED

                break;
            case "defaults":  //UNFINISHED
                System.out.println(new String(new char[20]).replace("\0", "\r\n")); //clears the screen
                System.out.println("First Term: ");
                System.out.println("Common difference:");
                System.out.println("#####################################");
                System.out.println("# Choose an option to modify                          #\n#####################################\n# 1\t -\t\tFirst Term  #"); //commands list
                System.out.println("# Stop\t -\t\tStops the program   #"); //commands list
                System.out.println("# Defaults\t -\t\tAdjust defaults    #"); //commands list
                System.out.println("#####################################"); //commands list
                return;

            case "start":  //function if string is quit
                try {
                    System.out.println(new String(new char[20]).replace("\0", "\r\n")); //clears the screen
                    int userint; //declares the variable before hand so it can be modified to catch exception without compile issues
                    System.out.println("Enter the maximum number to sum to:"); //prompts user to do something
                    userint = userinput.nextInt();//handled to take int for the function poschecker

                    try {
                        Thread.sleep(1000); //delays a few seconds
                        System.out.println("Checking to see if value is positive...");
                        Thread.sleep(1000); //delays a few seconds
                        System.out.println(new String(new char[20]).replace("\0", "\r\n")); //clears the screen
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    methods.poschecker(userint);//function to validate if its positive
                } catch (InputMismatchException e) {
                    System.out.println(new String(new char[20]).replace("\0", "\r\n")); //clears the screen
                    System.out.println("That is not an integer, please try again");//lets the user know that the integer type was invalid
                    //lets the user know that the menu option was invalid
                }
                break;
            case "":  //function if userinput is empty
                menu.launchingrestart();//takes that back to the menu to remind them the commands
                break;
            default:  //final case when the options above aren't reaad
                System.out.println("Invalid menu option, please try again"); //lets the user know that the menu option was invalid
                menuinput(userinput); //loops user back to the beginning of menuinput function to try again

                break;
        }
    }

}
