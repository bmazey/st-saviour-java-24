package structures;

import java.util.ArrayList;
import java.util.List;

/*
 * Picture a bunch of patrons (or fans) camped outside a movie theater
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
    public void enqueue(String patron) {
        
    }

    // dequeue() removes a patron from the Patrons queue
    public String dequeue() {
        return "";
    }

    // first() reads the first item in the Patrons queue
    public String first() {
        return "";
    }

    // last() reads the last item in the Patrons queue
    public String last() {
        return "";
    }

    // isEmpty() should return true if the Patrons queue is empty and false otherwise 
    public boolean isEmpty() {
        return true;
    }
    
}