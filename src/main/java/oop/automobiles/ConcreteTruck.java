package oop.automobiles;

/*
 * A class which defines all Concrete Trucks.
 */
public final class ConcreteTruck extends Truck {
 
    // Constructor method for ConcreteTruck
    public ConcreteTruck(String license, int wheels) {
        super(license, wheels);
    }

    public void mixConcrete(String item) {
        this.getCargo().add(item);  // Adds items to the cargo list (loads and mixes concrete)
    }

    public void carryConcrete() {
        System.out.println("This truck can transport concrete to the construction site!");
        this.getCargo().clear();    // Clears all items from the cargo list (transports and dumps concrete at a site)
    }
}