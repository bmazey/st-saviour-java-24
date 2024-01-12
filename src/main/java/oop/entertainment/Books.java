package oop.entertainment;
/*
 * creates a class called books with all characteristics from entertainment. 
 */
public abstract class Books extends Entertainment {
    /*
     * asserts that all book are physical
     */
    private final boolean PHYSICAL = true;
    /*
     * classifies if all books are physical. 
     */
    public boolean isPhysical() {
        return PHYSICAL;
    }
}

