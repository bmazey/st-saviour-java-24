package oop.entertainment;

public class HungerGames extends fiction{
   
    public HungerGames(String title) {
        this.setCreative(title);
    }
    public void addTitle(String title){
        HungerGames number = new HungerGames(title);
        this.getStory().add(number);
    }
}
