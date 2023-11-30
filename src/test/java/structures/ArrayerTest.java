package structures;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ArrayerTest {

    @Test
    public void testEvensOnly() {
        int[] test = {5, 8, 17, 21, 15, 0, 6};
        int[] result = Arrayer.evensOnly(test);

        assertEquals(8, result[0]);
        assertEquals(0, result[1]);
        assertEquals(6, result[2]);
        assertEquals(3, result.length);

        int[] second = {0, 2, 4, 7, 8, 11};
        result = Arrayer.evensOnly(second);

        assertEquals(0, result[0]);
        assertEquals(2, result[1]);
        assertEquals(4, result[2]);
        assertEquals(8, result[3]);
        assertEquals(4, result.length);
    }

    @Test
    public void testLastOfFourDigits() {
        int[] test = {1200, 4343, 1789, 1897};
        int[] result = Arrayer.lastOfFourDigits(test);

        assertEquals(0, result[0]);
        assertEquals(3, result[1]);
        assertEquals(9, result[2]);
        assertEquals(7, result[3]);
        assertEquals(4, result.length);

        int[] second = {3333, 1777, 4587, 6500, 1999};
        result = Arrayer.lastOfFourDigits(second);

        assertEquals(3, result[0]);
        assertEquals(7, result[1]);
        assertEquals(7, result[2]);
        assertEquals(0, result[3]);
        assertEquals(9, result[4]);
        assertEquals(5, result.length);
    }

    @Test
    public void testRoundUp() {
        double[] test = {1.2, 0.4, 7.6, 8.9, 9.1};
        int[] result = Arrayer.roundUp(test);

        assertEquals(1, result[0]);
        assertEquals(0, result[1]);
        assertEquals(8, result[2]);
        assertEquals(9, result[3]);
        assertEquals(9, result[4]);

        double[] second = {0.5, 1.2};
        result = Arrayer.roundUp(second);

        assertEquals(1, result[0]);
        assertEquals(1, result[1]);
    }

    @Test
    public void testFindNegative() {
        int[] test = {2, 0, 4, 16};
        int result = Arrayer.findNegative(test);

        assertEquals(-1, result);

        int[] second = {0, 13, 3, -4, 7, 11};
        result = Arrayer.findNegative(second);

        assertEquals(3, result);
    }

    @Test
    public void testEveryOther() {
        int [] test = {}
    }
}
