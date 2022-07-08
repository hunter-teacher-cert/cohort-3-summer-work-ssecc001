/**
   lab skeleton
   encapsulation / SuperArray
   SuperArray is a wrapper class for an array.
   Provides "pass-thru" accessibility to array capabilities:
   - get/set by index
   - get length
   Adds functionality:
   - dynamic capacity
   - auto-grow capacity if necessary
 **/

import java.io.*;
import java.util.*;

public class SuperArray
{
  //instance vars
  private int[] data;           //where the actual data is stored
  private int numberElements;   //number of "meaningful" elements


  // ~~~~~~~~~~~~~~~ CONSTRUCTORS ~~~~~~~~~~~~~~~
  //overloaded constructor -- allows specification of initial capacity
  public SuperArray( int size )
  {
    data = new String (size ); //max?
  }

  //default constructor -- initializes capacity to 10
  public SuperArray()
  {
  this.size = 10;
  this.data = new String [10];
  }


  // ~~~~~~~~~~~~~~~ METHODS ~~~~~~~~~~~~~~~
  public void add( int value )
  {
    // test to see if we need to grow, then grow
    // SIMPLE VERSION DOES NOT AUTO-GROW CAPACITY; INSERT MORE CODE HERE LATER

    // add item
    if (value >= size){
      value += size;
    }
    else if (value >= 0){
      if (size == data.length){
        value += size + 10;
      for (int 1 = size; i > value; i++)
        data[i]=data[i-1];
        size++
      
      }
    }
      
    }

    // increment numberElements


  }//end add()


  public boolean isEmpty()
  {  
    size == 0;
    return size;
  }


  public int get(int index)
  {
    if (index >= size || index < 0){
    return "";
    }
  else {
    return data[index];
  }
  }


  public String toString()
  {
  String result = "";
  for(int i =0; i< data.length; i++){

    else if (data[i] )
  }
  }//end toString()


  //helper method for debugging/development phase
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


  private void grow()
  {
    // create a new array with extra space
    // Q: How did you decide how much to increase capacity by?
  int [] copy = new int[size() * 3 + 1]; //max to min?
    for (int i = 0; i< size(); i++){
      for (int j =0; i<size(); j++){
        copy[i]= data[j];
      }
      data = copy;
    }
    // copy over all the elements from the old array to the new one

    // point data to the new array
    // Q: How does this look when illustrated using encapsulation diagram?

  }//end grow()

}//end class