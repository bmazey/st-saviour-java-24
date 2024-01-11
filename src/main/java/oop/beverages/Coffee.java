package oop.beverages;

import java.util.ArrayList;
import java.util.List;

/**
 * This class defines all Coffees from CaffinatedDrinks
 */
public abstract class Coffee extends CaffeinatedDrinks {

    /**
     * Creates new list of Coffee blends
     */
    private List<Coffee> Blends = new ArrayList <Coffee>();

    /**
     * creates a 'getter' methods for blends
     * @return
     */
    public List <Coffee> getOrder(){
        return this.Blends;
    }
    
}