package com.example.toasttest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    EditText editText2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
        editText2 = findViewById(R.id.editText2);

    }

    public void onButton1Clicked(View view){
        try {
            Toast toastView = Toast.makeText(this, "위치가 바뀐 토스트 메시지", Toast.LENGTH_LONG);
            int xOffset = Integer.parseInt(editText.getText().toString());
            int yOffset = Integer.parseInt(editText2.getText().toString());

            toastView.setGravity(Gravity.TOP, xOffset, yOffset);
            toastView.show();

        } catch (NumberFormatException e){
            e.printStackTrace();
        }
    }







}