package org.nightoff;

import java.util.Scanner;

public class menu {

    public static void launch() { //made to take the users initial input, loops back here to start() if something goes wrong
        try { //try method to catch issues
            Scanner userinput = new Scanner(System.in); //simple scanner
            System.out.println("Welcome to my last lab assignment."); //welcomes the user
            System.out.println("From this point of my final object-oriented lab assignment, I will be updating it to GitHub. The requirements are the bare minimum, and my extra implementation is unnecessary, but since it will be my last I might as well make it last too. "); //welcomes the user
            Thread.sleep(1000); //delays a few seconds
            System.out.println("Commands\n########################\nStart\t -\t\tStarts the program"); //commands list
            methods.menuinput(userinput);// takes the users selection from the menu and passes it to the menuinput function in methods.java
            } catch (Exception e) { //im unclear on why it even 'Throws" this exception in the first place...
            e.printStackTrace(); //i guess this will make things a bit more clear...
        }

    }

}
