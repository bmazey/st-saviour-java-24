package oop.beverages;

public final class Latte extends Coffee {
    public Latte(String Flavor) {
        this.setFlavor(Flavor);
    }

    private void setFlavor(String flavor) {
    }

    /**
     * Place order
     */
    public void PlaceOrder(String name) {
        Latte ordernumber = new Latte(name);
        this.getOrder().add(ordernumber);
    }
    public Latte takeOrder() throws Exception {
        
        if (this.getOrder().isEmpty()) {
            new Exception(this.getOrder() + "no order!");
        }

        Latte ordernumber = (Latte)this.getOrder().remove(0);
        return ordernumber;
    }
}