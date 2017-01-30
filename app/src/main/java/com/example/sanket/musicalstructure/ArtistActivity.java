package com.example.sanket.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ArtistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artist);

        Button b8 = (Button) findViewById(R.id.buttonHome1);
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent home = new Intent(ArtistActivity.this , MainActivity.class);
                startActivity(home);
            }
        });

        Button b9 = (Button) findViewById(R.id.buttonComposer1);
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent composer1 = new Intent(ArtistActivity.this , ComposerActivity.class);
                startActivity(composer1);
            }
        });

        Button b10 = (Button) findViewById(R.id.buttonControl1);
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent control1 = new Intent(ArtistActivity.this , ControlActivity.class);
                startActivity(control1);
            }
        });

        Button b11 = (Button) findViewById(R.id.buttonAlbum1);
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent album1 = new Intent(ArtistActivity.this , AlbumActivity.class);
                startActivity(album1);
            }
        });

        Button b12 = (Button) findViewById(R.id.buttonPlaylist1);
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent playlist1 = new Intent(ArtistActivity.this , PlaylistActivity.class);
                startActivity(playlist1);
            }
        });

        Button b13 = (Button) findViewById(R.id.buttonRecentlyPlayed1);
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent recentlyplayed1 = new Intent(ArtistActivity.this , RecentlyPlayedActivity.class);
                startActivity(recentlyplayed1);
            }
        });

        Button b14 = (Button) findViewById(R.id.buttonGenre1);
        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent genre1 = new Intent(ArtistActivity.this , GenreActivity.class);
                startActivity(genre1);
            }
        });
    }
}
