package com.example.bk2k;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class calculator extends AppCompatActivity {

    EditText numPad;
    Button plus;
    Button minus;
    Button times;
    Button divide;
    Button equal;
    TextView answer;
    double number1;
    double number2;
    String first;
    String second;
    String value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        numPad=findViewById(R.id.numPad);
        plus=findViewById(R.id.plus);
        minus=findViewById(R.id.minus);
        times=findViewById(R.id.times);
        divide=findViewById(R.id.divide);
        answer=findViewById(R.id.answer);
        equal=findViewById(R.id.equal);


        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                first = numPad.getText().toString();
                number1 = Double.parseDouble(first);
                numPad.setText("");
                value = "divide";
            }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                first = numPad.getText().toString();
                number1 = Double.parseDouble(first);
                numPad.setText("");
                value ="plus";
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                first = numPad.getText().toString();
                number1 = Double.parseDouble(first);
                numPad.setText("");
                value = "minus";
            }
        });

        times.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                first = numPad.getText().toString();
                number1 = Double.parseDouble(first);
                numPad.setText("");
                value = "times";
            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                second = numPad.getText().toString();
                if(!second.equals("."))
                {
                    number2 = Double.parseDouble(second);
                }
                else
                {
                    number2 = Double.parseDouble(second);
                }
                numPad.setText("");
                if(value.equals("divide"))
                {

                    answer.setText("The answer is "+number1/number2);
                }
                else if(value.equals("times"))
                {
                    answer.setText("The answer is "+number1*number2);
                }
                else if(value.equals("minus"))
                {
                    answer.setText("The answer is "+(number1-number2));
                }
                else if(value.equals("plus"))
                {
                    answer.setText("The answer is "+(number1+number2));
                }
            }
        });

    }
}