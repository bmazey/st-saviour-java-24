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
>>>>>>> d45f76c0e167894edabe5dc290ecf0665ae10dd2
