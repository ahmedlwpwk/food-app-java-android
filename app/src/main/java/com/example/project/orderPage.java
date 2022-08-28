package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class orderPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_page);

       ImageView back1 =(ImageView) findViewById(R.id.toback1);

       back1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent i = new Intent(orderPage.this,Dessert.class);
               startActivity(i);
           }
       });

       ImageView imageView =(ImageView) findViewById(R.id.cart);

       imageView.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent in = new Intent(orderPage.this,cart.class);
               startActivity(in);
           }
       });


        otlbDBHelper db = new otlbDBHelper(this);

        RelativeLayout R1Monginis =(RelativeLayout) findViewById(R.id.R1Monginis);
        TextView T1_1Monginis =(TextView) findViewById(R.id.T1_1Monginis);
        TextView T1_2Monginis = (TextView) findViewById(R.id.T1_2Monginis);
        R1Monginis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(orderPage.this, "added to the cart", Toast.LENGTH_SHORT).show();
                db.insertNewItem(T1_1Monginis.getText().toString(),T1_2Monginis.getText().toString());
            }
        });

        RelativeLayout R2Monginis =(RelativeLayout) findViewById(R.id.R2Monginis);
        TextView T2_1Monginis =(TextView) findViewById(R.id.T2_1Monginis);
        TextView T2_2Monginis = (TextView) findViewById(R.id.T2_2Monginis);
        R2Monginis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(orderPage.this, "added to the cart", Toast.LENGTH_SHORT).show();
                db.insertNewItem(T2_1Monginis.getText().toString(),T2_2Monginis.getText().toString());
            }
        });

        RelativeLayout R3Monginis =(RelativeLayout) findViewById(R.id.R3Monginis);
        TextView T3_1Monginis =(TextView) findViewById(R.id.T3_1Monginis);
        TextView T3_2Monginis = (TextView) findViewById(R.id.T3_2Monginis);
        R3Monginis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(orderPage.this, "added to the cart", Toast.LENGTH_SHORT).show();
                db.insertNewItem(T3_1Monginis.getText().toString(),T3_2Monginis.getText().toString());
            }
        });

        RelativeLayout R4Monginis =(RelativeLayout) findViewById(R.id.R4Monginis);
        TextView T4_1Monginis =(TextView) findViewById(R.id.T4_1Monginis);
        TextView T4_2Monginis = (TextView) findViewById(R.id.T4_2Monginis);
        R4Monginis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(orderPage.this, "added to the cart", Toast.LENGTH_SHORT).show();
                db.insertNewItem(T4_1Monginis.getText().toString(),T4_2Monginis.getText().toString());
            }
        });

        RelativeLayout R5Monginis =(RelativeLayout) findViewById(R.id.R5Monginis);
        TextView T5_1Monginis =(TextView) findViewById(R.id.T5_1Monginis);
        TextView T5_2Monginis = (TextView) findViewById(R.id.T5_2Monginis);
        R5Monginis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(orderPage.this, "added to the cart", Toast.LENGTH_SHORT).show();
                db.insertNewItem(T5_1Monginis.getText().toString(),T5_2Monginis.getText().toString());
            }
        });


        RelativeLayout R6Monginis =(RelativeLayout) findViewById(R.id.R6Monginis);
        TextView T6_1Monginis =(TextView) findViewById(R.id.T6_1Monginis);
        TextView T6_2Monginis = (TextView) findViewById(R.id.T6_2Monginis);
        R6Monginis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(orderPage.this, "added to the cart", Toast.LENGTH_SHORT).show();
                db.insertNewItem(T6_1Monginis.getText().toString(),T6_2Monginis.getText().toString());
            }
        });
    }
}