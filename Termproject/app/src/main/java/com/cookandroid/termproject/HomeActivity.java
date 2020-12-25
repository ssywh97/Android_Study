package com.cookandroid.termproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class HomeActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        TextView who, wakmap, wakphoto, wakfan;
        who = (TextView) findViewById(R.id.who);
        wakmap = (TextView) findViewById(R.id.wakmap);
        wakphoto = (TextView) findViewById(R.id.wakphoto);
        wakfan = (TextView) findViewById(R.id.wakfan);

        who.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), whoActivity.class);
                startActivity(intent);
            }
        });

        wakmap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), mapActivity.class);
                startActivity(intent);
            }
        });

        wakphoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), photoActivity.class);
                startActivity(intent);
            }
        });

        wakfan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), fanActivity.class);
                startActivity(intent);
            }
        });
    }
}
