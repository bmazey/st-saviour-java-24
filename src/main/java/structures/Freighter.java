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

    public Freighter() {
    // "this." attaches array to list
        this.Containers = new ArrayList<String>();
    }

    public void push(String item) {
    // adding an item to the Containers list
        Containers.add(item);
    }

    public String pop() {
    // creating the condition to return an empty string if you are removing from an empty stack
        if (isEmpty()) {
            return "";  
        }
        int lastIndex = Containers.size() - 1;
        return Containers.remove(lastIndex);
    }

    public String top() {
    // evaluting the next item in the list containers 
        if (isEmpty()) {
            return ""; 
        }
        return Containers.get(Containers.size() - 1);
    }

   
    public String bottom() {
    // evaluating the final item to be removed from Containers and return and empty string if empty 
        if (isEmpty()) {
            return ""; 
        }
        return Containers.get(0);
    }

    public boolean isEmpty() {
    // Setting up a true or false condition that prints true if empty and false if not
        return this.Containers.isEmpty();
    }
}