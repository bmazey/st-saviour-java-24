package oop.beverages;

/**
 * New class created to define all Cappuccinos from Coffee
 */
public final class Cappuccino extends Coffee{
    
    /**
     * Constructor method to obtain flavor for Cappuccino
     * @param Flavor
     */
    public Cappuccino (String Flavor){
        this.setFlavor(Flavor);
    }

    /**
     * PlaceOrder() creates new Cappuccino and places it into an order queue
     * @param Flavor
     */
    public void PlaceOrder(String Flavor){
        Cappuccino OrderNumber = new Cappuccino (Flavor);
        this.getOrder().add(OrderNumber);
    }

    /**
     * TakeOrder() removes Cappucino from queue and returns order number
     */
    public Cappuccino TakeOrder() throws Exception{

        /**
         * if statement checks if queue is empty
         */
        if (this.getOrder().isEmpty()){
            new Exception (this.getFlavor() + " doesn't exist.");
        }

        Cappuccino OrderNumber = (Cappuccino)this.getOrder().remove(0);
        return OrderNumber;
    }
}
