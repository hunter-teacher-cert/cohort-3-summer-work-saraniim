import java.io.*;
import java.util.*;


/**
 * Driver class for Time class  by Team LucidThinkeren
 * Joel Bianchi
 * collaborators: Saranii, Kirk, Jessica
 */

/**
   INSTRUCTIONS:

   This file contains the Driver starter code for our Time class.
   
   Add code in main to test all your methods
   
   Place this file in a folder named programming/5/Driver.java

*/


public class Driver {

  public static void main(String[] args) {

  	//declare a var of appropriate type to assign an instance of Time to
  	Time t1;
  
  	//assign var the address of a newly-apportioned Time object
  	t1 = new Time();

    //declare & assign a specific time
    Time t2 = new Time(11,51,9);

    //first time
    System.out.println(t2.toString());

    //set updates the time
    t2.set(12,9,55);
    System.out.println("New time: ");
    
    //second time
    System.out.println(t2.toString());
    //print out the t1 and t2 times
    //System.out.println(t1);
    //System.out.println(t2);
    
    // Add time
    Time t3 = new Time(2,30,10);
    t2.add(t3);
  }//end main()

}//end class