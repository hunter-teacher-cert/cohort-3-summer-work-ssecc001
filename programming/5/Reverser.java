/**
 * Recursive String Reverser by Team Palindromotosis
 * First Last
 * collaborators: First Last, First Last
 */

// public void reverseString() {
//     String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//     String reverseAlphabet = reverse(alphabet, alphabet.length()-1);
// }

// String reverse(String stringToReverse, int index){
//     if(index == 0){
//         return stringToReverse.charAt(0) + "";
//     }

//     char letter = stringToReverse.charAt(index);
//     return letter + reverse(stringToReverse, index-1);
// }

public class Reverser
{
  /**
     String reverseF(String) -- recursive String reverser
     precond:  input String is non-empty
     postcond: returns input String with chars in reverse order
  */
  public static String reverseR( String s )
  {
    /* YOUR SIMPLE, SMART IMPLEMENTATION HERE */
  }


  public static void main( String[] args )
  {
    System.out.println( reverseR("odd") );
    System.out.println( reverseR("even") );
    System.out.println( reverseR("abcdefg") );
    System.out.println( reverseR("stressed") );
    System.out.println( reverseR("amanaplanacanalPanama") );

    //more tests welcome
    // got some good palindromes?
  }
}