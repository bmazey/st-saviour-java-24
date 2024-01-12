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

        assertEquals(6, myConcreteTruck.getWheels());
        
        myConcreteTruck.mixConcrete("HighPowerConcreteMixer");
        assertEquals(1, myConcreteTruck.getCargo().size());

        myConcreteTruck.carryConcrete(null);
        assertEquals(true, myConcreteTruck.getCargo().isEmpty());

        assertEquals(true, myConcreteTruck.isManual());

        assert myConcreteTruck instanceof Manual;
    }
}