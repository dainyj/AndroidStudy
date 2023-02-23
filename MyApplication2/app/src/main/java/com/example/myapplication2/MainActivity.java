package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButton1Clicked(View v){
//        Toast.makeText(getApplicationContext(), "시작 버튼이 눌렸어요", Toast.LENGTH_SHORT).show();
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://m.naver.com"));
        startActivity(myIntent);
    }

    public void onButton2Clicked(View v){
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:010-1234-6789"));
        startActivity(myIntent);
//        Toast.makeText(getApplicationContext(), "안녕", Toast.LENGTH_SHORT).show();
    }

    public void onButton3Clicked(View v){
        Intent intent = new Intent(getApplicationContext(), MenuActivity.class);
        startActivity(intent);
    }

    public void onButton4Clicked(View v){
//        Toast.makeText(getApplicationContext(), "버튼4가 눌렸어요", Toast.LENGTH_SHORT).show();
//        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(""));
        Intent intent = new Intent(Intent.ACTION_MAIN);// 앨범 실행
        startActivity(intent);
    }

}