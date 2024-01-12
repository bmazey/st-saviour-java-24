package oop.automobiles;

public final class ConcreteTruck extends Truck {
 
    // Using constructor method for ConcreteTruck
    public ConcreteTruck(String license, int wheels) {
        super(license, wheels);
    }

    public void mixConcrete(String item) {
        this.getCargo().add(item);  // Adds an item to the cargo list (loads and mixes concrete)
    }

    public void carryConcrete(String item) {
        System.out.println("This truck can transport concrete to the construction site!");
        this.getCargo().clear();    // Clears all items from the cargo list (transports concrete to a site)
    }
}