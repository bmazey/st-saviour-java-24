package oop.mammals;

import oop.Animal;

/**
 * A class which defines all Mammals.
 */
public abstract class Mammal extends Animal {

    // All Mammals are warm blooded.
    private final boolean WARM_BLOODED = true;

    public boolean isWarmBlooded() {
        return WARM_BLOODED;
    }
}
