package fundamentals;

public class Palindrome {
    /*
     * A palindrome is a word that retains the same spelling when reversed.
     * Our Palindrome class contains a method isPalindrome() which takes a String and returns ...
     *     - True if the given word is a valid palindrome
     *     - False if the given word is NOT a valid palindrome
     */
// Take word and reverse it then use the isPalndrome method to return true(Palindrome) or false(Not Palindrome)
    public static boolean isPalindrome(String word) {
        String reverse = "";

        for (int i = 0; i < word.length(); i++) {
            reverse = word.charAt(i) + reverse;
        }
// Print word + its reverse 
        System.out.println("Word: " + word);
        System.out.println("Reverse: " + reverse);

        return word.equals(reverse);
    }
}
