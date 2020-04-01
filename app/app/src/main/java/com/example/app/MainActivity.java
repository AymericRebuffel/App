package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Bouton pour chercher un déchetterie
        Button dechetterie = findViewById(R.id.dechtterie);
        Button decharge = findViewById(R.id.decharge);
    }
}
