package oop.entertainment;
/*
 * creates a class "Entertainment" - no instance can be created of it
 */
public abstract class Entertainment{
    /*
     * a class "title" that has specific attributes - all entertainment has a title
     */
    private String title;
    /*
     * a getter method for title - accesses the private specific variable title
     */
    public String getTitle(){
        return this.title;
    }
    /*
     * a setter method for title - creates new instane of the variable title
     */
    public void setTitle(String title){
        this.title = title;
    }
    /*
     * a class "Pasttime" that has specific attributes - all entertainment passes time
     */
    private String pasttime;
    /*
     * a getter method for pasttime - calls the private specific variable pasttime
     */
    public String getPasttime(){
        return this.pasttime;
    }
    /*
     * a setter method for pasttime - creates new instance of the variable pasttime
     */
    public void setPasttime(String pasttime){
        this.pasttime = pasttime;
    }
}
