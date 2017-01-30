package com.example.sanket.musicalstructure;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AlbumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album);

        Button b29 = (Button) findViewById(R.id.buttonHome4);
        b29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent home4 = new Intent(AlbumActivity.this , MainActivity.class);
                startActivity(home4);
            }
        });

        Button b30 = (Button) findViewById(R.id.buttonArtist4);
        b30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent artist4 = new Intent(AlbumActivity.this , ArtistActivity.class);
                startActivity(artist4);
            }
        });

        Button b31 = (Button) findViewById(R.id.buttonComposer4);
        b31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent composer4 = new Intent(AlbumActivity.this , ComposerActivity.class);
                startActivity(composer4);
            }
        });

        Button b32 = (Button) findViewById(R.id.buttonControl4);
        b32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent control4= new Intent(AlbumActivity.this , ControlActivity.class);
                startActivity(control4);
            }
        });

        Button b33 = (Button) findViewById(R.id.buttonPlaylist4);
        b33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent playlist4 = new Intent(AlbumActivity.this , PlaylistActivity.class);
                startActivity(playlist4);
            }
        });

        Button b34 = (Button) findViewById(R.id.buttonRecentlyPlayed4);
        b34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent recentlyplayed4 = new Intent(AlbumActivity.this , RecentlyPlayedActivity.class);
                startActivity(recentlyplayed4);
            }
        });

        Button b35 = (Button) findViewById(R.id.buttonGenre4);
        b35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent genre4 = new Intent(AlbumActivity.this , GenreActivity.class);
                startActivity(genre4);
            }
        });
    }
}
