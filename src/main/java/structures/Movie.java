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

    // setting up the lists for patrons 
    private List<String> Patrons;

    // connecting the list Patrons to the array using this.
    public Movie() {
        this.Patrons = new ArrayList<String>();
    }

    // Using enqueue() to add a patron to the next position 
    public void enqueue(String patron) {
        this.Patrons.add(patron);
    }

    // Using dequeue () to remove from the next postion and return an empty string if postion already empty 
    public String dequeue() {
        if (!this.Patrons.isEmpty()) {
            return this.Patrons.remove(0);
        }
        return "";   
    }

    // declaring that if the list isn't empty then the first postion should be returned 
    public String first() {    
        if (!this.Patrons.isEmpty()) {
            return this.Patrons.get(0);
        } else {
            return ""; 
        }
    }
    //declarng that if the list isn't empty then the last postion should be returned 
    public String last() {         
        if (!this.Patrons.isEmpty()) {
            return this.Patrons.get(this.Patrons.size() - 1);
        }
        else {
            return "";
        }
    }
    // creating a true or false condition that will return true if the Patrons is empty and false if not 
    public boolean isEmpty() {
        return this.Patrons.isEmpty();
    }
    
}