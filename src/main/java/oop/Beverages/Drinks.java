package oop.Beverages;

public class Drinks {
    
    private String Flavor;

    public String getFlavor(){
        return this.Flavor;
    }
    
    public void setFlavor(String Flavor){
        this.Flavor = Flavor;
    }

        

    public String smell (String scent){
        String text = this.Flavor + " smells like " + scent + "!";
        return text;
    }
}

