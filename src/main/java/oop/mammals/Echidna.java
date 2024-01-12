package oop.mammals;

/**
 * A class which defines all Monotremes.
 */
public final class Echidna extends Monotreme {
    
    // Constructor method for Echidna.
    public Echidna(String name) {
        this.setName(name);
    }

    // layEgg() creates a new Echidna from a name, and adds it to the nest.
    public void layEgg(String name) {
        Echidna baby = new Echidna(name);
        this.getNest().add(baby);
    }

    // hatch() removes the first Echidna in the nest.
    public Echidna hatch() throws Exception {
        // Check to see if nest is empty.
        if (this.getNest().isEmpty()) {
            new Exception(this.getName() + "'s nest is empty!");
        }
        
        Echidna baby = (Echidna)this.getNest().remove(0);
        return baby;
    }
}