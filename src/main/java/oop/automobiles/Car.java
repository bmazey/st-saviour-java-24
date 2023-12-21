package oop.automobiles;

public abstract class Car {
    
    private String License;

    public String getLicense() {
        return this.License;
    }

    public void setLicense(String license) {
        this.License = license;
    }

    public String drive(String destination) {
        return this.License + " drives to " + destination + "!";
    }

}
