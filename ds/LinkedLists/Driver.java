import java.io.*;
import java.util.*;

public class Driver{
  public static void main(String[] args) {
    LinkedList l = new LinkedList();
    l.add("one");
    l.add("two");
    System.out.println(l);
    System.out.println(l.get(1));
  }
}