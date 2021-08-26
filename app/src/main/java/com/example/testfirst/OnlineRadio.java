package com.example.testfirst;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.IOException;

public class OnlineRadio extends AppCompatActivity {

    private AudioManager audioManager;
    MediaPlayer mediaPlayer;
    boolean prepared = false;
    String stream = "https://radio1.guaracast.com:8427/stream";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_online_radio);

        audioManager =(AudioManager) getSystemService(Context.AUDIO_SERVICE);
        Button btnPlay = findViewById(R.id.btnPlay);
        mediaPlayer = new MediaPlayer();
        mediaPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
        new PlayerTask().execute(stream);

        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer.start();

            }
        });


    }

    class PlayerTask extends AsyncTask<String, Void, Boolean> {
        @Override
        protected Boolean doInBackground(String... strings) {
            try {
                System.out.println(strings[0]);
                mediaPlayer.setDataSource(strings[0]);
                mediaPlayer.prepare();
                prepared = true;
            } catch (IOException e) {
                e.printStackTrace();
            }
            return prepared;
        }
    }

}