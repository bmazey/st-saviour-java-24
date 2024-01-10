package oop.automobiles;

public final class DumpTruck extends Truck {

    public DumpTruck(String license, int wheels) {
        // super(license, wheels);
        this.setLicense(license);
        this.setWheels(wheels);
    }

    // public void Dumptruck(String item) {
    //     Dumptruck waste = new DumpTruck(item, getWheels());
    //     this.getLicense();
    // }
}