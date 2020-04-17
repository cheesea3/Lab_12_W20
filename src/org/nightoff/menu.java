package org.nightoff;

import java.util.Scanner;

public class menu {

    public static void launch() { //made to take the users initial input
        try { //try method to catch issues
            Scanner userinput = new Scanner(System.in); //simple scanner
            System.out.println("Welcome to my last lab assignment."); //welcomes the user
            Thread.sleep(1000); //delays a few seconds
            System.out.println("Loading commands...");//simulates loading haha
            menu(userinput);
        } catch (Exception e) { //im unclear on why it even 'Throws" this exception in the first place...
            e.printStackTrace(); //i guess this will make things a bit more clear...
        }

    }

    public static void launchingrestart() { //loops back here to start() if something goes wrong //keeps new default values
        try { //try method to catch issues
            Scanner userinput = new Scanner(System.in); //simple scanner
            System.out.println("Launching menu..."); //restart
            Thread.sleep(1000); //delays a few seconds
            System.out.println("Loading...");//simulates loading haha
            menu(userinput);
        } catch (Exception e) { //im unclear on why it even 'Throws" this exception in the first place...
            e.printStackTrace(); //i guess this will make things a bit more clear...
        }

    }

    private static void menu(Scanner userinput) throws InterruptedException {
        Thread.sleep(1000); //delays a few seconds
        System.out.println(new String(new char[20]).replace("\0", "\r\n")); //clears the screen
        Thread.sleep(1000); //delays a few seconds
        System.out.println("#####################################");
        System.out.println("# Commands                          #\n#####################################\n# Start\t -\t\tStarts the program  #"); //commands list
        System.out.println("# Stop\t -\t\tStops the program   #"); //commands list
        System.out.println("# Defaults\t -\t\tAdjust defaults #"); //commands list
        System.out.println("#####################################"); //commands list
        System.out.println(new String(new char[4]).replace("\0", "\r\n")); //pushes up the screen
        methods.menuinput(userinput);// takes the users selection from the menu and passes it to the menuinput function in methods.java
    }

}
