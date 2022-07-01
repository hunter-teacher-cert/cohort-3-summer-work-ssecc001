import java.io.*;
import java.util.*;

public class Nim
{
  public static void main( String[] args)
  {
    int stones = 12;
    int stonesTaken;
    Scanner in = new Scanner(System.in);
    //loop until game ends
    while(stones > 0 ){
      // prompt user for input : user taking turn
      System.out.println("Please enter a number from 1-3");
      stonesTaken = in.nextInt(); 
      in. nextLine();//taking from the user I
    
      // caculate the number of stones remaining.
      //print
      stones = stones - stonesTaken;
      System.out.println("There are " + stones + " left");
      //stones -= stonesTaken;
      
      //check for did I win??
      if(stones <= 0 )
      {
        System.out.println("You win!");
        
      }
        
      //machine turn
      System.out.println("Computers Turn");
      stonesTaken = (int)(Math.random()*3)+1;
      //Math.random()(max - min +1) + min
      stones = stones - stonesTaken;
      System.out.println("The Computer took " + stonesTaken);
      // caculate the number of stones remaining.
      //print
      System.out.println("There are " + stones + " left");
      //check for the win
      if(stones <= 0 )
      {
        System.out.println("Computer wins!");
        
      }
      
    }
  }
}