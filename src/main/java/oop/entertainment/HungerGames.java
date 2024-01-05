package oop.entertainment;

import oop.entertainment.HungerGames;

public final class HungerGames extends Fiction {

    public HungerGames (String name) {
        this.setTitle (name);
    }
    
    public void addName(String name) {
        HungerGames number = new HungerGames(name);
        this.getStory().add(number);
    }
}
