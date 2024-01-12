package oop.entertainment;
/*
 * Creates a class keeping all characteristics from Entertainment called Books
 */
public abstract class Books extends Entertainment{
    /*
     * Asserts that all books are physical
     */
    private final boolean PHYSICAL = true;
    /*
     * Classifies all books as physical
     */
    public boolean isPhysical(){
        return PHYSICAL;
    }
}