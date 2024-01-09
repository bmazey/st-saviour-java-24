package oop.music;

public abstract class Music {
//identifying the data type for each method 
    private String title;
    private int duration;
    private String artist;

//creating the getter that tells the string to access the artist method
    public String getArtist() {
        return this.artist;
    }
//creating the setter that updates the value of the string artist
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
//establishing the listen method to evalute the other functions in terms of the listeners
    public String listen(String listener) {
        return listener + " listens to " + this.title  + " by " + this.artist + " for " +  this.duration + " minutes.";
    }
//creating the dance method and encorporates it with the other methods of the class
    public String dance(String dancer) {
        return dancer + " dances for " + this.duration + " and has a lot of fun!";
    }
}
