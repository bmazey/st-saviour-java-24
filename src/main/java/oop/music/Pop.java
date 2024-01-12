package oop.music;

public class Pop extends Music {
    /**
     * @param title    The title of the pop music.
     * @param duration The duration of the pop music in minutes.
     * @param artist   The artist or creator of the pop music.
     */
    public Pop(String title, int duration, String artist) {
        this.setTitle(title);
        this.setDuration(duration);
        this.setArtist(artist);
    }
}
