package com.example.a.lanna;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import java.util.Set;

public class MyPreference {

    SharedPreferences pref;
    SharedPreferences.Editor editor;

    // Shared pref mode
    int PRIVATE_MODE = 0;
    private static final String KEY_NAME = "name";
    private static final String KEY_SCORE = "score";
    // Sharedpref file name
    private static final String PREF_NAME = "lanna_app";

    public MyPreference(Activity activity) {
        pref = activity.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        editor = pref.edit();
    }

    public MyPreference(Context context) {
        pref = context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        editor = pref.edit();
    }

    public void setScore(Set<String> set){
        editor.putStringSet(KEY_SCORE,set);
        editor.commit();
    }

    public Set<String> getScore(){
        return pref.getStringSet(KEY_SCORE,null);
    }

    public void setName(Set<String> set){
        editor.putStringSet(KEY_NAME,set);
        editor.commit();
    }

    public Set<String> getName(){
        return pref.getStringSet(KEY_NAME,null);
    }

}