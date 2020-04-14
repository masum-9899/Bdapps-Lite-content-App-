package com.example.bdapps;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import static com.example.bdapps.R.id.voca002;

public class Vocabulary extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vocabulary);
            // Add the terms string to the dialog
        Button button = findViewById(voca002);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Vocabulary.this,voca3.class);
                startActivity(intent);
            }
        });


    }
    }

