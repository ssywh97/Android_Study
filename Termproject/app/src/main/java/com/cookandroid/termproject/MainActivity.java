package com.cookandroid.termproject;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.media.Image;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends Activity {

    private MotionEvent event;
    TextView Title, Touch;
    ImageView Wakdoo;
    int i, count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final MediaPlayer mPlayer;
        mPlayer = MediaPlayer.create(this,R.raw.ang);

        int imageResource[] = {R.drawable.wakdoo, R.drawable.smilewak};

        Title = (TextView) findViewById(R.id.Title);
        Touch = (TextView) findViewById(R.id.Touch);
        Wakdoo = (ImageView) findViewById(R.id.Wakdoo);

        Wakdoo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i = count %2;
                if(i == 0) {
                    Wakdoo.setImageResource(imageResource[1]);
                    mPlayer.start();
                }
                if(i == 1) {
                    Wakdoo.setImageResource(imageResource[0]);
                }
                count++;
            }
        });
    }

    public boolean onTouchEvent(MotionEvent event) {
        int action = event.getAction();

        if(action == MotionEvent.ACTION_DOWN){
            Intent intent = new Intent(getApplicationContext(), HomeActivity.class);
            startActivity(intent);
        }
        return super.onTouchEvent(event);
    }
}