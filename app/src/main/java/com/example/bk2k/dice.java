package com.example.bk2k;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class dice extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dice);

        TextView topText= findViewById(R.id.topText);
        TextView info = findViewById(R.id.info);
        Button btnNum= findViewById(R.id.btnNum);
        ImageView image = findViewById(R.id.image);

        btnNum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int max=6;
                int min =1;
                int range=max - min + 1;
                int num= (int) ((Math.random() * range) + min);
                String s=Integer.toString(num);

                info.setText("");
                topText.setText(s);
                switch (num)
                {
                    case 1:
                        image.setImageResource(R.drawable.pik1);
                        break;
                    case 2:
                        image.setImageResource(R.drawable.pik2);
                        break;
                    case 3:
                        image.setImageResource(R.drawable.pik);
                        break;
                    case 4:
                        image.setImageResource(R.drawable.pik4);
                        break;
                    case 5:
                        image.setImageResource(R.drawable.pik5);
                        break;
                    case 6:
                        image.setImageResource(R.drawable.pik6);
                        break;
                }



            }
        });
    }
}