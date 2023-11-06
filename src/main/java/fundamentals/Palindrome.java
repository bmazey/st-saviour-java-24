package fundamentals;

public class Palindrome {
    /*
     * A palindrome is a word that retains the same spelling when reversed.
     * Our Palindrome class contains a method isPalindrome() which takes a String and returns ...
     *     - True if the given word is a valid palindrome
     *     - False if the given word is NOT a valid palindrome
     */

     /**
    * 
    */
    
      public static boolean isPalindrome(String word) {
         // implements the isPalindrome method
         String reverse = "";
         // sets up an empty string called reverse
         for (int i =0; i < word.length(); i++){
            reverse = word.charAt(i) + reverse;
         // says that for each letter in the word until the endof the word 
         // is reached, that letter will be added to the end of reverse
         }
         return word.equals(reverse);
         // uses the equals method, which is a boolean, to return true if the 
         // word is the same as its reverse, or false if it isnt. 


         
         
     }
}
