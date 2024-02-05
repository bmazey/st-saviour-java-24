package oop;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import oop.automobiles.ConcreteTruck;
import oop.automobiles.Manual;

public class ConcreteTruckTest {

    @Test
    public void testNewConcreteTruck() {
        // Create a new ConcreteTruck instance with a specific license plate and number of wheels
        ConcreteTruck myConcreteTruck = new ConcreteTruck("STSAVIOURJAVA", 6);

        // Check the license plate
        assertEquals("STSAVIOURJAVA", myConcreteTruck.getLicense());

        // Check the number of wheels
        assertEquals(6, myConcreteTruck.getWheels());

        // Add and mix concrete in the ConcreteTruck and check the size of the cargo list
        myConcreteTruck.mixConcrete("HighPowerConcreteMixer");
        assertEquals(1, myConcreteTruck.getCargo().size());
        
        // Dump all of the transported concrete and check if the cargo list is empty
        myConcreteTruck.carryConcrete();
        assertEquals(true, myConcreteTruck.getCargo().isEmpty());

        // Assert that the ConcreteTruck is manual (uses a stickshift)
        assertEquals(true, myConcreteTruck.isManual());

        // Assert that the ConcreteTruck is an instance of the Manual class
        assert myConcreteTruck instanceof Manual;
    }
}
