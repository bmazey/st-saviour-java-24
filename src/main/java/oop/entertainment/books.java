package oop.entertainment;

public abstract class books extends entertainment{
    private final boolean PHYSICAL = true;
    //classifies all books as physical
    public boolean isPhysical(){
        return PHYSICAL;
    }
}