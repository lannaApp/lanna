package com.example.a.lannav1;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import java.util.Set;

public class MyPreference {

    SharedPreferences pref;
    SharedPreferences.Editor editor;

    // Shared pref mode
    int PRIVATE_MODE = 0;
    private static final String KEY_RANKING = "ranking";
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

    public void setRanking(Set<String> set){
        editor.putStringSet(KEY_RANKING,set);
        editor.commit();
    }

    public Set<String> getRanking(){
        return pref.getStringSet(KEY_RANKING,null);
    }
}