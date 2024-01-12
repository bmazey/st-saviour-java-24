package oop.music;

public class Pop extends Music {
/**
* @param title
* @param duration
* @param artist
* operating as a setter to identify the title and artists as string and duration as an integer
*/
    public Pop(String title, int duration, String artist) {
        this.setTitle(title); 
        this.setDuration(duration);
        this.setArtist(artist);
    }
     
}
