package oop.automobiles;

/*
 * A class which defines all Manual Cars.
 */
public class Manual extends Car {
    
    // All manual cars have a manual stickshift
    private final boolean MANUAL_STICKSHIFT = true;

    // Method to determine whether the car is manual or not
    public boolean isManual() {
        return MANUAL_STICKSHIFT;
    }
}
