package com.example.cakes3;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class cakeDetails extends AppCompatActivity {

    ImageView back;
    Button b1,b2,b3,b4;

    TextView tv_Price;
    ImageView iv,like;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cake_details);

        back = findViewById(R.id.id_img_back);


        tv_Price = findViewById(R.id.id_tv_price);

        b1 = findViewById(R.id.button);
        b2 = findViewById(R.id.button2);
        b3 = findViewById(R.id.button7);
        b4 = findViewById(R.id.button8);


        iv = findViewById(R.id.image);

        iv.setImageResource(R.drawable.ic_launcher_background);

//        like.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(cakeDetails.this, "Liked", Toast.LENGTH_SHORT).show();
//
//            }
//        });


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(cakeDetails.this,MainActivity.class));
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tv_Price.setText("1200₹");

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tv_Price.setText("1800₹");

            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tv_Price.setText("2500₹");

            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tv_Price.setText("3000₹");

            }
        });



    }
}