package oop.beverages;


public abstract class CaffeinatedDrinks {

    /**
     * All caffeinated drinks have caffeine
     */  
    private final boolean HAS_CAFFEINE = true;
    /**
     * Return caffeinated if true
     */
    public boolean isCaffienated() {
        return this.HAS_CAFFEINE; 
    }
}
    