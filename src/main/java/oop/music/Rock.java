package oop.music;

public class Rock extends Music {
/**
* @param title
* @param duration
* @param artists 
* operating as a setter to identify the title and artists as string and duration as an integer
*/
    public Rock(String title, int duration, String artist) {
        this.setTitle(title); 
        this.setDuration(duration);
        this.setArtist(artist);

    }
}
