package oop.Beverages;

import oop.Drinks;

public abstract class CaffinatedDrinks extends Drinks {

    private final boolean HAS_CAFFINE = true;

    public boolean isCaffinated() {
        return HAS_CAFFINE;
    }
}