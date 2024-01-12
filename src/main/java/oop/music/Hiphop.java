package oop.music;

public class Hiphop extends Music {
    /**
     * @param title    The title of the hiphop music.
     * @param duration The duration of the hiphop music in minutes.
     * @param artist   The artist or creator of the hiphop music.
     */
    public Hiphop(String title, int duration, String artist) {
        this.setTitle(title);
        this.setDuration(duration);
        this.setArtist(artist);
    }
}
