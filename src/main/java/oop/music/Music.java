package oop.music;

public abstract class Music {
    private String title;
    private int duration;

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

    public String listen(String listener) {
        return listener + " listens to " + this.title  + " for " + this.duration + " minutes.";
    }
    public String dance(String dancer) {
        return dancer + " dances for " + this.duration + " and has a lot of fun!";
    }
}
