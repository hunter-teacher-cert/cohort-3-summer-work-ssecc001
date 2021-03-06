import java.io.*;
import java.util.*;

/**
For all attempted methods, make sensible decisions for error and
edge cases (such as indexing out of bounds).
Basic
-----
add(string value)
get(int index);
toString()
Intermediate (at least add, size + one of the other two)
------------
size()
add(int index,String value)
indexOf(String value);
toArray()
Challenge
--------
remove(int index);
*/

public class LinkedList{

  private Node head;

  public LinkedList(){
    head = null;
  }

  /**
  Parameters:
  value - the new string to add to the list
  Adds a new node containing value to the front of the list.
  */
  public void add(String value){
    Node addNode = new Node (value);
    addNode.setNext(head);
    head = addNode;

  }

  /**
  Returns the String in the node at location index.
  */
  public String get(int index){
    Node walker = head;
    String result = "";
    for (int i = 0; i< index; i++){
      walker = walker.getNext();
     
   }
    result+= walker;
     
    return result;
  }
   

  /**
  Return a string representation of the list
  */
  public String toString(){
    String result = "";
    Node walker = head;
    while(walker != null){
    
      result = result + walker.toString();
      walker = walker.getNext();
    } 
    return result;
  }

  /**
  returns the number of elements in the list
  */
  public int size(){
    Node walker = head;
    int counter = 0;
    while (walker != null)
    {
      walker = walker.getNext();
      counter ++;
    }    
    return counter;
  }



  /**
  Parameters:
  index - an int with the location to add
  value - the new value
  Adds a new node with the String value to the list.
  The new node should be added at the location specified by the index.
  For example, given the list:
  "a" -> "b" -> "c" -> "d"
  add(1,"z") results in:
  "a"-> "z" -> "b" -> "c" -> "d"
  */
  public void add(int index, String value){
  Node insertNode = new Node(value);
  Node walker = head;
  if (index == 0){
    add(value);
    
  }
  else{
    for (int i = 0; i < index-1; i++){
    walker = walker.getNext();  
  }
    insertNode.setNext(walker.getNext());
    walker.setNext(insertNode);
  }
  
  }


  /**
  Returns the index (location) of the first node in the list
  that contains value.
  Example:
  Given the list:
  "a"->"b"->"c"->"d"->"e"
  indexOf("d") would return 3 since "d" is at location 3.
  */
  public int indexOf(String value){
    Node walker = head;
    int counter = 0;
    while (walker != null){
      if (walker.getData() == value){
         return counter;
      }
      walker = walker.getNext();
      counter ++;
      }
    return -1;
    }
  /**
  This routine should create a new array that is the same
  size as the number of Nodes in the list.
  It should then copy all of the values to the array and return
  the array.
  */
  public String[] toArray(){
    Node walker = head;
    int size = 0;
    while (walker != null)
    {
      walker = walker.getNext();
      size ++;
    }    
    walker = head;
    String result[]; 
    result = new String[size];
    for (int i = 0; i<result.length && walker !=null; i++ ){
      result[i] = walker.getData();
      walker = walker.getNext();
    }
    return result;
  }



  /**
  Remove the Node at location index from the list.
  Ex:
  
  Given the list:
  "a"->"b"->"c"->"d"->"e"
  remove(2) results in:
  "a"->"b"->"d"->"e"
  */
  public void remove(int index){
  }
}
