package com.example.bk2k;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class quiz extends AppCompatActivity {

    TextView answerText = findViewById(R.id.answerText);
    RadioButton ans3 = findViewById(R.id.ans3);
    RadioButton a3 = findViewById(R.id.a3);
    Button test = findViewById(R.id.test);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

       /* test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(ans3.isChecked()& a3.isChecked())
                {
                    answerText.setText("You are smart, You got both questions correct!");
                    answerText.setTextColor(Color.GREEN);
                }
                else
                {
                    answerText.setText("You Clearly didnt pass your GCSE Geography! :( ");
                }
            }
        });
*/

    }
}