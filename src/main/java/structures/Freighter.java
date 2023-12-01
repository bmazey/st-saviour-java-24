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
     List<String> Containers;{}

    // constructor method for Freighter - notice the use of keyword "this"
    public Freighter() {
        this.Containers = new ArrayList<String>();
    }
    // push() adds an item to the Containers list; pay close attention to the order!
    public void push(String item) {
        Containers.add(item);
    }

    // pop() removes an item from the Containers list; pay close attention to the order!
    // pop() should return an empty String instead of an error if you try to pop an
    // item off an empty Containers stack
    public String pop() {
        if (isEmpty()) {
            return ""; 
    // Return an empty string if trying to pop from an empty stack
        }
        int lastIndex = Containers.size() - 1;
        return Containers.remove(lastIndex); 
    }

    // top() reads the next item to be unloaded from Containers
    public String top() {
        if (isEmpty()) {
            return ""; // Return an empty string if the stack is empty
        }
        return Containers.get(Containers.size() - 1);
    }

    // bottom() reads the final item to be unloaded from Containers
    public String bottom() {
        if (isEmpty()) {
            return ""; 
    // Return an empty string if the stack is empty
        }
        return Containers.get(0);
    }

    // isEmpty() returns true if Containers is empty, and false if otherwise
    public boolean isEmpty() {
        return this.Containers.isEmpty();
    }
}