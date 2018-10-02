package ca.ualberta.cs.lonelytwitter;
/** @author ye
 * @since the beginning of time
 * @version 1.0
 *
 *
 */

import java.util.Date;

/**
 * Created by szuk on 9/18/18.
 */

public abstract class Mood {
    private Date date;


    public Mood(){
        this.date = new Date();
    }

    public Mood(Date date){
        this.date = date;
    }

    public Date getDate(){
        return this.date;
    }

    public void setDate(Date newDate){
        this.date = newDate;
    }

}
