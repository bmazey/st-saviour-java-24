package oop.mammals;

import java.util.ArrayList;
import java.util.List;

/*
 * A class which defines all Monotremes.
 */
public abstract class Monotreme extends Mammal {

    // Monotremes lay eggs!
    private List<Monotreme> Nest = new ArrayList<Monotreme>();

    // 'getter' method for Eggs list.
    public List<Monotreme> getNest() {
        return this.Nest;
    }
}
