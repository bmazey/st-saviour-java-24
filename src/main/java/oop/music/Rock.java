package oop.music;

public class Rock extends Music {
    /**
    * @param title    The title of the rock music.
     * @param duration The duration of the rock music in minutes.
     * @param artist   The artist or creator of the rock music.
     */
    public Rock(String title, int duration, String artist) {
        this.setTitle(title);
        this.setDuration(duration);
        this.setArtist(artist);
    } 
}
