package ca.ualberta.cs.lonelytwitter;
/** @author ye
 * @since the beginning of time
 * @version 1.0
 *
 *
 */

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by szuk on 9/18/18.
 */

public abstract class Tweet implements Tweetable{

    private Date date;
    private String message;
    private static final Integer MAX_CHARS = 148;
    private ArrayList<Mood> moodList;

    public Tweet() {
        this.date = new Date();
        this.message = "I am default message";
    }

    public Tweet(String message){
        this.date = new Date();
        this.message = message;
    }

    public Date getDate(){
        return this.date;
    }
    public String getMessage(){
        return this.message;
    }

    public void setMessage(String message) throws TweetTooLongException{
        if (message.length() <= this.MAX_CHARS) {
            this.message = message;
        }
        else {
            throw new TweetTooLongException();

        }
    }

    abstract boolean isImportant();




    public Tweet(ArrayList<Mood> moodList){
        this.moodList = moodList;
    }

    public void listAdd(Mood mood){
        this.moodList.add(mood);
    }

    public void listRemove(Mood mood){
        this.moodList.remove(mood);
    }

    public ArrayList<Mood> getMoodList(){
        return this.moodList;
    }
    public void setMoodList(ArrayList<Mood> newMoodList){
        this.moodList = newMoodList;
    }


}
