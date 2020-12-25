package com.cookandroid.termproject;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.io.FileOutputStream;
import java.io.IOException;

public class fanActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fan);

        RadioButton Yes, No;
        EditText etName, etPnum, etDeter;
        Button btnOK;
        final TextView[] toastText1 = new TextView[1];
        final View[] toastView = new View[1];

        btnOK = (Button) findViewById(R.id.btnOK);
        etName = (EditText) findViewById(R.id.etName);
        etPnum = (EditText) findViewById(R.id.etPnum);
        etDeter = (EditText) findViewById(R.id.etDeter);
        Yes = (RadioButton) findViewById(R.id.Yes);
        No = (RadioButton) findViewById(R.id.No);

        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               if(Yes.isChecked() == true) {
                   try {
                       String data = "이름 : " + etName.getText().toString() +" 핸드폰 번호 : "+ etPnum.getText().toString() + " 각오 한마디 : " + etDeter.getText().toString();

                       FileOutputStream outFs = openFileOutput("data.txt", Context.MODE_PRIVATE);
                       outFs.write(data.getBytes());
                       outFs.close();
                       Toast toast = new Toast(fanActivity.this);
                       toastView[0] = (View) View.inflate(fanActivity.this, R.layout.toast1, null);
                       toastText1[0] = (TextView) toastView[0].findViewById(R.id.toastText1);
                       toast.setView(toastView[0]);
                       toast.show();

                       etName.setText("");
                       etPnum.setText("");
                       etDeter.setText("");
                   } catch (Exception e) {
                       e.printStackTrace();
                   }
               }
               else if(No.isChecked() == true){
                   Toast.makeText(fanActivity.this, "마음가짐을 다시 하고 입력하세요!!", Toast.LENGTH_SHORT).show();
                   etName.setText("");
                   etPnum.setText("");
                   etDeter.setText("");
               }
            }
        });

    }
}
