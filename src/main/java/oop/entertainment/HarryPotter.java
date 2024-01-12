package oop.entertainment;

import oop.entertainment.HarryPotter;
/*
 * Creates a new class called harry potter which has the same characteristics from fiction. 
 * Because it is final, nothing can be extended from it. 
 */
public final class HarryPotter extends Fiction {
    /*
     * creates an instance of a harry potter book and gives it a name. 
     */
    public HarryPotter (String name) {
        this.setTitle (name);
    }
    /*
     * Adds the name of the book to a list of harry potter books. 
     */
    public void addName(String name) {
        HarryPotter number = new HarryPotter(name);
        this.getStory().add(number);
    }
}
