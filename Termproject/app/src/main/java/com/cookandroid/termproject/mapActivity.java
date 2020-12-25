package com.cookandroid.termproject;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class mapActivity extends Activity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.map);

        Button btnWaktube, btnWakstagram, btnMessi, btnFull, btnLive;

        btnWaktube = (Button) findViewById(R.id.btnWaktube);
        btnWakstagram = (Button) findViewById(R.id.btnWakstagram);
        btnMessi = (Button) findViewById(R.id.btnMessi);
        btnFull = (Button) findViewById(R.id.btnFull);
        btnLive = (Button) findViewById(R.id.btnLive);

        btnWaktube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/user/woowakgood"));
                startActivity(intent);
            }
        });

        btnWakstagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/instawakgood/"));
                startActivity(intent);
            }
        });

        btnMessi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/welshcorgimessi/"));
                startActivity(intent);
            }
        });

        btnFull.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/user/welshcorgimessi"));
                startActivity(intent);
            }
        });

        btnLive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.twitch.tv/woowakgood"));
                startActivity(intent);
            }
        });
    }
}
