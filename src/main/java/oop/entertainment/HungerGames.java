package oop.entertainment;

import oop.entertainment.HungerGames;

public final class HungerGames extends Fiction {

    public HungerGames (String title) {
        this.setCreative (title);
    }
    
    public void addTitle(String title) {
        HungerGames number = new HungerGames(title);
        this.getStory().add(number);
    }
}
