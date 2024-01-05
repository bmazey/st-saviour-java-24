package oop.automobiles;

public abstract class Car {

    private String license;

    private int wheels;

    public void setLicense(String license) {
        this.license = license;
    }

    public String getLicense() {
        return this.license;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getWheels() {
        return this.wheels;
    }
}
