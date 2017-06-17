package com.siweci.mediaplayer;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import static android.R.attr.button;

public class MainActivity extends AppCompatActivity {

    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mediaPlayer = MediaPlayer.create(this, R.raw.theme_menu);


        final Button playButton = (Button) findViewById(R.id.button_play);

        playButton.setOnClickListener(new View.OnClickListener() {
             @Override
            public void onClick(View v) {
                Toast.makeText(playButton.getContext(), "MediaPlay starts", Toast.LENGTH_SHORT).show();
                mediaPlayer.start();
            }
        });

        final Button pauseButton = (Button) findViewById(R.id.button_pause);

        pauseButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Toast.makeText(pauseButton.getContext(), "MediaPlay pauses", Toast.LENGTH_SHORT).show();
                mediaPlayer.pause();
            }
        });

    }
}
