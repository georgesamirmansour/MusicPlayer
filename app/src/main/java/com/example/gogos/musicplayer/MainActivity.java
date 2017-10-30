package com.example.gogos.musicplayer;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private MediaPlayer mediaPlayer;
    private float volumeUp;
    private float volumeDown;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        playButton();
        pauseButton();
        volumeDownButton();
        volumeUpButton();
        mediaPlayer();
    }

    public void playButton() {
        Button playButton = (Button) findViewById(R.id.play_button);
        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Play", Toast.LENGTH_SHORT).show();
                mediaPlayer.start();
            }
        });
    }

    public void pauseButton() {
        Button pauseButton = (Button) findViewById(R.id.pause_button);
        pauseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Pause", Toast.LENGTH_SHORT).show();
                mediaPlayer.pause();
            }
        });
    }

    public void volumeUpButton() {
        Button volumeUpButton = (Button) findViewById(R.id.volume_up_button);
        volumeUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Volume increase", Toast.LENGTH_SHORT).show();
                volumeUp += 1;
                mediaPlayer.setVolume(volumeUp, volumeDown);
            }
        });
    }

    public void volumeDownButton() {
        Button volumeDownButton = (Button) findViewById(R.id.volume_down_button);
        volumeDownButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Volume decrease", Toast.LENGTH_SHORT).show();
                volumeDown -= 1;
                mediaPlayer.setVolume(volumeUp, volumeDown);
            }
        });
    }

    public void mediaPlayer() {
        mediaPlayer = MediaPlayer.create(this, R.raw.an_old_photo);
    }
}
