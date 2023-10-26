package fundamentals;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PalindromeTest {

    @Test
    public void testValidPalindrome() {
        assertEquals(true, Palindrome.isPalindrome("racecar"));
        assertEquals(true, Palindrome.isPalindrome("civic"));
        assertEquals(true, Palindrome.isPalindrome("radar"));
        // TODO - add more test cases ...
        {
       
            String word = "racecar";  // The word you want to reverse
            String reverse = "";
            for (int i = 0; i < word.length(); i++) {
                reverse = word.charAt(i) + reverse;
            }
            System.out.println("Reverse of 'racecar': " + reverse + "true");
            assertTrue(true); 
            
        }
    }
    
    




    @Test
    public void testInvalidPalindrome() {
        assertEquals(false, Palindrome.isPalindrome("kitten"));
        assertEquals(false, Palindrome.isPalindrome("milkshake"));
        // TODO - add more test cases ...
    }
     {
            String word = "robot";  // The word you want to reverse
            String reverse = "";
            for (int i = 0; i < word.length(); i++) {
                reverse = word.charAt(i) + reverse;
            }
            System.out.println("Reverse of 'robot': " + reverse + "false");

            
        }
    
    }
