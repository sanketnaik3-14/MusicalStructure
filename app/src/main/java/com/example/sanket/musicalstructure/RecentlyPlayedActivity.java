package com.example.sanket.musicalstructure;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RecentlyPlayedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recently_played);

            Button b43 = (Button) findViewById(R.id.buttonArtist6);
            b43.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent artist6 = new Intent(RecentlyPlayedActivity.this, ArtistActivity.class);
                    startActivity(artist6);
                }
            });

            Button b44 = (Button) findViewById(R.id.buttonComposer6);
            b44.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent composer6 = new Intent(RecentlyPlayedActivity.this, ComposerActivity.class);
                    startActivity(composer6);
                }
            });

            Button b45 = (Button) findViewById(R.id.buttonControl6);
            b45.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent control6 = new Intent(RecentlyPlayedActivity.this, ControlActivity.class);
                    startActivity(control6);
                }
            });

            Button b46 = (Button) findViewById(R.id.buttonAlbum6);
            b46.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent album6 = new Intent(RecentlyPlayedActivity.this, AlbumActivity.class);
                    startActivity(album6);
                }
            });

            Button b47 = (Button) findViewById(R.id.buttonPlaylist6);
            b47.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent playlist6 = new Intent(RecentlyPlayedActivity.this, PlaylistActivity.class);
                    startActivity(playlist6);
                }
            });

            Button b48 = (Button) findViewById(R.id.buttonHome6);
            b48.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent home6 = new Intent(RecentlyPlayedActivity.this, MainActivity.class);
                    startActivity(home6);
                }
            });

            Button b49 = (Button) findViewById(R.id.buttonGenre6);
            b49.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent genre6 = new Intent(RecentlyPlayedActivity.this, GenreActivity.class);
                    startActivity(genre6);
                }
            });
        }
    }
