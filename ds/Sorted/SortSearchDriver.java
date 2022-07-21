import java.io.*;
import java.util.*;

public class SortSearchDriver {
    public static void main(String[] args) {


    	// Uncomment these to test part 1
    	int size = 100000;
    	SortSearch ss = new SortSearch(size);
      long start,elapsed;
      ss.sort();

      int location;

      int targetValue = ss.get(size/2);
      System.out.println(targetValue);
      
	    start = System.currentTimeMillis();
	    location = ss.linearSearch(targetValue);

	    // System.out.println(ss);
    	elapsed = System.currentTimeMillis() - start;
    	System.out.println("Size: " + size + " Linear Time: " + elapsed);


      start = System.currentTimeMillis();
	    location = ss.binarySearch(targetValue);

	    // System.out.println(ss);
    	elapsed = System.currentTimeMillis() - start;
    	System.out.println("Size: " + size + " Binary Time: " + elapsed);
    	

      start = System.currentTimeMillis();
	    location = ss.binarySearchRecursive(targetValue,0,size-1);

	    // System.out.println(ss);
    	elapsed = System.currentTimeMillis() - start;
    	System.out.println("Size: " + size + " Binary Recursive Time: " + elapsed);

    	 /*System.out.println(ss);
    	// Uncomment these to test part 2
    
    	int i;
    	i = ss.findSmallestIndex(0);
    	System.out.println("ss["+ i +"] = "+ss.get(i)+" : " + ss);
    
    	// i = ss.findSmallestIndex(3);
    	// System.out.println("ss["+ i + "] = "+ss.get(i)+" : " + ss);
    	
    	// Uncomment these to test part 3
    
    	System.out.println(ss); */
    	// ss.sort();
    	// System.out.println(ss);
    
      /*
      System.out.println("Search");
    
      System.out.println(ss.linearSearch(10));
    	*/
      
      // for (int i = 0; i < 20; i++){
      //   System.out.println("Linear Search:");
      //   System.out.println(i + " is at position: " + ss.linearSearch(i));
      //   System.out.println("Binary Search:");
      //   System.out.println(i + " is at position: " + ss.binarySearch(i));
      //   System.out.println("Binary Search Recursive:");
      //   System.out.println(i + " is at position: " + ss.binarySearchRecursive(i,0,19)); // Parameters: Value, low, high
      //   System.out.println("");
      // }

	      

    }
}