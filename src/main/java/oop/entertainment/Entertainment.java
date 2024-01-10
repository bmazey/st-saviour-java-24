package oop.entertainment;

/*
 * creates a class called entertainment that cannot have an instance only described as that
 */
public class Entertainment {
    /* 
     * sets up the class attribute "title," as all entertainment has a title
     */ 
    private String title;
    /* 
     * uses the getter method for title - accesses the private specific variable title
     */
    public String getTitle() {
        return this.title;
    }
    /*
     * uses the setter method - sets a new instance of title
     */
    public void setTitle(String title) {
        this.title = title;
    }
    /*
     * sets up the class attribute "pasttime," as all entertainment is a pasttime
     */
    private String pasttime;
    /* 
     * uses the getter method for pasttime - accesses the private specific variable title
     */
    public String getPasttime() {
        return this.pasttime;
    }
    /*
     * sets up the class attribute "pasttime," as all entertainment is a pasttime
     */
    public void setPasttime(String pasttime){
        this.pasttime = pasttime;
    }
}
