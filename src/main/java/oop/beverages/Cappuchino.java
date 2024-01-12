package oop.beverages;

/**
 * New class that defines all Lattes from Coffee
 */
public final class Cappuchino extends Coffee{

    private String flavor;
    
    /**
     * Contructor method to obtain flavor for Latte
     * @param Flavor
     */
    public Cappuchino(String flavor){
        this.flavor = flavor;
    }

    private void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    /**
     * PlaceOrder() creates new Latte and places it into the order queue
     * @param Flavor
     */
    public void PlaceOrder(String Flavor){
        Cappuchino OrderNumber = new Cappuchino (Flavor);
        this.getOrder().add(OrderNumber);
    }

    /**
     * TakeOrder() removes first Latte from order queue and returns the order number
     */
    public Cappuchino TakeOrder() throws Exception{
        /**
         * If statement checks if order queue is empty
         */
        if (this.getOrder().isEmpty()){
            new Exception (this.getFlavor() + " is out of stock.");
        }

        Cappuchino OrderNumber = (Cappuchino)this.getOrder().remove(0);
        return OrderNumber;
    }

    public String getFlavor() {
        return this.flavor;
    }

    public String smell(String fragrance) {
        return this.flavor + " smells " + fragrance + "!";
    }
}