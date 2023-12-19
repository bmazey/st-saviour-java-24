package oop.automobiles;

public final class DumpTruck extends Truck {
    
    public DumpTruck(String drive) {
        this.setDrive(drive);
    }

    public void dumpGarbage(String drive) {
        DumpTruck waste = new DumpTruck(drive);
        this.getLarge().add(waste);
    }

    
}