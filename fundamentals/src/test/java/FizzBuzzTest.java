import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FizzBuzzTest {

    @Test
    public void testMultipleOfThree() {
        assertEquals("fizz", FizzBuzz.fizzBuzz(231));
        // TODO - add more test cases ...
    }

    @Test
    public void testMultipleOfFive() {
        assertEquals("buzz", FizzBuzz.fizzBuzz(440));
        // TODO - add more test cases ...
    }

    @Test
    public void testMultipleOfThreeAndFive() {
        assertEquals("fizzbuzz", FizzBuzz.fizzBuzz(101640));
        // TODO - add more test cases ...
    }

}