package org.nightoff;

import java.util.InputMismatchException;
import java.util.Scanner;

 class start extends Exception {


    public static void launch(Scanner userinput) { //made to take the users initial input, loops back here to start() if something goes wrong
            int userint; //initializes the variable before hand so it can be modified to catch exception without compile issues
            userint = userinput.nextInt();//handled to take int for the function poschecker
            methods.poschecker(userint);//function to validate if its positive
    }
}
