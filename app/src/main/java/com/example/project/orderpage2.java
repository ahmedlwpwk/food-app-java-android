package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class orderpage2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orderpage2);

        ImageView back1 =(ImageView) findViewById(R.id.toback2);

        back1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(orderpage2.this,Dessert.class);
                startActivity(i);
            }
        });

        ImageView imageView =(ImageView) findViewById(R.id.cart);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(orderpage2.this,cart.class);
                startActivity(in);
            }
        });


        otlbDBHelper db = new otlbDBHelper(this);

        RelativeLayout R1ElAbd =(RelativeLayout) findViewById(R.id.R1ElAbd);
        TextView T1_1ElAbd =(TextView) findViewById(R.id.T1_1ElAbd);
        TextView T1_2ElAbd = (TextView) findViewById(R.id.T1_2ElAbd);
        R1ElAbd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(orderpage2.this, "added to the cart", Toast.LENGTH_SHORT).show();
                db.insertNewItem(T1_1ElAbd.getText().toString(),T1_2ElAbd.getText().toString());
            }
        });

        RelativeLayout R2ElAbd =(RelativeLayout) findViewById(R.id.R2ElAbd);
        TextView T2_1ElAbd =(TextView) findViewById(R.id.T2_1ElAbd);
        TextView T2_2ElAbd = (TextView) findViewById(R.id.T2_2ElAbd);
        R2ElAbd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(orderpage2.this, "added to the cart", Toast.LENGTH_SHORT).show();
                db.insertNewItem(T2_1ElAbd.getText().toString(),T2_2ElAbd.getText().toString());
            }
        });

        RelativeLayout R3ElAbd =(RelativeLayout) findViewById(R.id.R3ElAbd);
        TextView T3_1ElAbd =(TextView) findViewById(R.id.T3_1ElAbd);
        TextView T3_2ElAbd = (TextView) findViewById(R.id.T3_2ElAbd);
        R3ElAbd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(orderpage2.this, "added to the cart", Toast.LENGTH_SHORT).show();
                db.insertNewItem(T3_1ElAbd.getText().toString(),T3_2ElAbd.getText().toString());
            }
        });

        RelativeLayout R4ElAbd =(RelativeLayout) findViewById(R.id.R4ElAbd);
        TextView T4_1ElAbd =(TextView) findViewById(R.id.T4_1ElAbd);
        TextView T4_2ElAbd = (TextView) findViewById(R.id.T4_2ElAbd);
        R4ElAbd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(orderpage2.this, "added to the cart", Toast.LENGTH_SHORT).show();
                db.insertNewItem(T4_1ElAbd.getText().toString(),T4_2ElAbd.getText().toString());
            }
        });

        RelativeLayout R5ElAbd =(RelativeLayout) findViewById(R.id.R5ElAbd);
        TextView T5_1ElAbd =(TextView) findViewById(R.id.T5_1ElAbd);
        TextView T5_2ElAbd = (TextView) findViewById(R.id.T5_2ElAbd);
        R5ElAbd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(orderpage2.this, "added to the cart", Toast.LENGTH_SHORT).show();
                db.insertNewItem(T5_1ElAbd.getText().toString(),T5_2ElAbd.getText().toString());
            }
        });


        RelativeLayout R6ElAbd =(RelativeLayout) findViewById(R.id.R6ElAbd);
        TextView T6_1ElAbd =(TextView) findViewById(R.id.T6_1ElAbd);
        TextView T6_2ElAbd = (TextView) findViewById(R.id.T6_2ElAbd);
        R6ElAbd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(orderpage2.this, "added to the cart", Toast.LENGTH_SHORT).show();
                db.insertNewItem(T6_1ElAbd.getText().toString(),T6_2ElAbd.getText().toString());
            }
        });
    }
}