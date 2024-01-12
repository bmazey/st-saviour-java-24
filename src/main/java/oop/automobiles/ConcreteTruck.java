package oop.automobiles;

public final class ConcreteTruck extends Truck {

    // Constructor method for 
    public ConcreteTruck(String license, int wheels) {
        super(license, wheels);
    }

    public void mixConcrete(String item) {
        this.getCargo().add(item);
    }

    public void carryConcrete(String item) {
        System.out.println("This truck can transport concrete to the construction site!");
        this.getCargo().clear();
    }
}