package com.example.codenext;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Update(View view){
        Intent intent = new Intent(MainActivity.this, Main2Activity.class);
        startActivity(intent);
    }
    public void Apply(View view){
        Intent intent = new Intent(MainActivity.this, Apply.class);
        startActivity(intent);
    }
    public void Team(View view){
        Intent intent = new Intent(MainActivity.this, TeamActivity.class);
        startActivity(intent);
    }
}
