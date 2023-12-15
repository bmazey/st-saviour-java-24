package oop.Beverages;

public final class Cappuccino extends Coffee{
    
    public Cappuccino (String Flavor){
        this.setFlavor(Flavor);
    }

    public void PlaceOrder(String Flavor){
        Cappuccino OrderNumber = new Cappuccino (Flavor);
        this.getOrder().add(OrderNumber);
    }

    public Cappuccino TakeOrder() throws Exception{
        if (this.getOrder().isEmpty()){
            new Exception (this.getFlavor() + " doesn't exist.");
        }

        Cappuccino OrderNumber = (Cappuccino).getOrder().remove(0);
        return OrderNumber;
    }
}
