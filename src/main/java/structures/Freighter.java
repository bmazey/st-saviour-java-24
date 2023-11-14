package structures;

import java.util.ArrayList;
import java.util.List;

/*
 * Picture a freighter - a large ship used to transport containers on transoceanic
 * voyages. When the containers are initially loaded on the ship, they are stacked
 * one on top of the other. This implies that the first containers to be loaded on
 * the ship are the last containers to be unloaded upon reaching the destination.
 * 
 * This common data structure is (unsurprisingly) referred to as a Stack in Computer
 * Science. In this exercise we'll be implementing a simple Stack using ArrayList
 * in Java.
 */
public class Freighter {

    // the list of all containers
    private List<String> Containers;

    // constructor method for Freighter - notice the use of keyword "this"
    public Freighter() {
        this.Containers = new ArrayList<String>();
    }

    // push() adds an item to the Containers list; pay close attention to the order!
    public void push(String item) {
        // TODO implement push()
    }

    // pop() removes an item from the Containers list; pay close attention to the order!
    // pop() should return an empty String instead of an error if you try to pop an
    // item off an empty Containers stack
    public String pop() {
        // TODO implement pop()
        return "";
    }

    // top() reads the next item to be unloaded from Containers
    public String top() {
        // TODO implement top()
        return "";
    }

    // bottom() reads the final item to be unloaded from Containers
    public String bottom() {
        // TODO implement bottom()
        return "";
    }

    // isEmpty() returns true if Containers is empty, and false if otherwise
    public boolean isEmpty() {
        // TODO implement isEmpty()
        return true;
    }
}