package oop.automobiles;

public class SportsCar extends Car {

    private int speed;

    public SportsCar(String license, int speed) {
        this.setLicense(license);
        this.speed = speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return this.speed;
    }

    public String drive(String destination) {
        if (this.speed <= 5) {
            return this.getLicense() + " drives to " + destination + "!";
        } else {
            return this.getLicense() + " drives to " + destination + "! Wow so fast!";
        }
    }
    
}
