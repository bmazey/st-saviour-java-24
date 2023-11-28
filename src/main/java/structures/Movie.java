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
        // TODO implement enqueue()
        this.Patrons.add(patron);
    }

    // dequeue() removes a patron from the Patrons queue
    // dequeue() should return an empty String instead of an error if you try to
    // dequeue from an empty Patrons queue
    public String dequeue() {
        String patron = this.Patrons.remove(0);
        if (patron == 0){
          return "";  
        }  //if statement array = nothing return ""
        
    }

    // first() reads the first item in the Patrons queue and returns the name
    public String first() {
        int fdigits = this.Patrons.indexOf(Patrons);
        return "";
    }

    // last() reads the last item in the Patrons queue and returns the name
    public String last() {
        // TODO implement last()
        int ldigits = this.Patrons.lastIndexOf(Patrons);
        if (ldigits != -1){
            return Patrons;
        }
    }

    // isEmpty() should return true if the Patrons queue is empty and false otherwise 
    public boolean isEmpty(){ 
        return this.Patrons.isEmpty(); //using the isEmpty command, a true value should return if the queue has a length value of 0
    }
    
}