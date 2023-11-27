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
        //calls the list containers and adds an item to it
        this.Containers.add(item);
    }

    // pop() removes an item from the Containers list; pay close attention to the order!
    // pop() should return an empty String instead of an error if you try to pop an
    // item off an empty Containers stack
    public String pop() {
        // TODO implement pop()
        if (this.Containers.isEmpty()){
            return "";
            // tests to see if the queue is empty and if it is, returns an empty string
        }
        else{
            String last = this.Containers.get(this.Containers.size()-1);
            this.Containers.remove(this.Containers.size()-1);
            return last;
        }
        // says that if the queue is not empty, the last item is removed and returned
    }
    // top() reads the next item to be unloaded from Containers
    public String top() {
        // TODO implement top()
        String top = this.Containers.get(this.Containers.size()-1);
        return top;
        // takes the last item to be added to the list and reads it
    }

    // bottom() reads the final item to be unloaded from Containers
    public String bottom() {
        // TODO implement bottom()
        String bottom = this.Containers.get(0);
        return bottom;
        // takes the first item to be added to containers and reads it
    }

    // isEmpty() returns true if Containers is empty, and false if otherwise
    // TODO implement isEmpty()
    public boolean isEmpty() {
        if (this.Containers.size() == 0){
            return true;
        }
        else{
            return false;
        }
        
    }
}