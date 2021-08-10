package com.example.testfirst;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Logcat", "onCreate");
        Button btnSave = findViewById(R.id.btnSave);
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "item saves!", Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Logcat","onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Logcat","onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Logcat","onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Logcat","onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Logcat","onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Logcat","onDestroy");
    }
}