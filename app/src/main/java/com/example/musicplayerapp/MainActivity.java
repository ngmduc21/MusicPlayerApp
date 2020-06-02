package com.example.musicplayerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Mo Lab1.2a
        button = findViewById(R.id.buttonplayer);
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                openPlayer();
            }
        });
    }
    //Ham mo player
    public void openPlayer(){
        Intent intent = new Intent(this,musicplayer.class);
        startActivity(intent);}
}
