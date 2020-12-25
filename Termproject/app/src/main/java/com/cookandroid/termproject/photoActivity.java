package com.cookandroid.termproject;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class photoActivity extends Activity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.photo);
        setTitle("우왁굳 사진보기");

        final GridView gv = (GridView) findViewById(R.id.gridView1);
        MyGridAdapter gAdapter = new MyGridAdapter(this);
        gv.setAdapter(gAdapter);
    }
    public class MyGridAdapter extends BaseAdapter{
        Context context;

        public MyGridAdapter(Context c){
            context = c;
        }
        public int getCount(){return posterID.length;}

        public Object getItem(int position) {
            // TODO Auto-generated method stub
            return null;
        }

        public long getItemId(int position) {
            // TODO Auto-generated method stub
            return 0;
        }

        Integer[] posterID = {R.drawable.wakdoo, R.drawable.angeldoo, R.drawable.babydoo,
                R.drawable.beforedoo, R.drawable.jokerdoo, R.drawable.lisin, R.drawable.insectdoo,
                R.drawable.messidoo, R.drawable.picolodoo, R.drawable.sunbidoo, R.drawable.olddoo,
                R.drawable.frontdoo, R.drawable.minsudoo, R.drawable.simhaedoo};

        public View getView(int position, View convertView, ViewGroup parent){
            ImageView imageview = new ImageView(context);
            imageview.setLayoutParams(new GridView.LayoutParams(400, 600));
            imageview.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageview.setPadding(5, 5, 5, 5);

            imageview.setImageResource(posterID[position]);

            final int pos = position;
            imageview.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    View dialogView = (View) View.inflate(
                            photoActivity.this, R.layout.dialog, null);
                    AlertDialog.Builder dlg = new AlertDialog.Builder(
                            photoActivity.this);
                    ImageView ivPoster = (ImageView) dialogView.findViewById(R.id.wakPoster);
                    ivPoster.setImageResource(posterID[pos]);
                    dlg.setTitle("사진 크게보기");
                    dlg.setIcon(R.drawable.wakdoo);
                    dlg.setView(dialogView);
                    dlg.setNegativeButton("닫기", null);
                    dlg.show();
                }
            });
            return imageview;
        }
    }
}
