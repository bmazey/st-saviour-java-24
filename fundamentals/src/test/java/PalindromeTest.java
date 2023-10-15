import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PalindromeTest {

    @Test
    public void testValidPalindrome() {
        assertEquals(true, Palindrome.isPalindrome("racecar"));
        assertEquals(true, Palindrome.isPalindrome("civic"));
        assertEquals(true, Palindrome.isPalindrome("radar"));
        // TODO - add more test cases ...
    }

    @Test
    public void testInvalidPalindrome() {
        assertEquals(false, Palindrome.isPalindrome("robot"));
        assertEquals(false, Palindrome.isPalindrome("kitten"));
        assertEquals(false, Palindrome.isPalindrome("milkshake"));
        // TODO - add more test cases ...
    }
}
