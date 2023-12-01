package structures;

import java.util.ArrayList;
import java.util.List;

/*
 * Picture a line of patrons (or fans) camped outside a movie theater
 * for a major release. Generally speaking, the first guests to line up are the 
 * first to be admitted once the theater opens. By extension, the last in line
 * will be the last admitted. In Computer Science we call this common data
 * structure a Queue.
 * 
 * In this exercise you'll be implementing a simple Queue using an ArrayList 
 * called Patrons. Notice that the Patrons list is private - you'll have to
 * use key word "this" to access Patrons in your method implementations.
 * 
 */
public class Movie {

    // the list of all patrons
    private List<String> Patrons;

    // constructor method for Movie - notice the use of keyword "this" below
    public Movie() {
        this.Patrons = new ArrayList<String>(); //will need this. for all codes
    }

    // enqueue() adds a patron to the Patrons queue
    public void enqueue(String patron) {
        
        this.Patrons.add(patron);
        // patron will be added to Patrons arraylist
    }

    // dequeue() removes a patron from the Patrons queue
    // dequeue() should return an empty String instead of an error if you try to
    // dequeue from an empty Patrons queue
    public String dequeue() {
        
        if (this.Patrons.isEmpty()) {
          return "";  
        // if Patrons arraylist is empty it will return an empty string
        }  
        String patron = this.Patrons.remove(0);
        // new variable created to remove patron in the first position
        return patron;
        // name of removed patron returned
    }

    // first() reads the first item in the Patrons queue and returns the name
    public String first() {

        String fitem = this.Patrons.get(0);
        // new variable created to read item in first posiiton
        return fitem;
        // name of first item returned
    }

    // last() reads the last item in the Patrons queue and returns the name
    public String last() {

        String litem = this.Patrons.get(this.Patrons.size() - 1);
        // new variable created to read last item in queue in accordance with the length of the arraylist
        return litem;
        // name of final item returned
    }

    // isEmpty() should return true if the Patrons queue is empty and false otherwise 
    public boolean isEmpty(){ 
        
        return this.Patrons.isEmpty();  
        // a true value should return if the queue has a length value of 0
    }
    
}