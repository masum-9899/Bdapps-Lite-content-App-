package com.example.bdapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class voca2 extends AppCompatActivity {
    private Button button;
    // Add the terms string to the dialog


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_voca2);
        button=findViewById(R.id.voca005);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(voca2.this,MainActivity.class);
                startActivity(intent);
            }
        });



    }
}
