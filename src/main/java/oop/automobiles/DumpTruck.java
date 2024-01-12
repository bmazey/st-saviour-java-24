package oop.automobiles;

public final class DumpTruck extends Truck {

    // Using constructor method for DumpTruck
    public DumpTruck(String license, int wheels) {
        super(license, wheels);
    }

    public void loadGarbage(String item) {
        this.getCargo().add(item);  // Adds an item to the cargo list (loads garbage)
    }

    public void dumpGarbage(String item) {
        this.getCargo().clear();    // Removes all items from the cargo list (dumps all the garbage)
    }
}