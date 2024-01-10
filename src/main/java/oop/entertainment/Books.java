package oop.entertainment;

public abstract class Books extends Entertainment{
    private final boolean PHYSICAL = true;
    //classifies all books as physical
    public boolean isPhysical(){
        return PHYSICAL;
    }
}
//author text 