package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class PizzaHut extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizza_hut);


        ImageView back1 =(ImageView) findViewById(R.id.toback4);

        back1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(PizzaHut.this,Resturants.class);
                startActivity(i);
            }
        });

        ImageView imageView =(ImageView) findViewById(R.id.cart2);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(PizzaHut.this,cart.class);
                startActivity(in);
            }
        });


        otlbDBHelper db = new otlbDBHelper(this);

        RelativeLayout R1PizzaHut =(RelativeLayout) findViewById(R.id.R1PizzaHut);
        TextView T1_1PizzaHut =(TextView) findViewById(R.id.T1_1PizzaHut);
        TextView T1_2PizzaHut = (TextView) findViewById(R.id.T1_2PizzaHut);
        R1PizzaHut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(PizzaHut.this, "added to the cart", Toast.LENGTH_SHORT).show();
                db.insertNewItem(T1_1PizzaHut.getText().toString(),T1_2PizzaHut.getText().toString());
            }
        });

        RelativeLayout R2PizzaHut =(RelativeLayout) findViewById(R.id.R2PizzaHut);
        TextView T2_1PizzaHut =(TextView) findViewById(R.id.T2_1PizzaHut);
        TextView T2_2PizzaHut = (TextView) findViewById(R.id.T2_2PizzaHut);
        R2PizzaHut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(PizzaHut.this, "added to the cart", Toast.LENGTH_SHORT).show();
                db.insertNewItem(T2_1PizzaHut.getText().toString(),T2_2PizzaHut.getText().toString());
            }
        });

        RelativeLayout R3PizzaHut =(RelativeLayout) findViewById(R.id.R3PizzaHut);
        TextView T3_1PizzaHut =(TextView) findViewById(R.id.T3_1PizzaHut);
        TextView T3_2PizzaHut = (TextView) findViewById(R.id.T3_2PizzaHut);
        R3PizzaHut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(PizzaHut.this, "added to the cart", Toast.LENGTH_SHORT).show();
                db.insertNewItem(T3_1PizzaHut.getText().toString(),T3_2PizzaHut.getText().toString());
            }
        });

        RelativeLayout R4PizzaHut =(RelativeLayout) findViewById(R.id.R4PizzaHut);
        TextView T4_1PizzaHut =(TextView) findViewById(R.id.T4_1PizzaHut);
        TextView T4_2PizzaHut = (TextView) findViewById(R.id.T4_2PizzaHut);
        R4PizzaHut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(PizzaHut.this, "added to the cart", Toast.LENGTH_SHORT).show();
                db.insertNewItem(T4_1PizzaHut.getText().toString(),T4_2PizzaHut.getText().toString());
            }
        });

        RelativeLayout R5PizzaHut =(RelativeLayout) findViewById(R.id.R5PizzaHut);
        TextView T5_1PizzaHut =(TextView) findViewById(R.id.T5_1PizzaHut);
        TextView T5_2PizzaHut = (TextView) findViewById(R.id.T5_2PizzaHut);
        R5PizzaHut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(PizzaHut.this, "added to the cart", Toast.LENGTH_SHORT).show();
                db.insertNewItem(T5_1PizzaHut.getText().toString(),T5_2PizzaHut.getText().toString());
            }
        });


        RelativeLayout R6PizzaHut =(RelativeLayout) findViewById(R.id.R6PizzaHut);
        TextView T6_1PizzaHut =(TextView) findViewById(R.id.T6_1PizzaHut);
        TextView T6_2PizzaHut = (TextView) findViewById(R.id.T6_2PizzaHut);
        R6PizzaHut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(PizzaHut.this, "added to the cart", Toast.LENGTH_SHORT).show();
                db.insertNewItem(T6_1PizzaHut.getText().toString(),T6_2PizzaHut.getText().toString());
            }
        });

        RelativeLayout R7PizzaHut =(RelativeLayout) findViewById(R.id.R7PizzaHut);
        TextView T7_1PizzaHut =(TextView) findViewById(R.id.T7_1PizzaHut);
        TextView T7_2PizzaHut = (TextView) findViewById(R.id.T7_2PizzaHut);
        R6PizzaHut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(PizzaHut.this, "added to the cart", Toast.LENGTH_SHORT).show();
                db.insertNewItem(T7_1PizzaHut.getText().toString(),T7_2PizzaHut.getText().toString());
            }
        });
    }
}