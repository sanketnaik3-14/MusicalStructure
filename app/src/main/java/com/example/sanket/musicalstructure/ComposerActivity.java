package com.example.sanket.musicalstructure;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ComposerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_composer);

        Button b15 = (Button) findViewById(R.id.buttonHome2);
        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent home2 = new Intent(ComposerActivity.this , MainActivity.class);
                startActivity(home2);
            }
        });

        Button b16 = (Button) findViewById(R.id.buttonArtist2);
        b16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent artist2 = new Intent(ComposerActivity.this , ArtistActivity.class);
                startActivity(artist2);
            }
        });

        Button b17 = (Button) findViewById(R.id.buttonControl2);
        b17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent control2 = new Intent(ComposerActivity.this , ControlActivity.class);
                startActivity(control2);
            }
        });

        Button b18 = (Button) findViewById(R.id.buttonAlbum2);
        b18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent album2 = new Intent(ComposerActivity.this , AlbumActivity.class);
                startActivity(album2);
            }
        });

        Button b19 = (Button) findViewById(R.id.buttonPlaylist2);
        b19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent playlist2 = new Intent(ComposerActivity.this , PlaylistActivity.class);
                startActivity(playlist2);
            }
        });

        Button b20 = (Button) findViewById(R.id.buttonRecentlyPlayed2);
        b20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent recentlyplayed2 = new Intent(ComposerActivity.this , RecentlyPlayedActivity.class);
                startActivity(recentlyplayed2);
            }
        });

        Button b21 = (Button) findViewById(R.id.buttonGenre2);
        b21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent genre2 = new Intent(ComposerActivity.this , GenreActivity.class);
                startActivity(genre2);
            }
        });
    }
}
