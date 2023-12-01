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

    // identifying containers as a list 
    private List<String> Containers;

    // "this." attaches array to list
    public Freighter() {
        this.Containers = new ArrayList<String>();
    }
    // adding an item to the Containers list
    public void push(String item) {
        Containers.add(item);
    }
    // creating the condition to return an empty string if you are removing from an empty stack
    public String pop() {
        if (isEmpty()) {
            return "";  
        }
        int lastIndex = Containers.size() - 1;
        return Containers.remove(lastIndex);
    }

    // evaluting the next item in the list containers 
    public String top() {
        if (isEmpty()) {
            return ""; 
        }
        return Containers.get(Containers.size() - 1);
    }

    // evaluating the final item to be removed from Containers and return and empty string if empty 
    public String bottom() {
        if (isEmpty()) {
            return ""; 
        }
        return Containers.get(0);
    }

    // Setting up a true or false condition that prints true if empty and false if not
    public boolean isEmpty() {
        return this.Containers.isEmpty();
    }
}