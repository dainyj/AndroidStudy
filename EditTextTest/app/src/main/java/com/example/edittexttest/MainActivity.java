package com.example.edittexttest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et = findViewById(R.id.usernameInput);

    }
    public void onInputButtonClicked(View v){
        Toast.makeText(getApplicationContext(),et.getText(), Toast.LENGTH_SHORT).show();
    }

}