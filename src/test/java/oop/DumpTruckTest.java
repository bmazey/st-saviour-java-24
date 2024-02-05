package oop;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import oop.automobiles.DumpTruck;
import oop.automobiles.Manual;

public class DumpTruckTest {

    @Test
    public void testNewDumpTruck() {
        // Create a new DumpTruck instance with a specific license plate and number of wheels
        DumpTruck myDumpTruck = new DumpTruck("NYCJAVAGIRL",  8);

        // Check the license plate
        assertEquals("NYCJAVAGIRL", myDumpTruck.getLicense());

        // Check the number of wheels
        assertEquals(8, myDumpTruck.getWheels());

        // Load garbage into the DumpTruck and check the size of the cargo list
        myDumpTruck.loadGarbage("Trash");
        assertEquals(1, myDumpTruck.getCargo().size());

        // Dump all the garbage from the DumpTruck and check if the cargo list is empty
        myDumpTruck.dumpGarbage();
        assertEquals(true, myDumpTruck.getCargo().isEmpty());

        // Assert that the DumpTruck is manual (uses a stickshift)
        assertEquals(true, myDumpTruck.isManual());

        // Assert that the DumpTruck is an instance of the Manual class
        assert myDumpTruck instanceof Manual;
    }
}
