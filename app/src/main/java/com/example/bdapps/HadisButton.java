package com.example.bdapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HadisButton extends AppCompatActivity {
  private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hadis_button);
        button=findViewById(R.id.hadis10);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HadisButton.this,hadis1.class);
                startActivity(intent);
            }
        });

    }
}
