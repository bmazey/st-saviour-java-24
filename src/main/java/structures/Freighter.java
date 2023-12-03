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

    // push() adds an item to the Containers list
    public void push(String item) {
        // calls the list containers and adds an item to it
        this.Containers.add(item);
    }

    // pop() removes an item from the Containers list
    public String pop() {
        // tests to see if the queue is empty and if it is, returns an empty string
        if (this.Containers.isEmpty()) {
            return "";
        } else {
            // gets the last item of the list and assigns it to last
            String last = this.Containers.get(this.Containers.size()-1);
            // removes the last item from the list
            this.Containers.remove(this.Containers.size()-1);
            // returns the last item
            return last;
        }
    }
    // top() reads the next item to be unloaded from Containers
    public String top() {
        // takes the last item to be added to the list and returns it
        String top = this.Containers.get(this.Containers.size()-1);
        return top;
    }
    // bottom() reads the final item to be unloaded from Containers
    public String bottom() {
        // takes the first item that was added to containers and returns it
        String bottom = this.Containers.get(0);
        return bottom;
    }
    // isEmpty() returns true if Containers is empty, and false if otherwise
    public boolean isEmpty() {
        // says that if the length of the list is 0 return true
        if (this.Containers.size() == 0) {
            return true;
        }
        // says that if the length is not 0, return false
        else {
            return false;
        } 
    }
}