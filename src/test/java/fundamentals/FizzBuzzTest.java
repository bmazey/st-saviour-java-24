package fundamentals;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    @Test
    public void testMultipleOfThree() {
        assertEquals("fizz", FizzBuzz.fizzBuzz(231));
    }

    @Test
    public void testMultipleOfFive() {

        assertEquals("buzz", FizzBuzz.fizzBuzz(440));
    }

    @Test
    public void testMultipleOfThreeAndFive() {
        assertEquals("fizzbuzz", FizzBuzz.fizzBuzz(101640));
    }

    @Test
    public void testMultipleOfNothing() {
        assertEquals("", FizzBuzz.fizzBuzz(1));
    }
}


