package com.cookandroid.termproject;

import android.app.Activity;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import java.net.URI;

public class whoActivity extends AppCompatActivity {

    ImageView whoImage;
    VideoView wakVideo;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("우왁굳 소개");
        setContentView(R.layout.who);
        wakVideo = (VideoView) findViewById(R.id.wakVideo);
        whoImage = (ImageView) findViewById(R.id.whoImage);

        Uri videoUri = Uri.parse("android.resource://"+getPackageName() + "/"+R.raw.sample);
        wakVideo.setMediaController(new MediaController(this));
        wakVideo.setVideoURI(videoUri);
        wakVideo.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                wakVideo.start();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        MenuInflater mInflater = getMenuInflater();
        mInflater.inflate(R.menu.menu1, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.itemWakgood:
                whoImage.setImageResource(R.drawable.wakdoo);
                return true;
            case R.id.itemAngel:
                whoImage.setImageResource(R.drawable.kim);
                return true;
            case R.id.itemMessi:
                whoImage.setImageResource(R.drawable.messi);
                return true;
        }
        return false;
    }
}
