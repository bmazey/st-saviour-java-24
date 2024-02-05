package oop.automobiles;

/*
 * A class which defines all Dump Trucks.
 */
public final class DumpTruck extends Truck {

    // Constructor method for DumpTruck
    public DumpTruck(String license, int wheels) {
        super(license, wheels);
    }

    public void loadGarbage(String item) {
        this.getCargo().add(item);  // Adds items to the cargo list (loads garbage)
    }

    public void dumpGarbage() {
        this.getCargo().clear();    // Removes all items from the cargo list (dumps all the garbage)
    }
}