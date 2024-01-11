package oop;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import oop.automobiles.ConcreteTruck;
import oop.automobiles.Manual;

public class ConcreteTruckTest {

    @Test
    public void testNewConcreteTruck() {
        ConcreteTruck myConcreteTruck = new ConcreteTruck("STSAVIOURJAVA", 6);

        assertEquals("STSAVIOURJAVA", myConcreteTruck.getLicense());

        assertEquals(8, myConcreteTruck.getWheels());

    }
}
