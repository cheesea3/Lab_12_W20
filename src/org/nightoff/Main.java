package org.nightoff;
public class Main {

    public static void main(String[] args) { //driver
        settings options = new settings();
        options.setFirstTerm(1); // Sets the default value as 1 as per lab requirements
        options.setCommonDifference(1); // Sets the default value as 1 as per lab requirements
        menu.launch();//calls the function start with 1 set as default, isolated defaults so it can be modified
    }

    public static void stop(){ //if user inputs stop
        System.out.println("Successful termination"); //indicates it was a successful termination
        System.exit(0); //the zero means to successfully exit the program
    }

    public static void pause(){ //if user inputs pause
        System.out.println("Your session has been paused."); //lets the user know the session has paused
        //UNFINISHED
    }

    public static void loop(){ //if user inputs pause
        System.out.println("Your session has been paused.");
        //UNFINISHED
    }

    public static void resume(){ //if user inputs resume
        System.out.println("Your session has been resumed."); //lets the user know the session has paused
        //UNFINISHED
    }

    }



