package oop.music;

public class Hiphop extends Music {
/**
* @param title
* @param duration
* @param artists 
* operating as a setter to identify the title and artist as string and duration as an integer
*/
    public Hiphop(String title, int duration, String artist) {
        this.setTitle(title); 
        this.setDuration(duration);
        this.setArtist(artist);
    }
}
