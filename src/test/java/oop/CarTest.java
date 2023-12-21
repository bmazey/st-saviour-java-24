package oop;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import oop.automobiles.SportsCar;

public class CarTest {

    @Test
    public void testCar() {
        // Car bugatti = new Car();
        SportsCar bugatti = new SportsCar("CSTUDENT", 100);

        assertEquals(bugatti.drive("Atlanta"), "CSTUDENT drives to Atlanta! Wow so fast!");
    }
    
}
