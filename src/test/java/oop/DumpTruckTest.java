package oop;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import oop.automobiles.DumpTruck;
import oop.automobiles.Manual;

public class DumpTruckTest {

    @Test
    public void testTruck() {
        DumpTruck myDumpTruck = new DumpTruck("NYCJAVAGIRL",  8);

        assertEquals("NYCJAVAGIRL", myDumpTruck.getLicense());

        assertEquals(8, myDumpTruck.getWheels());

        myDumpTruck.loadGarbage("Trash");
        assertEquals(1, myDumpTruck.getCargo().size());

        myDumpTruck.dumpGarbage(null);
        assertEquals(true, myDumpTruck.getCargo().isEmpty());

        assertEquals(true, myDumpTruck.isManual());

        assert myDumpTruck instanceof Manual;
    }
}
