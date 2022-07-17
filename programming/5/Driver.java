import java.io.*;
import java.util.*;


/**
 * Driver class for Time class  by Team LucidThinkeren
 * First Last
 * collaborators: First Last, First Last
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
	Time t;

	//assign var the address of a newly-apportioned Time object
	t = new Time(3,40,20);
  t.toString();
  System.out.print(t);
  Time other = new Time(3,45,24);
  System.out.println("");
  System.out.println(t.compareTo(other));
      
    }//end main()

}//end class