package com.example.sanket.musicalstructure;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PlaylistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist);

        Button b36 = (Button) findViewById(R.id.buttonHome5);
        b36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent home5 = new Intent(PlaylistActivity.this , MainActivity.class);
                startActivity(home5);
            }
        });

        Button b37 = (Button) findViewById(R.id.buttonArtist5);
        b37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent artist5 = new Intent(PlaylistActivity.this , ArtistActivity.class);
                startActivity(artist5);
            }
        });

        Button b38 = (Button) findViewById(R.id.buttonComposer5);
        b38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent composer5 = new Intent(PlaylistActivity.this , ComposerActivity.class);
                startActivity(composer5);
            }
        });

        Button b39 = (Button) findViewById(R.id.buttonControl5);
        b39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent control5= new Intent(PlaylistActivity.this , ControlActivity.class);
                startActivity(control5);
            }
        });

        Button b40 = (Button) findViewById(R.id.buttonAlbum5);
        b40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent album5 = new Intent(PlaylistActivity.this , AlbumActivity.class);
                startActivity(album5);
            }
        });

        Button b41 = (Button) findViewById(R.id.buttonRecentlyPlayed5);
        b41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent recentlyplayed5 = new Intent(PlaylistActivity.this , RecentlyPlayedActivity.class);
                startActivity(recentlyplayed5);
            }
        });

        Button b42 = (Button) findViewById(R.id.buttonGenre5);
        b42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent genre5 = new Intent(PlaylistActivity.this , GenreActivity.class);
                startActivity(genre5);
            }
        });
    }
}
