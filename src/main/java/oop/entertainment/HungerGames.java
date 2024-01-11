package oop.entertainment;
/*
 * Creates a class keeping all characteristics from Fiction called HungerGames
 */
public class HungerGames extends Fiction{
   /*
    * Creates an instance of a Hunger Games book and stores a specific title
    */
    public HungerGames(String name) {
        this.setTitle(name);
    }
    /*
     * Adds the name to a list of other Harry Potter books
     */
    public void addName(String name){
        HungerGames number = new HungerGames(name);
        this.getStory().add(number);
    }
}
