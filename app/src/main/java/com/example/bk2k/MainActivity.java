package com.example.bk2k;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText username = findViewById(R.id.username);
        EditText password = findViewById(R.id.password);
        TextView error = findViewById(R.id.error);
        Button btnSignIn = findViewById(R.id.btnSignIn);
        ConstraintLayout layout = findViewById(R.id.layout);
        Switch switch1= findViewById(R.id.switch1);

        switch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b)
                {
                    layout.setBackgroundColor(Color.DKGRAY);
                    username.setBackgroundColor(Color.GRAY);
                    password.setBackgroundColor(Color.GRAY);
                }
                else
                {
                    layout.setBackgroundColor(Color.WHITE);
                    username.setBackgroundColor(Color.WHITE);
                    password.setBackgroundColor(Color.WHITE);
                }
            }
        });


        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String test1 = username.getText().toString();
                String test2 = password.getText().toString();

                if(test1.equals("brandon") && test2.equals("password"))
                {

                    Intent i = new Intent(MainActivity.this,MainActivity2.class);
                    startActivity(i);
                }
                else
                {
                    error.setText("Username or Password is Incorrect!!");
                    username.setText("");
                    password.setText("");
                }

            }
        });
    }

}