 /**
 * SuperArray by Team MarvelvsDC
 * Wayne Tobias
 * collaborators: Wayne Tobias, William LaMorie, Alicia Wade, Sueann Secafico
 */

/**
   SKELETON
   SuperArray is a wrapper class for an array.

   Provides "pass-thru" accessibility to pre-existing array capabilities:
   - get/set by index
   - get length

   Adds functionality:
   - dynamic capacity
   - auto-grow capacity if necessary
*/

import java.io.*;
import java.util.*;

public class SuperArray
{
  /**
     SUBGOAL:
     declare instance vars
     ...and initialize?
  */


  //instance vars
  private int[] data;           // "interior"/"underlying" data container
  private int numberElements;   // number of "meaningful" elements


  // ~~~~~~~~~~~~~~~ CONSTRUCTORS ~~~~~~~~~~~~~~~
  //overloaded constructor -- allows specification of initial capacity
  public SuperArray( int size )
  {
    //init underlying/inner storage of specified capacity
    data = new int[size];
    
    //init instance vars
    numberElements = 0;

  }

  //default constructor -- initializes capacity to 10
  public SuperArray()
  {
    //init underlying/inner storage of capacity 10
        /* YOUR SIMPLE+SMART CODE HERE */
    data = new int[10];
    numberElements = 0;
     
    //init instance vars
        /* YOUR SIMPLE+SMART CODE HERE */
    
  }


  // ~~~~~~~~~~~~~~~ METHODS ~~~~~~~~~~~~~~~
  public void add( int value )
  {
    // test to see if we need to grow, then grow
    /**
       IMPORTANT:
       This is the first code that should run in this method
       but the last code you should write.
       Implement the rest of this method first,
       then only write this section once the rest is tested and working.
    */
    if(numberElements == data.length){ 
      grow();
    }

    // add item  // with out the stuff above, it assumes there is room on the array
    // data & numberElements 
    data[numberElements] = value;


    // increment numberElements
    numberElements ++;

  }//end add()


  public boolean isEmpty()
  {
    //return whether this SuperArray instance is empty
    // in a modern language:
    // return bool(numberElements);
    // as seen in class the following code could be replaced with one line
    // return numberElements == 0; // this will return true or false
    if (numberElements == 0){
      return true;
    }
    return false;
  }


  public int get(int index)
  {
    //return item at index
    // we can't do indexing like data[5] because the array is hidden in the super
    // array  {Superarray {array {5} } }    
    
    return data[index]; //ph
  }


  public String toString()
  {
    //return stringified version of this Object
    // also adding "," after each item but not the first

    String s = "";
    for(int i = 0; i < numberElements; i++){
      if (i >= 1 ){ s = s + ", " + data[i]; }
      else { s = s + data[i]; }
    }
    return s; 
  }//end toString()


  //return Stringified version of this Object,
  // with extra debugging info
  //(helper method for debugging/development phase)
  public String debug()
  {
    String s = "";
    s = "Size: " + this.data.length;
    s = s + " LastItem: " + numberElements + "  Data: ";
    for (int i = 0; i < numberElements; i++) {
      s = s + data[i] + ", ";
    }
    s = s + "\n";
    return s;
  }//end debug()


  public void remove(int index)
  {
    // shift items down to remove the item at index
    /* For the most part so far we've done looping from the start of something to
      the end of it, this time we need to do looping differently than that.
        start at that index value, 
        move index + 1 -> index
        continue to index + 1
        replace that with index +1 +1, ect... 
        stop at numberElements - 1
    */

    
    // subtract fom numElements;
    /* YOUR SIMPLE+SMART CODE HERE */
    for (int i = index; i < numberElements -1; i++){
      data[i] = data[i+1];
      
    }
    numberElements --;
  }


  public void add(int index, int value)
  {
    // see if there's enough room
    if(numberElements == data.length){ 
      grow();
    }

    // shift elements toward the end of the array
    for (int i=numberElements - 1; i>=index; i--){
      data[i+1] = data[i];
    }

    // insert new element
    data[index] = value;

    // increment numElements
    numberElements ++;
  }


  private void grow()
  {
    // create a new array with extra space
    // make a new array 1 bigger
    int[] copy = new int[data.length + 1];
      
    // copy over all the elements from the old array to the new one
    for(int i = 0; i < data.length; i++){
      copy[i] = data[i];
    }

    // point data to the new array
    // Q: How does this look when illustrated using encapsulation diagram?
    /* YOUR SIMPLE+SMART CODE HERE */
    data = copy;
  }//end grow()

}//end class