package com.example.musicalinstruments;

import android.media.AudioManager;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private final int NR_OF_SIMULTANEOUS_SOUNDS = 7;
    private final float LEFT_VOLUME = 1.0f;
    private final float RIGHT_VOLUME = 1.0f;
    private final int NO_LOOP = 0;
    private final int PRIORITY = 0;
    private final float NORMAL_PLAY_RATE = 1.0f;

    public SoundPool mSoundPool;
    int mCSoundId;
    int mDSoundId;
    int mESoundId;
    int mFSoundId;
    int mGSoundId;
    int mASoundId;
    int mBSoundId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSoundPool =new SoundPool(7, AudioManager.STREAM_MUSIC,0);

    }
    public void playC(View v) {
    }
    public void playD(View v) {

    }
    public void playE(View v) {

    }
    public void playF(View v) {

    }
    public void playG(View v) {

    }
    public void playA(View v) {

    }
    public void playB(View v) {

    }
}
