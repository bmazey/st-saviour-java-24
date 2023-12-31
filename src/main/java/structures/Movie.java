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
    public void enqueue(String patron) {
        // calls the list Patrons and adds a patron to it
        this.Patrons.add(patron);
        }


    // dequeue() removes a patron from the Patrons queue
    public String dequeue() {
        // tests to see if the queue is empty and if it is, returns an empty string
        if (this.Patrons.isEmpty()) {
            return "";
        }
        // if it is not empty, it removes the first patron from the queue
        else {
            String num1 = this.Patrons.get(0);
            this.Patrons.remove(0);
            return num1;
        }
    }
    // first() reads the first item in the Patrons queue and returns the name
    public String first() {
        // assigns the first item in the queue to the variable first and returns it
        String first = this.Patrons.get(0);
        return first;
    }
    // last() reads the last item in the Patrons queue and returns the name
    public String last() {
        // assigns the last item in the queue to the variable last and returns it
        String last = this.Patrons.get(this.Patrons.size()-1);
        return last;
    }
    // isEmpty() should return true if the Patrons queue is empty and false otherwise 
    public boolean isEmpty() {
        // says that if the queue is empty true is returned
        if (Patrons.isEmpty()) {
            return true;
        }
        // says that if the queue is not empty, false is returned
        else {
            return false;
        } 
    } 
}