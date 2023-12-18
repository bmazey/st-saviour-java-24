package oop.automobiles;

import java.util.ArrayList;
import java.util.List;

public abstract class Truck extends Manual {
    private List<Truck> sizeLarge = new ArrayList<Truck> ();

    public List<Truck> getLarge() {
        return this.sizeLarge;
    }
}
    

