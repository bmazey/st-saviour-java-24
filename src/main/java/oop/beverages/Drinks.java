package oop.beverages;

/**
 * A class that defines all drinks
 */
public class Drinks {

    /**
     * Creates new variable, all drinks have flavors
     */ 
    private String Flavor;

    /**
     * Getter methods created in order to call upon this.Flavor
     * @return
     */
    public String getFlavor(){
        return this.Flavor;
    }

    /**
     * Setter method allows for this.Flavor to be defined after being called
     */
    public void setFlavor(String Flavor){
        this.Flavor = Flavor;
    }

        
    /**
     * Creates new method 'smell' for all future classes. Drinks can have a scent.
     * @param scent
     * @return
     */
    public String smell(String scent){
        String text = this.Flavor + " smells like " + scent + "!";
        return text;
    }
}

