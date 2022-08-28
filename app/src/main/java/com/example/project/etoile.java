package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class etoile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_etoile);

        ImageView back1 =(ImageView) findViewById(R.id.toback4);

        back1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(etoile.this,Dessert.class);
                startActivity(i);
            }
        });

        ImageView imageView =(ImageView) findViewById(R.id.cart1);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(etoile.this,cart.class);
                startActivity(in);
            }
        });


        otlbDBHelper db = new otlbDBHelper(this);

        RelativeLayout R1 =(RelativeLayout) findViewById(R.id.R1);
        TextView T1_1 =(TextView) findViewById(R.id.T1_1);
        TextView T1_2 = (TextView) findViewById(R.id.T1_2);
        R1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(etoile.this, "added to the cart", Toast.LENGTH_SHORT).show();
                db.insertNewItem(T1_1.getText().toString(),T1_2.getText().toString());
            }
        });

        RelativeLayout R2 =(RelativeLayout) findViewById(R.id.R2);
        TextView T2_1 =(TextView) findViewById(R.id.T2_1);
        TextView T2_2 = (TextView) findViewById(R.id.T2_2);
        R2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(etoile.this, "added to the cart", Toast.LENGTH_SHORT).show();
                db.insertNewItem(T2_1.getText().toString(),T2_2.getText().toString());
            }
        });

        RelativeLayout R3 =(RelativeLayout) findViewById(R.id.R3);
        TextView T3_1 =(TextView) findViewById(R.id.T3_1);
        TextView T3_2 = (TextView) findViewById(R.id.T3_2);
        R3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(etoile.this, "added to the cart", Toast.LENGTH_SHORT).show();
                db.insertNewItem(T3_1.getText().toString(),T3_2.getText().toString());
            }
        });

        RelativeLayout R4 =(RelativeLayout) findViewById(R.id.R4);
        TextView T4_1 =(TextView) findViewById(R.id.T4_1);
        TextView T4_2 = (TextView) findViewById(R.id.T4_2);
        R4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(etoile.this, "added to the cart", Toast.LENGTH_SHORT).show();
                db.insertNewItem(T4_1.getText().toString(),T4_2.getText().toString());
            }
        });

        RelativeLayout R5 =(RelativeLayout) findViewById(R.id.R5);
        TextView T5_1 =(TextView) findViewById(R.id.T5_1);
        TextView T5_2 = (TextView) findViewById(R.id.T5_2);
        R5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(etoile.this, "added to the cart", Toast.LENGTH_SHORT).show();
                db.insertNewItem(T5_1.getText().toString(),T5_2.getText().toString());
            }
        });


        RelativeLayout R6 =(RelativeLayout) findViewById(R.id.R6);
        TextView T6_1 =(TextView) findViewById(R.id.T6_1);
        TextView T6_2 = (TextView) findViewById(R.id.T6_2);
        R6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(etoile.this, "added to the cart", Toast.LENGTH_SHORT).show();
                db.insertNewItem(T6_1.getText().toString(),T6_2.getText().toString());
            }
        });
    }
}