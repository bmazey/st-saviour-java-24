package fundamentals;

public class Palindrome {
    /*
     * A palindrome is a word that retains the same spelling when reversed.
     * Our Palindrome class contains a method isPalindrome() which takes a String and returns ...
     *     - True if the given word is a valid palindrome
     *     - False if the given word is NOT a valid palindrome
     */

     public static boolean isPalindrome(String word) {
<<<<<<< HEAD
         String reverse = "";

         for (int i = 0; i < word.length(); i++) {
            reverse = word.charAt(i) + reverse;
         }
         System.out.println("Word: " + word);
         System.out.println("Reverse: " + reverse);

         return word.equals(reverse);
     }}
=======
        String reverse = "";

        for(int i = 0; i < word.length(); i++) {
         reverse = word.charAt(i) + reverse;
        }

        return word.equals(reverse);
     }
}
>>>>>>> 94827c21a4dc9fd842f94efbed1836e7d2857e24
