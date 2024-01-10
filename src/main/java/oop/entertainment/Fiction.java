package oop.entertainment;

import java.util.ArrayList;
import java.util.List; 

public abstract class Fiction extends Books{
    
    private List<Fiction> Story = new ArrayList<Fiction>();
    
    public List<Fiction> getStory() {
        return this.Story;
    }
}
