package com.example.bdapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static com.example.bdapps.R.id.voca002;
import static com.example.bdapps.R.id.voca004;

public class voca3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_voca3);
        Button button = findViewById(voca004);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(voca3.this,voca2.class);
                startActivity(intent);
            }
        });
    }
}
