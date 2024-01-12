package oop.entertainment;

import java.util.ArrayList;
import java.util.List; 
/*
 * Creates a class keeping all characteristics from Books called Fiction
 */
public abstract class Fiction extends Books{
    /*
     * Creates a new list of fiction books
     */
    private List<Fiction> Story = new ArrayList<Fiction>();
    /*
     * Calls a specific story from the list Fiction
     */
    public List<Fiction> getStory() {
        return this.Story;
    }
}
