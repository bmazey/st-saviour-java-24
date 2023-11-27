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

    private List<String> Containers;

    public Freighter() {
        this.Containers = new ArrayList<String>();
    }

    public void push(String item) {
        Containers.add(item);
    }

    public String pop() {
        if (isEmpty()) {
            return ""; 
    // Return an empty string if trying to pop from an empty stack
        }
        int lastIndex = Containers.size() - 1;
        return Containers.remove(lastIndex);
    }

    public String top() {
        if (isEmpty()) {
            return ""; 
    // Return an empty string if the stack is empty
        }
        return Containers.get(Containers.size() - 1);
    }

    public String bottom() {
        if (isEmpty()) {
            return ""; 
    // Return an empty string if the stack is empty
        }
        return Containers.get(0);
    }

    public boolean isEmpty() {
        return Containers.isEmpty();
    }
}
