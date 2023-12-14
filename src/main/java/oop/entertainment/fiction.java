package oop.entertainment;

import java.util.ArrayList;
import java.util.List; 

public abstract class fiction extends books{
    
    private List<fiction> Story = new ArrayList<fiction>();
    
    public List<fiction> getStory() {
        return this.Story;
    }
}
