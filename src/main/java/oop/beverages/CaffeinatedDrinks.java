package oop.beverages;

/**
 * A class defines all CaffinatedDrinks from Drinks
 */
public abstract class CaffeinatedDrinks extends Drinks {

    /**
     * new boolean that declares all Caffinated Drinks have caffine
     */
    private final boolean HAS_CAFFINE = true;

    public boolean isCaffeinated() {
        return this.HAS_CAFFINE;
    }
}