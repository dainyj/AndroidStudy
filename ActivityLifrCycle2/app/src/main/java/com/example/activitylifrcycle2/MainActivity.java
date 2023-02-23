package com.example.activitylifrcycle2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;


//SharedPreferences 사용 : 앱 안에서 간단한 데이터를 저장하거나 복원할 때 사용
public class MainActivity extends AppCompatActivity {
    EditText nameInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameInput = findViewById(R.id.editText);
    }

    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "onPause 호출됨", Toast.LENGTH_LONG).show();
        saveState();
    }

    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "onResume 호출됨", Toast.LENGTH_LONG).show();
        restoreState();
    }

    private void restoreState() {
        SharedPreferences pref = getSharedPreferences("pref", Activity.MODE_PRIVATE);
        if ((pref != null) && pref.contains("name")) {
            String name = pref.getString("name", "");
            nameInput.setText(name);
        }
    }

    private void saveState() {
        SharedPreferences pref = getSharedPreferences("pref", Activity.MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();
        editor.putString("name", nameInput.getText().toString());
        editor.commit();
    }

    private void clearMuPrefs() {
        SharedPreferences pref = getSharedPreferences("pref", Activity.MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();
        editor.clear();
        editor.commit();
    }


}