package oop.beverages;

/**
 * New class that defines all Lattes from Coffee
 */
public final class Latte extends Coffee{
    
    /**
     * Contructor method to obtain flavor for Latte
     * @param Flavor
     */
    public Latte(String Flavor){
        this.setFlavor(Flavor);
    }

    /**
     * PlaceOrder() creates new Latte and places it into the order queue
     * @param Flavor
     */
    public void PlaceOrder(String Flavor){
        Latte OrderNumber = new Latte (Flavor);
        this.getOrder().add(OrderNumber);
    }

    /**
     * TakeOrder() removes first Latte from order queue and returns the order number
     */
    public Latte TakeOrder() throws Exception{
        /**
         * If statement checks if order queue is empty
         */
        if (this.getOrder().isEmpty()){
            new Exception (this.getFlavor() + " is out of stock.");
        }

        Latte OrderNumber = (Latte)this.getOrder().remove(0);
        return OrderNumber;
    }
}
