package ca.ualberta.cs.lonelytwitter;
/** @author ye
 * @since the beginning of time
 * @version 1.0
 *
 *
 */
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
