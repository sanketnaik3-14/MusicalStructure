package com.example.sanket.musicalstructure;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GenreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_genre);

        Button b50 = (Button) findViewById(R.id.buttonHome7);
        b50.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent home7 = new Intent(GenreActivity.this, MainActivity.class);
                startActivity(home7);
            }
        });

        Button b51 = (Button) findViewById(R.id.buttonArtist7);
        b51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent artist7 = new Intent(GenreActivity.this, ArtistActivity.class);
                startActivity(artist7);
            }
        });

        Button b52 = (Button) findViewById(R.id.buttonComposer7);
        b52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent composer7 = new Intent(GenreActivity.this, ComposerActivity.class);
                startActivity(composer7);
            }
        });

        Button b53 = (Button) findViewById(R.id.buttonControl7);
        b53.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent control7 = new Intent(GenreActivity.this, ControlActivity.class);
                startActivity(control7);
            }
        });

        Button b54 = (Button) findViewById(R.id.buttonAlbum7);
        b54.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent album7 = new Intent(GenreActivity.this, AlbumActivity.class);
                startActivity(album7);
            }
        });

        Button b55 = (Button) findViewById(R.id.buttonPlaylist7);
        b55.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent playlist7 = new Intent(GenreActivity.this, PlaylistActivity.class);
                startActivity(playlist7);
            }
        });

        Button b56 = (Button) findViewById(R.id.buttonRecentlyPlayed7);
        b56.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent recentlyplayed7 = new Intent(GenreActivity.this, RecentlyPlayedActivity.class);
                startActivity(recentlyplayed7);
            }
        });
    }
}
