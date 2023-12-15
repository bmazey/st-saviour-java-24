package oop.Beverages;

public final class Latte extends Coffee{
    
    public Latte(String Flavor){
        this.setFlavor(Flavor);
    }

    public void PlaceOrder(String Flavor){
        Latte OrderNumber = new Latte (Flavor);
        this.getOrder().add(OrderNumber);
    }

    public Latte TakeOrder() throws Exception{
        if (this.getOrder().isEmpty()){
            new Exception (this.getFlavor() + " doesn't exist.");
        }

        Latte OrderNumber = (Latte).getOrder().remove(0);
        return OrderNumber;
    }
}
