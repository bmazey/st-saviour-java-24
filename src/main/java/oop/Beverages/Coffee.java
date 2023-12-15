package oop.Beverages;

import java.util.ArrayList;
import java.util.List;

public abstract class Coffee extends CaffinatedDrinks {

    private List<Coffee> Order = new ArrayList <Coffee>();

    public List <Coffee> getOrder(){
        return this.Order;
    }
    
}