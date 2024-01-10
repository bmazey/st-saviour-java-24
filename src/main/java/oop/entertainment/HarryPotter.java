package oop.entertainment;

public final class HarryPotter extends Fiction{
   
    public HarryPotter(String name) {
        this.setTitle(name);
    }
    public void addName(String name){
        HarryPotter number = new HarryPotter(name);
        this.getStory().add(number);
    }
}
