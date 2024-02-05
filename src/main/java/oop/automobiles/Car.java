package oop.automobiles;

/*
 * A class which defines all Cars.
 */
public abstract class Car {
    
    // All cars have a license
    private String license;

    // All cars have wheels
    private int wheels;

    // Setter method for license property
    public void setLicense(String license) {
        this.license = license;
    }
    
    // Getter method for license property
    public String getLicense() {
        return this.license;
    }

    // Setter method for wheels property
    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    // Getter method for wheels property
    public int getWheels() {
        return this.wheels;
    }
}
