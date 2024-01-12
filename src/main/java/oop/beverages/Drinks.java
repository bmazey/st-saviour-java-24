package oop.beverages;

public abstract class Drinks {

    private String Flavor;

   /* *
    * Getter property
    */
    public String getFlavor() {
        return this.Flavor;
    }

    public void setFlavor (String Flavor){
        /* *
         * Setter property
         */
        this.Flavor = Flavor; 
    }


   /* *
    * All drinks have a scent
    */
    public String Drink (String scent) {
        String text = this.Flavor + "smells like" + scent + "!";
        return text; 
    }

}
