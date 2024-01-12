package oop.entertainment;

import oop.entertainment.HungerGames;
/*
 * Creates a new class called hunger games which has the same characteristics from fiction. 
 */
public final class HungerGames extends Fiction {
    /*
     * creates a specific instance of a hunger games book and gives it a name. 
     */
    public HungerGames (String name) {
        this.setTitle (name);
    }
    /*
     * adds the name of the book to a list of hunger games books. 
     */
    public void addName(String name) {
        HungerGames number = new HungerGames(name);
        this.getStory().add(number);
    }
}
