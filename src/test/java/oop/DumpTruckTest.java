package oop;

import org.junit.jupiter.api.Test;

import oop.automobiles.DumpTruck;
import oop.automobiles.Truck;

public class DumpTruckTest {

    @Test
    public void testTruck() {
        Truck myTruck = new Truck("CSTUDENT", 18);

        DumpTruck myDumpTruck = new DumpTruck("CSTUDENT", 18);
    }
    
}
