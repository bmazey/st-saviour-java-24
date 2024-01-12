package oop.music;

public class Electronic extends Music {
    /**
 * @param title    The title of the electronic music.
     * @param duration The duration of the electronic music in minutes.
     * @param artist   The artist or creator of the electronic music.
     */
    public Electronic(String title, int duration, String artist) {
        this.setTitle(title);
        this.setDuration(duration);
        this.setArtist(artist);
    }
}
