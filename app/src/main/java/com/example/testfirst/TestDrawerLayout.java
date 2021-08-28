package com.example.testfirst;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class TestDrawerLayout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_drawer_layout);
        Button btnIntent = findViewById(R.id.btnIntent);
        EditText edtAge = findViewById(R.id.edtAge);

         btnIntent.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 String age = edtAge.getText().toString();
                 Intent intent = new Intent(TestDrawerLayout.this, HtmlTest.class);
                 intent.putExtra("age", age);
                 startActivity(intent);
                 finish();
             }
         });
    }
}