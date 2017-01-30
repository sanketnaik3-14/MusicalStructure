package com.example.sanket.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ControlActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_control);

        Button b22 = (Button) findViewById(R.id.buttonHome3);
        b22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent home3 = new Intent(ControlActivity.this , MainActivity.class);
                startActivity(home3);
            }
        });

        Button b23 = (Button) findViewById(R.id.buttonArtist3);
        b23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent artist3 = new Intent(ControlActivity.this , ArtistActivity.class);
                startActivity(artist3);
            }
        });

        Button b24 = (Button) findViewById(R.id.buttonComposer3);
        b24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent composer3 = new Intent(ControlActivity.this , ComposerActivity.class);
                startActivity(composer3);
            }
        });

        Button b25 = (Button) findViewById(R.id.buttonAlbum3);
        b25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent album3 = new Intent(ControlActivity.this , AlbumActivity.class);
                startActivity(album3);
            }
        });

        Button b26 = (Button) findViewById(R.id.buttonPlaylist3);
        b26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent playlist3 = new Intent(ControlActivity.this , PlaylistActivity.class);
                startActivity(playlist3);
            }
        });

        Button b27 = (Button) findViewById(R.id.buttonRecentlyPlayed3);
        b27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent recentlyplayed3 = new Intent(ControlActivity.this , RecentlyPlayedActivity.class);
                startActivity(recentlyplayed3);
            }
        });

        Button b28 = (Button) findViewById(R.id.buttonGenre3);
        b28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent genre3 = new Intent(ControlActivity.this , GenreActivity.class);
                startActivity(genre3);
            }
        });
    }
}
