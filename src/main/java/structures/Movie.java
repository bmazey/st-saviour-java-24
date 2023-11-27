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
        // TODO implement enqueue()
        this.Patrons.add(patron);
        // calls the list Patrons and adds a patron to it
        }


    // dequeue() removes a patron from the Patrons queue
    // dequeue() should return an empty String instead of an error if you try to
    // dequeue from an empty Patrons queue
    public String dequeue() {
        // TODO implement dequeue()
        if (this.Patrons.isEmpty()){
            return "";
            // tests to see if the queue is empty and if it is, returns an empty string
        }
        else{
            String num1 = this.Patrons.get(0);
            this.Patrons.remove(0);
            return num1;
            // if the string is not empty it removes the first patron from the queue
        }
    }

    // first() reads the first item in the Patrons queue and returns the name
    public String first() {
        // TODO implement first()
        String first = this.Patrons.get(0);
        return first;
    }

    // last() reads the last item in the Patrons queue and returns the name
    public String last() {
        // TODO implement last()
        String last = this.Patrons.get(this.Patrons.size()-1);
        return last;
    }

    // isEmpty() should return true if the Patrons queue is empty and false otherwise 
    public boolean isEmpty() {
        // TODO implement isEmpty()
        if (Patrons.isEmpty()){
            return true;
        }
        else{
            return false;
        }
        
    }
    
}