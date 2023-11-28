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
        this.Patrons = new ArrayList<String>();
    }
    // enqueue() adds a patron to the Patrons queue
    public void enqueue (String patron) {
        // calls the private list Patrons and adds patron to it
        this.Patrons.add(patron);
        
    }
    // dequeue() removes a patron from the Patrons queue
    // dequeue() should return an empty String instead of an error if you try to
    // dequeue from an empty Patrons queue
    public String dequeue() {
        // tests to see if the queue is empty, returns an empty string if true
        if (this.Patrons.isEmpty()) {
            return "";
        }
        // otherwise sets the first item to a variable called num1, removes it from the 
        // queue and then returns the variable num1
        else {
            String num1 = this.Patrons.get(0);
            this.Patrons.remove(0);
            return num1;
        }
    }

    // first() reads the first item in the Patrons queue and returns the name
    public String first() {
       // creates a variable 'first' and stores the first item in Patrons, it returns first
        String first = this.Patrons.get(0);
        return first;
    }

    // last() reads the last item in the Patrons queue and returns the name
    public String last() {
        // creates a variable called last that stores the last item in Patrons, it returns last
        String last = this.Patrons.get(this.Patrons.size()-1);
        return last;
    }

    // isEmpty() should return true if the Patrons queue is empty and false otherwise 
    public boolean isEmpty() {
       // checks if the queue is empty and returns true if it is
        if (this.Patrons.size() == 0) {
            return true;
        }
        // if the queue is not empty it returns false
        else {
            return false;
        }
    }
    
}