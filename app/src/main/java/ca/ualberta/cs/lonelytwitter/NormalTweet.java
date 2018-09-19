package ca.ualberta.cs.lonelytwitter;

/**
 * Created by szuk on 9/18/18.
 */

public class NormalTweet extends Tweet {
    NormalTweet() {
        super();
    }
    NormalTweet(String message){
        super(message);
    }
    @Override
    public boolean isImportant(){
        return false;
    }
}
