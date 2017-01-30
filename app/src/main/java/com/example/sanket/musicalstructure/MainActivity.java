package com.example.sanket.musicalstructure;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button b1 ,b2 ,b3 ,b4 ,b5 ,b6 ,b7;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (Button)findViewById(R.id.buttonArtist);
        b2 = (Button)findViewById(R.id.buttonComposer);
        b3 = (Button)findViewById(R.id.buttonControl);
        b4 = (Button)findViewById(R.id.buttonAlbum);
        b5 = (Button)findViewById(R.id.buttonPlaylist);
        b6 = (Button)findViewById(R.id.buttonRecentlyPlayed);
        b7 = (Button)findViewById(R.id.buttonGenre);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent artist = new Intent(MainActivity.this , ArtistActivity.class);
                startActivity(artist);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent composer = new Intent(MainActivity.this , ComposerActivity.class);
                startActivity(composer);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent control = new Intent(MainActivity.this , ControlActivity.class);
                startActivity(control);
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent album = new Intent(MainActivity.this , AlbumActivity.class);
                startActivity(album);
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent playlist = new Intent(MainActivity.this , PlaylistActivity.class);
                startActivity(playlist);
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent recentlyplayed = new Intent(MainActivity.this , RecentlyPlayedActivity.class);
                startActivity(recentlyplayed);
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent genre = new Intent(MainActivity.this , RecentlyPlayedActivity.class);
                startActivity(genre);
            }
        });

    }


}
