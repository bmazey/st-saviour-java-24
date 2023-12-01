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

    // set Patrons list as an Array List
    public Movie() {
        this.Patrons = new ArrayList<String>();
    }
    
    // Enque to add a patron to the end of the queue
    public void enqueue(String patron) {
        this.Patrons.add(patron);
    }

    // Dequeu removes a atron and returns an empty string if your try to dequeu from empty Patrons
    public String dequeue() {
        //Check if the queu is empty
        if (!this.Patrons.isEmpty()) {
        // remove and return the first patron
            return this.Patrons.remove(0);
        } else {
            return "";
        }
    }
    // Read the first item in the Patrons queue and return the name
    public String first() {
        if (!this.Patrons.isEmpty()) {
            return this.Patrons.get(0);
        } else {
        // Return an empty string if queue is empty
            return "";
        }
    }

    // Last reads the last item and returns the name
    public String last() {
        if (!this.Patrons.isEmpty()) {
            return this.Patrons.get(this.Patrons.size() - 1);
        } else {
        // Return emty string if queue is empty
            return "";
        }
    }

    // IsEmpty returns true if the queue is empty and false if not 
    public boolean isEmpty() {
        return this.Patrons.isEmpty();
    }
}