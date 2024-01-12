package oop.music;

/**
 * An abstract class representing a generic music.
 */
public abstract class Music {
    // Private instance variables store information about the music.
    private String title;
    private int duration;
    private String artist;
    private String genre;

/**
  * Get the genre of the music.
  *
  * @return The genre of the music.
 */
public String getGenre() {
    return this.genre;
}
 /**
 * Set the genre of the music.
 *
 * @param genre The genre to set for the music.
 */
public void setGenre(String genre) {
    this.genre = genre;
}
/**
* Get the artist of the music.
 *
 * @return The artist of the music.
 */
public String getArtist() {
    return this.artist;
}
/**
 * Set the artist of the music.
 *
 * @param artist The artist to set for the music.
 */
public void setArtist(String artist) {
    this.artist = artist;
}
 /**
 * Get the title of the music.
 *
 * @return The title of the music.
 */
public String getTitle() {
    return this.title;
}
  /**
 * Set the title of the music.
 *
 * @param title The title to set for the music.
 */
public void setTitle(String title) {
    this.title = title;
}
 /**
 * Get the duration of the music.
 *
 * @return The duration of the music in minutes.
 */
public int getDuration() {
    return this.duration;
}
  /**
 * Set the duration of the music.
 *
 * @param duration The duration to set for the music in minutes.
 */
public void setDuration(int duration) {
    this.duration = duration;
}

  /**
 * Simulates a listener listening to the music.
 *
 * @param listener The listener's name.
 * @return A string describing the listener's interaction with the music.
 */
public String listen(String listener) {
    return listener + " listens to " + this.title + " by " + this.artist + " for " + this.duration + " minutes.";
}
}