package oop.music;

import java.util.ArrayList;
import java.util.List;

public abstract class Music {
    private String title;
    private int duration;
    private String artist;
    private String genre;
/**
 * @return establishing the getter that tells the string to access the genre constructor method
 */
    public String getGenre() {
        return this.genre;
    }
/**
 * @param establishing the setter that updates the value of the string genre
 */
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public String getArtist() {
        return this.artist;
    }
    public void setArtist(String artist) {
        this.artist = artist;
    }
    public String getTitle() {
        return this.title;
    }
    public void setTitle(String title) {
        this.title = title;
    }  
    public int getDuration() {
        return this.duration;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }
/**
 * @param establishing the listen method to evalute the other functions in terms of the listeners
 */
    public String listen(String listener) {
        return listener + " listens to " + this.title  + " by " + this.artist + " for " +  this.duration + " minutes.";
    }
    }

