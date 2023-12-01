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
    private ArrayList<String> Patrons;

    // constructor method for Movie - notice the use of keyword "this" below
    public Movie() {
        this.Patrons = new ArrayList<String>();
    }

    // enqueue() adds a patron to the Patrons queue
    public void enqueue(String patron) {
        this.Patrons.add(patron); 
    }

    // dequeue() removes a patron from the Patrons queue
    // dequeue() should return an empty String instead of an error if you try to
    // dequeue from an empty Patrons queue
    public String dequeue(){
        // check to see if queue is empty
        if (this.Patrons.isEmpty()) {
        // return empty string if queue is empty
            return ""; 
        }
        // remove the first patron on line
        String name = this.Patrons.remove(0);
        // return name of the first patron
        return name;
    }

    // first() reads the first item in the Patrons queue and returns the name
    public String first() {
        // get the first patron in queue
        String firstitem = this.Patrons.get(0);
        return firstitem;
    }

    // last() reads the last item in the Patrons queue and returns the name
    public String last() {
        // get the position of the last patron in queue
       String lastitem = this.Patrons.get(this.Patrons.size() - 1); 
       return lastitem;
    }

    // isEmpty() should return true if the Patrons queue is empty and false otherwise 
    public boolean isEmpty() {
        // create a variable with patron's size
        int length = this.Patrons.size();
        if (length == 0) {
        // if length is 0 return true
            return true;
        }
        return false; 
    }
    
}