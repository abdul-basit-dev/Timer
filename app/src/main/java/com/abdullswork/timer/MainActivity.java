package com.abdullswork.timer;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    MediaPlayer mediaPlayer;
    TextView mTimer,mDone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mediaPlayer = MediaPlayer.create(this,R.raw.three);

        mTimer = findViewById(R.id.mTimer);
        mDone = findViewById(R.id.mDone);

        new CountDownTimer(10000,1000){
            @Override
            public void onTick(long l) {

                mTimer.setText("Time : "+ String.valueOf(l/1000));

            }

            @Override
            public void onFinish() {

                mDone.setText("Done");
                mediaPlayer.start();

            }
        }.start();


    }
}