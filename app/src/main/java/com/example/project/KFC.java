package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class KFC extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kfc);

        ImageView back1 =(ImageView) findViewById(R.id.tobaack);

        back1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(KFC.this,Resturants.class);
                startActivity(i);
            }
        });

        ImageView imageView =(ImageView) findViewById(R.id.cart);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(KFC.this,cart.class);
                startActivity(in);
            }
        });


        otlbDBHelper db = new otlbDBHelper(this);

        RelativeLayout R1KFC =(RelativeLayout) findViewById(R.id.R1KFC);
        TextView T1_1KFC =(TextView) findViewById(R.id.T1_1KFC);
        TextView T1_2KFC = (TextView) findViewById(R.id.T1_2KFC);
        R1KFC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(KFC.this, "added to the cart", Toast.LENGTH_SHORT).show();
                db.insertNewItem(T1_1KFC.getText().toString(),T1_2KFC.getText().toString());
            }
        });

        RelativeLayout R2KFC =(RelativeLayout) findViewById(R.id.R2KFC);
        TextView T2_1KFC =(TextView) findViewById(R.id.T2_1KFC);
        TextView T2_2KFC = (TextView) findViewById(R.id.T2_2KFC);
        R2KFC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(KFC.this, "added to the cart", Toast.LENGTH_SHORT).show();
                db.insertNewItem(T2_1KFC.getText().toString(),T2_2KFC.getText().toString());
            }
        });

        RelativeLayout R3KFC =(RelativeLayout) findViewById(R.id.R3KFC);
        TextView T3_1KFC =(TextView) findViewById(R.id.T3_1KFC);
        TextView T3_2KFC = (TextView) findViewById(R.id.T3_2KFC);
        R3KFC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(KFC.this, "added to the cart", Toast.LENGTH_SHORT).show();
                db.insertNewItem(T3_1KFC.getText().toString(),T3_2KFC.getText().toString());
            }
        });

        RelativeLayout R4KFC =(RelativeLayout) findViewById(R.id.R4KFC);
        TextView T4_1KFC =(TextView) findViewById(R.id.T4_1KFC);
        TextView T4_2KFC = (TextView) findViewById(R.id.T4_2KFC);
        R4KFC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(KFC.this, "added to the cart", Toast.LENGTH_SHORT).show();
                db.insertNewItem(T4_1KFC.getText().toString(),T4_2KFC.getText().toString());
            }
        });

        RelativeLayout R5KFC =(RelativeLayout) findViewById(R.id.R5KFC);
        TextView T5_1KFC =(TextView) findViewById(R.id.T5_1KFC);
        TextView T5_2KFC = (TextView) findViewById(R.id.T5_2KFC);
        R5KFC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(KFC.this, "added to the cart", Toast.LENGTH_SHORT).show();
                db.insertNewItem(T5_1KFC.getText().toString(),T5_2KFC.getText().toString());
            }
        });


        RelativeLayout R6KFC =(RelativeLayout) findViewById(R.id.R6KFC);
        TextView T6_1KFC =(TextView) findViewById(R.id.T6_1KFC);
        TextView T6_2KFC = (TextView) findViewById(R.id.T6_2KFC);
        R6KFC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(KFC.this, "added to the cart", Toast.LENGTH_SHORT).show();
                db.insertNewItem(T6_1KFC.getText().toString(),T6_2KFC.getText().toString());
            }
        });

    }
}