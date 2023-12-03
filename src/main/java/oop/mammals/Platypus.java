package oop.mammals;

/**
 * A class which defines all Platypus.
 */
public final class Platypus extends Monotreme {
    
    // Constructor method for Platypus.
    public Platypus(String name) {
        this.setName(name);
    }

    // layEgg() creates a new Platypus from a name, and adds it to the nest.
    public void layEgg(String name) {
        Platypus baby = new Platypus(name);
        this.getNest().add(baby);
    }

    // hatch() removes the first Platypus in the nest.
    public Platypus hatch() throws Exception {
        // Check to see if nest is empty.
        if (this.getNest().isEmpty()) {
            new Exception(this.getName() + "'s nest is empty!");
        }

        Platypus baby = (Platypus)this.getNest().remove(0);
        return baby;
    }
}
