package oop.beverages;

import java.util.ArrayList;
import java.util.List;

public abstract class Coffee extends CaffeinatedDrinks {

    /* *
     * New array list for coffee
     */
    
    private List<Coffee> Blends = new ArrayList<Coffee>();

    /* *
     * Get order
     */
    public List<Coffee> getOrder() {
        return this.Blends;
    }
}