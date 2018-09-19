package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

/**
 * Created by szuk on 9/18/18.
 */

public class MoodList {
    private ArrayList<Mood> moodList;

    public MoodList(ArrayList<Mood> moodList){
        this.moodList = moodList;
    }

    public void add(Mood mood){
        this.moodList.add(mood);
    }

    public void remove(Mood mood){
        this.moodList.remove(mood);
    }

}
