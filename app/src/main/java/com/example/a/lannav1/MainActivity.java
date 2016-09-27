package com.example.a.lannav1;

import android.media.MediaPlayer;
import android.os.Build;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        mainmanu myFragment = new mainmanu();

        MediaPlayer smain = MediaPlayer.create(MainActivity.this,R.raw.title);
        smain.start();

        smain.setLooping(true);
        smain.setScreenOnWhilePlaying(true);

        setContentView(R.layout.fragment_layout);

        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.fragment_container, myFragment);
        transaction.commit();

    }




}
