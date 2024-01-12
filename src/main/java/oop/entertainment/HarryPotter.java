package oop.entertainment;
/*
 * Creates a class keeping all characteristics from Fiction called HarryPotter
 * This class is final- nothing is extended from it
 */
public final class HarryPotter extends Fiction{
    /* 
     * Creates an instance of a Harry Potter book and stores a specific title
     */
    public HarryPotter(String name) {
        this.setTitle(name);
    }
    /*
     * Adds the name to a list of other Harry Potter books
     */
    public void addName(String name){
        HarryPotter number = new HarryPotter(name);
        this.getStory().add(number);
    }
}
