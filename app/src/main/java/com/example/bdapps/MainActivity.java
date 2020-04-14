package com.example.bdapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView image;
    private Button button;
    private Button Hadis,abbrebition,puzz,diet,caption,benefit,human,gunah,invention,proverb,rajdhani,nobirbanii,synonym;

       @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        image= findViewById(R.id.bdapps);
        button=findViewById(R.id.voc1);
        Hadis= findViewById(R.id.hadis1);
        abbrebition = findViewById(R.id.abbre1);
        puzz=findViewById(R.id.puzzle1);
        diet=findViewById(R.id.diet1);
        caption=findViewById(R.id.caption1);
        benefit=findViewById(R.id.benefit1);
        human=findViewById(R.id.human1);
        gunah=findViewById(R.id.gunah1);
        invention=findViewById(R.id.invention1);
        proverb=findViewById(R.id.proverb1);
        rajdhani=findViewById(R.id.rajdhani1);
        nobirbanii=findViewById(R.id.nobirbani1);
        synonym=findViewById(R.id.syno1);

           synonym.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   Intent intent=new Intent(MainActivity.this,Synonym.class);
                   startActivity(intent);
               }
           });
           nobirbanii.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   Intent intent=new Intent(MainActivity.this,NobirBani.class);
                   startActivity(intent);
               }
           });
           rajdhani.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   Intent intent=new Intent(MainActivity.this,Rajdhani.class);
                   startActivity(intent);
               }
           });

           proverb.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   Intent intent=new Intent(MainActivity.this, quran.class);
                   startActivity(intent);
               }
           });
           invention.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   Intent intent=new Intent(MainActivity.this,Invention.class);
                   startActivity(intent);
               }
           });

           gunah.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   Intent intent=new Intent(MainActivity.this,Gunah.class);
                   startActivity(intent);
               }
           });


           human.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   Intent intent=new Intent(MainActivity.this, gk.class);
                   startActivity(intent);
               }
           });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Vocabulary.class);
                startActivity(intent);
            }
        });



        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent);
            }
        });


           Hadis.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   Intent intent=new Intent(MainActivity.this,HadisButton.class);
                   startActivity(intent);
               }
           });


           abbrebition.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   Intent intent=new Intent(MainActivity.this,Abbre1.class);
                   startActivity(intent);
               }
           });



           puzz.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   Intent intent=new Intent(MainActivity.this,Puzzle.class);
                   startActivity(intent);
               }
           });

           diet.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   Intent intent=new Intent(MainActivity.this, Jokes.class);
                   startActivity(intent);
               }
           });


           caption.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   Intent intent=new Intent(MainActivity.this,FbCaption.class);
                   startActivity(intent);
               }
           });

           benefit.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   Intent intent=new Intent(MainActivity.this,Benefit.class);
                   startActivity(intent);
               }
           });










    }
}
