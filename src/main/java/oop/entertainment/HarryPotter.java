package oop.entertainment;

public final class HarryPotter extends fiction{
   
    public HarryPotter(String title) {
        this.setCreative(title);
    }
    public void addTitle(String title){
        HarryPotter number = new HarryPotter(title);
        this.getStory().add(number);
    }
}
