package com.example.bdapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NobirBani extends AppCompatActivity {

    private Button button;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nobir_bani);

        button=findViewById(R.id.nobi11);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(NobirBani.this,nobir1.class);
                startActivity(intent);
            }
        });

    }
}
