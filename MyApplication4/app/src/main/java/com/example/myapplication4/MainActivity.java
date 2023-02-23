package com.example.myapplication4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;

public class MainActivity extends AppCompatActivity {
    ImageView imageView, imageView2;
    int imageIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView);
        imageView2 = findViewById(R.id.imageView2);
    }

    public void onButton1Clicked(View v) {
        changeImage();
    }

    private void changeImage(){
        if(imageIndex == 0){
            imageView.setVisibility(View.VISIBLE);
            imageView2.setVisibility(View.INVISIBLE);
            imageIndex = 1;
        } else if(imageIndex == 1){
            imageView.setVisibility(View.INVISIBLE);
            imageView2.setVisibility(View.VISIBLE);
            imageIndex = 0;
        }
    }
}

//  <이미지바꾸기 버튼 터치시 한번만 이미지 바꾸기>
//public class MainActivity extends AppCompatActivity {
//    ScrollView scrollView;
//    ImageView imageView;
//    BitmapDrawable bitmap;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        scrollView = findViewById(R.id.scrollView);
//        imageView = findViewById(R.id.imageView);
//        scrollView.setHorizontalScrollBarEnabled(true);
//
//        Resources res = getResources();
//        bitmap = (BitmapDrawable)res.getDrawable(R.drawable.images1);
//        int bitmapWidth = bitmap.getIntrinsicWidth();
//        int bitmapHeight = bitmap.getIntrinsicHeight();
//
//        imageView.setImageDrawable(bitmap);
//        imageView.getLayoutParams().width = bitmapWidth;
//        imageView.getLayoutParams().height = bitmapHeight;
//    }
//
//    public void onButton1Clicked(View v) {
//        changeImage();
//    }
//
//    private void changeImage(){
//        Resources res = getResources();
//        bitmap = (BitmapDrawable) res.getDrawable(R.drawable.images2);
//        int bitmapWidth = bitmap.getIntrinsicWidth();
//        int bitmapHeight = bitmap.getIntrinsicHeight();
//
//        imageView.setImageDrawable(bitmap);
//        imageView.getLayoutParams().width = bitmapWidth;
//        imageView.getLayoutParams().height = bitmapHeight;
//
//    }
//}