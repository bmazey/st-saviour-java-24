package oop.automobiles;

public final class DumpTruck extends Truck {

    public DumpTruck(String license, int wheels) {
        super(license, wheels);
    }
    
    public void loadGarbage(String item) {
        this.getCargo().add(item);
    }

    public void dumpGarbage(String item) {
        this.getCargo().clear();
    }
}
