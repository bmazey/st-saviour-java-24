package oop.Juice;

/**
 * A class which defines all Monotremes.
 */
public final class AppleJuice extends Juice {
    
    // Constructor method for Echidna.
    public AppleJuice.Drink(String name) {
        this.setName(name);
    }

    // layEgg() creates a new Echidna from a name, and adds it to the nest.
    public void Drink Juice(String name) {
        Apple Juice = new Drink(name);
        this.getDrink().add(juice);
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