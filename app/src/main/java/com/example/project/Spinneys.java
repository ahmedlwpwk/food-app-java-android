package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class Spinneys extends AppCompatActivity {
    LinearLayout all;
    Switch sw0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinneys);

        ImageView back = (ImageView) findViewById(R.id.tobaackk);

        all=findViewById(R.id.all);
        sw0=findViewById(R.id.switch1);
        sw0.setText(R.string.mode0);
        sw0.setTextColor(Color.GRAY);
        sw0.setChecked(false);
        sw0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(sw0.isChecked()){
                    all.setBackgroundColor(Color.BLACK);
                    sw0.setText(R.string.mode1);
                    sw0.setTextColor(Color.MAGENTA);}
                else {
                    sw0.setText(R.string.mode0);
                    sw0.setTextColor(Color.BLACK);
                    all.setBackgroundColor(Color.rgb(117,255,220));
                }
            }
        });

        back.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent in = new Intent(Spinneys.this,markets.class);
                startActivity(in);

            }
        });


        ImageView imageView =(ImageView) findViewById(R.id.cart);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(Spinneys.this,cart.class);
                startActivity(in);
            }
        });


        otlbDBHelper db = new otlbDBHelper(this);

        RelativeLayout R1Spinneys =(RelativeLayout) findViewById(R.id.R1Spinneys);
        TextView T1_1Spinneys =(TextView) findViewById(R.id.T1_1Spinneys);
        TextView T1_2Spinneys = (TextView) findViewById(R.id.T1_2Spinneys);
        R1Spinneys.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(Spinneys.this, "added to the cart", Toast.LENGTH_SHORT).show();
                db.insertNewItem(T1_1Spinneys.getText().toString(),T1_2Spinneys.getText().toString());
            }
        });

        RelativeLayout R2Spinneys =(RelativeLayout) findViewById(R.id.R2Spinneys);
        TextView T2_1Spinneys =(TextView) findViewById(R.id.T2_1Spinneys);
        TextView T2_2Spinneys = (TextView) findViewById(R.id.T2_2Spinneys);
        R2Spinneys.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(Spinneys.this, "added to the cart", Toast.LENGTH_SHORT).show();
                db.insertNewItem(T2_1Spinneys.getText().toString(),T2_2Spinneys.getText().toString());
            }
        });

        RelativeLayout R3Spinneys =(RelativeLayout) findViewById(R.id.R3Spinneys);
        TextView T3_1Spinneys =(TextView) findViewById(R.id.T3_1Spinneys);
        TextView T3_2Spinneys = (TextView) findViewById(R.id.T3_2Spinneys);
        R3Spinneys.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(Spinneys.this, "added to the cart", Toast.LENGTH_SHORT).show();
                db.insertNewItem(T3_1Spinneys.getText().toString(),T3_2Spinneys.getText().toString());
            }
        });

        RelativeLayout R4Spinneys =(RelativeLayout) findViewById(R.id.R4Spinneys);
        TextView T4_1Spinneys =(TextView) findViewById(R.id.T4_1Spinneys);
        TextView T4_2Spinneys = (TextView) findViewById(R.id.T4_2Spinneys);
        R4Spinneys.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(Spinneys.this, "added to the cart", Toast.LENGTH_SHORT).show();
                db.insertNewItem(T4_1Spinneys.getText().toString(),T4_2Spinneys.getText().toString());
            }
        });

        RelativeLayout R5Spinneys =(RelativeLayout) findViewById(R.id.R5Spinneys);
        TextView T5_1Spinneys =(TextView) findViewById(R.id.T5_1Spinneys);
        TextView T5_2Spinneys = (TextView) findViewById(R.id.T5_2Spinneys);
        R5Spinneys.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(Spinneys.this, "added to the cart", Toast.LENGTH_SHORT).show();
                db.insertNewItem(T5_1Spinneys.getText().toString(),T5_2Spinneys.getText().toString());
            }
        });


        RelativeLayout R6Spinneys =(RelativeLayout) findViewById(R.id.R6Spinneys);
        TextView T6_1Spinneys =(TextView) findViewById(R.id.T6_1Spinneys);
        TextView T6_2Spinneys = (TextView) findViewById(R.id.T6_2Spinneys);
        R6Spinneys.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(Spinneys.this, "added to the cart", Toast.LENGTH_SHORT).show();
                db.insertNewItem(T6_1Spinneys.getText().toString(),T6_2Spinneys.getText().toString());
            }
        });


        RelativeLayout R7Spinneys =(RelativeLayout) findViewById(R.id.R7Spinneys);
        TextView T7_1Spinneys =(TextView) findViewById(R.id.T7_1Spinneys);
        TextView T7_2Spinneys = (TextView) findViewById(R.id.T7_2Spinneys);
        R7Spinneys.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(Spinneys.this, "added to the cart", Toast.LENGTH_SHORT).show();
                db.insertNewItem(T7_1Spinneys.getText().toString(),T7_2Spinneys.getText().toString());
            }
        });


        RelativeLayout R8Spinneys =(RelativeLayout) findViewById(R.id.R8Spinneys);
        TextView T8_1Spinneys =(TextView) findViewById(R.id.T8_1Spinneys);
        TextView T8_2Spinneys = (TextView) findViewById(R.id.T8_2Spinneys);
        R8Spinneys.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(Spinneys.this, "added to the cart", Toast.LENGTH_SHORT).show();
                db.insertNewItem(T8_1Spinneys.getText().toString(),T8_2Spinneys.getText().toString());
            }
        });

    }
}