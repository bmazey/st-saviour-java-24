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
        this.Patrons.add(patron); //add a person to the queque

    }

    // dequeue() removes a patron from the Patrons queue
    // dequeue() should return an empty String instead of an error if you try to
    // dequeue from an empty Patrons queue
    public String dequeue() {
        if (isEmpty()) {
            return ""; // if queue is empty return blank set
        }
        else { // if queue not empty remove person in position 0 from queue
            String num1 = this.Patrons.get(0);
            this.Patrons.remove(0);
            return num1;
        }
    }
    // first() reads the first item in the Patrons queue and returns the name
    public String first() { //return the first patron
        String item = this.Patrons.get(0);
        return item; 
    }
    // last() reads the last item in the Patrons queue and returns the name
    public String last() { //return the last patron
        return this.Patrons.get(this.Patrons.size() - 1 );
    }
    // isEmpty() should return true if the Patrons queue is empty and false otherwise 
    public boolean isEmpty() { // isEmpty is answering the question: is the queue empty
        return this.Patrons.isEmpty();    
    }  
}