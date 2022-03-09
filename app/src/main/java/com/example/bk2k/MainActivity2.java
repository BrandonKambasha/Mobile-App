package com.example.bk2k;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button dice = findViewById(R.id.dice);
        Button calculator = findViewById(R.id.calculator);
        Button files = findViewById(R.id.files);
        Button quiz = findViewById(R.id.quiz);

        ImageView diceImg = findViewById(R.id.diceImg);
        ImageView quizes = findViewById(R.id.quizs);
        ImageView calc = findViewById(R.id.calc);
        ImageView file = findViewById(R.id.file);

        diceImg.setImageResource(R.drawable.pik6);
        calc.setImageResource(R.drawable.calculator);
        file.setImageResource(R.drawable.file);
        quizes.setImageResource(R.drawable.quiz);

        dice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity2.this,dice.class);
                startActivity(i);
            }
        });
        diceImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity2.this,dice.class);
                startActivity(i);
            }
        });

        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity2.this,calculator.class);
                startActivity(i);
            }
        });

        calculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity2.this,calculator.class);
                startActivity(i);
            }
        });

    }
}