package oop.automobiles;

public abstract class Manual extends Car {
    
    private final boolean MANUAL_STICKSHIFT = true;

    public boolean isManual() {
        return MANUAL_STICKSHIFT;
    }

}
