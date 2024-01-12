package oop.entertainment;
/*
 * Creates a class "Entertainment" - no instance can be created of it
 */
public abstract class Entertainment{
    /*
     * A class "title" that has specific attributes - all entertainment has a title
     */
    private String title;
    /*
     * A getter method for title - accesses the private specific variable title
     */
    public String getTitle(){
        return this.title;
    }
    /*
     * A setter method for title - creates new instane of the variable title
     */
    public void setTitle(String title){
        this.title = title;
    }
    /*
     * A class "Pasttime" that has specific attributes - all entertainment passes time
     */
    private String pasttime;
    /*
     * A getter method for pasttime - calls the private specific variable pasttime
     */
    public String getPasttime(){
        return this.pasttime;
    }
    /*
     * A setter method for pasttime - creates new instance of the variable pasttime
     */
    public void setPasttime(String pasttime){
        this.pasttime = pasttime;
    }
}
