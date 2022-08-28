package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class Carrefour extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carrefour);


        ImageView back1 =(ImageView) findViewById(R.id.tobaackk);

        back1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Carrefour.this,markets.class);
                startActivity(i);
            }
        });

        ImageView imageView =(ImageView) findViewById(R.id.cart);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(Carrefour.this,cart.class);
                startActivity(in);
            }
        });


        otlbDBHelper db = new otlbDBHelper(this);

        RelativeLayout R1Carrefour =(RelativeLayout) findViewById(R.id.R1Carrefour);
        TextView T1_1Carrefour =(TextView) findViewById(R.id.T1_1Carrefour);
        TextView T1_2Carrefour = (TextView) findViewById(R.id.T1_2Carrefour);
        R1Carrefour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(Carrefour.this, "added to the cart", Toast.LENGTH_SHORT).show();
                db.insertNewItem(T1_1Carrefour.getText().toString(),T1_2Carrefour.getText().toString());
            }
        });

        RelativeLayout R2Carrefour =(RelativeLayout) findViewById(R.id.R2Carrefour);
        TextView T2_1Carrefour =(TextView) findViewById(R.id.T2_1Carrefour);
        TextView T2_2Carrefour = (TextView) findViewById(R.id.T2_2Carrefour);
        R2Carrefour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(Carrefour.this, "added to the cart", Toast.LENGTH_SHORT).show();
                db.insertNewItem(T2_1Carrefour.getText().toString(),T2_2Carrefour.getText().toString());
            }
        });

        RelativeLayout R3Carrefour =(RelativeLayout) findViewById(R.id.R3Carrefour);
        TextView T3_1Carrefour =(TextView) findViewById(R.id.T3_1Carrefour);
        TextView T3_2Carrefour = (TextView) findViewById(R.id.T3_2Carrefour);
        R3Carrefour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(Carrefour.this, "added to the cart", Toast.LENGTH_SHORT).show();
                db.insertNewItem(T3_1Carrefour.getText().toString(),T3_2Carrefour.getText().toString());
            }
        });

        RelativeLayout R4Carrefour =(RelativeLayout) findViewById(R.id.R4Carrefour);
        TextView T4_1Carrefour =(TextView) findViewById(R.id.T4_1Carrefour);
        TextView T4_2Carrefour = (TextView) findViewById(R.id.T4_2Carrefour);
        R4Carrefour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(Carrefour.this, "added to the cart", Toast.LENGTH_SHORT).show();
                db.insertNewItem(T4_1Carrefour.getText().toString(),T4_2Carrefour.getText().toString());
            }
        });

        RelativeLayout R5Carrefour =(RelativeLayout) findViewById(R.id.R5Carrefour);
        TextView T5_1Carrefour =(TextView) findViewById(R.id.T5_1Carrefour);
        TextView T5_2Carrefour = (TextView) findViewById(R.id.T5_2Carrefour);
        R5Carrefour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(Carrefour.this, "added to the cart", Toast.LENGTH_SHORT).show();
                db.insertNewItem(T5_1Carrefour.getText().toString(),T5_2Carrefour.getText().toString());
            }
        });


        RelativeLayout R6Carrefour =(RelativeLayout) findViewById(R.id.R6Carrefour);
        TextView T6_1Carrefour =(TextView) findViewById(R.id.T6_1Carrefour);
        TextView T6_2Carrefour = (TextView) findViewById(R.id.T6_2Carrefour);
        R6Carrefour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(Carrefour.this, "added to the cart", Toast.LENGTH_SHORT).show();
                db.insertNewItem(T6_1Carrefour.getText().toString(),T6_2Carrefour.getText().toString());
            }
        });


        RelativeLayout R7Carrefour =(RelativeLayout) findViewById(R.id.R7Carrefour);
        TextView T7_1Carrefour =(TextView) findViewById(R.id.T7_1Carrefour);
        TextView T7_2Carrefour = (TextView) findViewById(R.id.T7_2Carrefour);
        R7Carrefour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(Carrefour.this, "added to the cart", Toast.LENGTH_SHORT).show();
                db.insertNewItem(T7_1Carrefour.getText().toString(),T7_2Carrefour.getText().toString());
            }
        });


        RelativeLayout R8Carrefour =(RelativeLayout) findViewById(R.id.R8Carrefour);
        TextView T8_1Carrefour =(TextView) findViewById(R.id.T8_1Carrefour);
        TextView T8_2Carrefour = (TextView) findViewById(R.id.T8_2Carrefour);
        R8Carrefour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(Carrefour.this, "added to the cart", Toast.LENGTH_SHORT).show();
                db.insertNewItem(T8_1Carrefour.getText().toString(),T8_2Carrefour.getText().toString());
            }
        });
    }
}