import java.io.*;
import java.util.*;

/*
Sort Project:
Part 1:  (BASIC)
  1. Analyze the two constructors - try to figure out how they work.
  2. Compile and run the program (SortProjectDriver.java and SortProject.java) and confirm
  the behavior of the constructors.
  Part 2: (BASIC)
  1. Read the description of findSmallestIndex and complete the method.
  2. Uncomment the lines in SortProjectDriver to test.
  Part 3: (INTERMEDIATE)
  1. Complete the sort method - read comments for description
  2. Uncomment the lines in sortProjectDriver to test.
Search Project:
  1. Complete the linear search (BASIC)
  2. Complete the binary search (Intermediate)
  3. Complete the recursive version of binary search (Advanced)
*/

public class SortSearch{

    /* Sort project starts here */
    
    /* Instance Variables */
    private ArrayList<Integer> data;  // to store the data
    
    private Random r; 

    
    public SortSearch(){
	data = new ArrayList<Integer>();
	r = new Random();
	for (int i=0;i<15;i++){
	    data.add(r.nextInt(10000));
	}
	
    }
    
    public SortSearch(int size){
	data = new ArrayList<Integer>();
	r = new Random();
	for (int i=0;i<size;i++){
	    data.add(r.nextInt(10000));
	}
	
    }

    /* Convenience function to get data out of the ArrayList from the driver */
    public int get(int index){
	return this.data.get(index);
    }
    


    /*
      return the index of the smallest data item from index start to the end
      of the ArrayList. If there are multiple of the smallest value,
      return any of them.
      
      Example, if the arraylist has:
      5,3,10,6,8
      if start was 2 (start at index 2, value 10) then it would return 3
      which is the index of the value 6 which is the index with the
      smallest value from start to end
      On the other hand, if start was 0, then the method would
      return 1 since the value 3 is in index 1 and that is the smallest.
      
    */
  //smallIndex = the LOCATION of the values
    public int findSmallestIndex(int start){
	int smallIndex = start;
	for (int i = start; i< data.size(); i++){
    if (data.get(i) < data.get(smallIndex)){
      smallIndex = i;
    }
  }
	return smallIndex;
    }


    /**
       Implement the selection sort algorithm by sorting the ArrayList
       data in place.
       Algorithm:
       Loop a variable that represents the ArrayList index from
       0 to the end of the ArrayList.
         For each index, find the smallest from that Location
	 to the end of the array and swap it with that index.
	 Array named data, index is i, traverse the array
       
    */
    public void sort(){
      int smallIndex = 0;
      int temp =0;
      for (int i = 0; i < data.size(); i++){
        smallIndex = findSmallestIndex(i);
        // SWAP
        temp = data.get(smallIndex);
        data.set(smallIndex, data.get(i));
        data.set(i,temp);
        //}
      }


    }



    /* Search project starts here */
    
    /**
       performs a linear search. Returns the index of the first occurence of
       value in the ArrayList data or -1 if not found.
       This works by starting at the first element and searching one element at a time 
       until either the element is found or you've looked at all the elements.
       This algorithm works on any ArrayList.
    */
    public int linearSearch(int value){
      for (int i=0; i<data.size(); i++){
        if (value == data.get(i)){
          return i;    
        }
      }
      return -1;
    }
	
	 // replace this return
    
    /**
       Implement a binary search as specified by the comments
       
       This algorithm only works on sorted ArrayLists.
    */
    public int binarySearch(int value){
      int low = 0;
      int high = data.size()-1;
      int middle = (low + high)/2;
      int currentIndex = 0;
      int currentItem = data.get(currentIndex);
      int result = -1;
      while (low <= high){
        middle = (low + high)/2;
        currentIndex = middle;
        currentItem = data.get(currentIndex);
        if (currentItem == value){
          return currentIndex;
        }
        else{
          if (currentItem > value){
            high = currentIndex - 1;
            // Also change middle
          }
          else{
            low = currentIndex + 1;
            // Also change middle
          }
        }  
      }
      return -1;
    }


	// create assign variables  representing the high, low and middle indices 
	// while we're not done:
	//   if the item is at data.get(middle), return middle
	//   otherwise, update high, low, and middle

	// return 0;
	    
 //    }
    
    /**
       Implement a RECURSIVE binary search as specified by the comments
       
       This algorithm only works on sorted ArrayLists.
    */
//the parameters in binarySearchRecursive tell us that when running the program we have to include values in the driver for value, lowIndex, & highIndex 
    public int binarySearchRecursive(int value, int lowIndex, int highIndex){
      int middleIndex = (lowIndex + highIndex)/2;
      // Base case 1: Don't find it
      if (lowIndex > highIndex){//ending condition
        return -1;
      }
      // Base case 2: You found it
      else if (data.get(middleIndex) == value){
        return middleIndex;
      }
      // Recursive case 1: Value is below middle
      else if (data.get(middleIndex) > value ){
        return binarySearchRecursive(value, lowIndex, middleIndex -1);//the new high index (because it's a binarySearch). -1 still captures all (because we already checked the middleIndex ==value) 
      }
      // Recursive case 2: Value is above middle
      else { //less than the value
        return binarySearchRecursive(value, middleIndex +1, highIndex);
      }
    }
    
	
    public String toString(){
	return ""+data;
    };


    public void builtinSort(){
	Collections.sort(data);
	
    }
    

    
}


// int small = -1;
//       int temp = 0;
//       for (int i = 0; i<data.size(); i++){
//         for (int j = i + 1; j<data.size(); j++){
//           small = i;
//             if(this.data.get(j)<this.data.get(small)){
//               temp = this.data.get(i);
//               this.data.get(i) = this.data.get(j);
//               this.data.get(j) = temp;
            
