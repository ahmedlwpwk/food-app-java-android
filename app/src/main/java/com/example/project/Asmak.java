package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class Asmak extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asmak);

        ImageView back1 =(ImageView) findViewById(R.id.tobackk);

        back1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Asmak.this,Resturants.class);
                startActivity(i);
            }
        });

        ImageView imageView =(ImageView) findViewById(R.id.cart);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(Asmak.this,cart.class);
                startActivity(in);
            }
        });


        otlbDBHelper db = new otlbDBHelper(this);

        RelativeLayout R1Asmak =(RelativeLayout) findViewById(R.id.R1Asmak);
        TextView T1_1Asmak =(TextView) findViewById(R.id.T1_1Asmak);
        TextView T1_2Asmak = (TextView) findViewById(R.id.T1_2Asmak);
        R1Asmak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(Asmak.this, "added to the cart", Toast.LENGTH_SHORT).show();
                db.insertNewItem(T1_1Asmak.getText().toString(),T1_2Asmak.getText().toString());
            }
        });

        RelativeLayout R2Asmak =(RelativeLayout) findViewById(R.id.R2Asmak);
        TextView T2_1Asmak =(TextView) findViewById(R.id.T2_1Asmak);
        TextView T2_2Asmak = (TextView) findViewById(R.id.T2_2Asmak);
        R2Asmak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(Asmak.this, "added to the cart", Toast.LENGTH_SHORT).show();
                db.insertNewItem(T2_1Asmak.getText().toString(),T2_2Asmak.getText().toString());
            }
        });

        RelativeLayout R3Asmak =(RelativeLayout) findViewById(R.id.R3Asmak);
        TextView T3_1Asmak =(TextView) findViewById(R.id.T3_1Asmak);
        TextView T3_2Asmak = (TextView) findViewById(R.id.T3_2Asmak);
        R3Asmak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(Asmak.this, "added to the cart", Toast.LENGTH_SHORT).show();
                db.insertNewItem(T3_1Asmak.getText().toString(),T3_2Asmak.getText().toString());
            }
        });

        RelativeLayout R4Asmak =(RelativeLayout) findViewById(R.id.R4Asmak);
        TextView T4_1Asmak =(TextView) findViewById(R.id.T4_1Asmak);
        TextView T4_2Asmak = (TextView) findViewById(R.id.T4_2Asmak);
        R4Asmak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(Asmak.this, "added to the cart", Toast.LENGTH_SHORT).show();
                db.insertNewItem(T4_1Asmak.getText().toString(),T4_2Asmak.getText().toString());
            }
        });

        RelativeLayout R5Asmak =(RelativeLayout) findViewById(R.id.R5Asmak);
        TextView T5_1Asmak =(TextView) findViewById(R.id.T5_1Asmak);
        TextView T5_2Asmak = (TextView) findViewById(R.id.T5_2Asmak);
        R5Asmak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(Asmak.this, "added to the cart", Toast.LENGTH_SHORT).show();
                db.insertNewItem(T5_1Asmak.getText().toString(),T5_2Asmak.getText().toString());
            }
        });


        RelativeLayout R6Asmak =(RelativeLayout) findViewById(R.id.R6Asmak);
        TextView T6_1Asmak =(TextView) findViewById(R.id.T6_1Asmak);
        TextView T6_2Asmak = (TextView) findViewById(R.id.T6_2Asmak);
        R6Asmak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(Asmak.this, "added to the cart", Toast.LENGTH_SHORT).show();
                db.insertNewItem(T6_1Asmak.getText().toString(),T6_2Asmak.getText().toString());
            }
        });

    }
}