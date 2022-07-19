import java.io.*;
import java.util.*;

public class Driver{
  public static void main(String[] args) {
    LinkedList l = new LinkedList();
    l.add("one");
    l.add("two");
    System.out.println(l);
    l.add(0,"add");
    System.out.println(l);
    System.out.println(l.get(0));
    String[] testArray = l.toArray();
    for(int i=0; i<testArray.length; i++){
      System.out.println(testArray[i]);
    }
  }
}