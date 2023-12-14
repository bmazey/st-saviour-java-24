package oop.entertainment;

import oop.mammals.Echidna;

public final class HarryPotter extends Fiction {

    public HarryPotter (String title) {
        this.setCreative (title);
    }
    
    public void addTitle(String title) {
        HarryPotter number = new HarryPotter(title);
        this.getStory().add(number);
    }
}
