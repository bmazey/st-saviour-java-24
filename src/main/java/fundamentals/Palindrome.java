package fundamentals;

public class Palindrome {
    /*
     * A palindrome is a word that retains the same spelling when reversed.
     * Our Palindrome class contains a method isPalindrome() which takes a String and returns ...
     *     - True if the given word is a valid palindrome
     *     - False if the given word is NOT a valid palindrome
     */

     public static boolean isPalindrome(String word) {
        // TODO - implement isPalindrome() method
        String reversed = "";
        //creates an empty string variable called reversed
        for(int i=0; i< word.length(); i++){
         //a for loop that goes through each index in word
         reversed = word.charAt(i) + reversed;
         //creates a new variable that takes the last index of word and adds it to reversed
        }
        return word.equals(reversed);
        //returns true if word equals reversed and false if not
     }
}
