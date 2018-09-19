package ca.ualberta.cs.lonelytwitter;
/**
 * Created by szuk on 9/18/18.
 */

public class ImportantTweet extends Tweet {
    ImportantTweet(){
        super();
    }
    ImportantTweet(String message){
        super(message);
    }

    @Override
    public boolean isImportant(){
        return true;
    }
}
