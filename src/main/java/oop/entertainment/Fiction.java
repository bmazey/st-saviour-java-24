package oop.entertainment;

import java.util.ArrayList;
import java.util.List;
/*
 * creates a class called fiction which has the same characteristics from books. 
 */
public abstract class Fiction extends Books {
    /*
     * creates a new list of fiction books. 
     */
    private List <Fiction> Story = new ArrayList<Fiction>();
    /*
     * calls a specific story from the list of fiction. 
     */
    public List <Fiction> getStory() {
        return this.Story;
    }
}


    

