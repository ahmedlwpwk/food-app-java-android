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

public class Hyper extends AppCompatActivity {
    private LinearLayout all2;
    private Switch sw0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hyper);


        ImageView back = (ImageView) findViewById(R.id.tobaackk);


        all2=findViewById(R.id.all2);
        sw0=findViewById(R.id.switch1);
        sw0.setText(R.string.mode0);
        sw0.setTextColor(Color.GRAY);
        sw0.setChecked(false);
        sw0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(sw0.isChecked()){
                    all2.setBackgroundColor(Color.BLACK);
                    sw0.setText(R.string.mode1);
                    sw0.setTextColor(Color.MAGENTA);}
                else {
                    sw0.setText(R.string.mode0);
                    sw0.setTextColor(Color.BLACK);
                    all2.setBackgroundColor(Color.rgb(117,255,220));
                }
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent in = new Intent(Hyper.this,markets.class);
                startActivity(in);

            }
        });


        ImageView imageView =(ImageView) findViewById(R.id.cart);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(Hyper.this,cart.class);
                startActivity(in);
            }
        });


        otlbDBHelper db = new otlbDBHelper(this);

        RelativeLayout R1Hyper =(RelativeLayout) findViewById(R.id.R1Hyper);
        TextView T1_1Hyper =(TextView) findViewById(R.id.T1_1Hyper);
        TextView T1_2Hyper = (TextView) findViewById(R.id.T1_2Hyper);
        R1Hyper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(Hyper.this, "added to the cart", Toast.LENGTH_SHORT).show();
                db.insertNewItem(T1_1Hyper.getText().toString(),T1_2Hyper.getText().toString());
            }
        });

        RelativeLayout R2Hyper =(RelativeLayout) findViewById(R.id.R2Hyper);
        TextView T2_1Hyper =(TextView) findViewById(R.id.T2_1Hyper);
        TextView T2_2Hyper = (TextView) findViewById(R.id.T2_2Hyper);
        R2Hyper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(Hyper.this, "added to the cart", Toast.LENGTH_SHORT).show();
                db.insertNewItem(T2_1Hyper.getText().toString(),T2_2Hyper.getText().toString());
            }
        });

        RelativeLayout R3Hyper =(RelativeLayout) findViewById(R.id.R3Hyper);
        TextView T3_1Hyper =(TextView) findViewById(R.id.T3_1Hyper);
        TextView T3_2Hyper = (TextView) findViewById(R.id.T3_2Hyper);
        R3Hyper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(Hyper.this, "added to the cart", Toast.LENGTH_SHORT).show();
                db.insertNewItem(T3_1Hyper.getText().toString(),T3_2Hyper.getText().toString());
            }
        });

        RelativeLayout R4Hyper =(RelativeLayout) findViewById(R.id.R4Hyper);
        TextView T4_1Hyper =(TextView) findViewById(R.id.T4_1Hyper);
        TextView T4_2Hyper = (TextView) findViewById(R.id.T4_2Hyper);
        R4Hyper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(Hyper.this, "added to the cart", Toast.LENGTH_SHORT).show();
                db.insertNewItem(T4_1Hyper.getText().toString(),T4_2Hyper.getText().toString());
            }
        });

        RelativeLayout R5Hyper =(RelativeLayout) findViewById(R.id.R5Hyper);
        TextView T5_1Hyper =(TextView) findViewById(R.id.T5_1Hyper);
        TextView T5_2Hyper = (TextView) findViewById(R.id.T5_2Hyper);
        R5Hyper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(Hyper.this, "added to the cart", Toast.LENGTH_SHORT).show();
                db.insertNewItem(T5_1Hyper.getText().toString(),T5_2Hyper.getText().toString());
            }
        });


        RelativeLayout R6Hyper =(RelativeLayout) findViewById(R.id.R6Hyper);
        TextView T6_1Hyper =(TextView) findViewById(R.id.T6_1Hyper);
        TextView T6_2Hyper = (TextView) findViewById(R.id.T6_2Hyper);
        R6Hyper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(Hyper.this, "added to the cart", Toast.LENGTH_SHORT).show();
                db.insertNewItem(T6_1Hyper.getText().toString(),T6_2Hyper.getText().toString());
            }
        });


        RelativeLayout R7Hyper =(RelativeLayout) findViewById(R.id.R7Hyper);
        TextView T7_1Hyper =(TextView) findViewById(R.id.T7_1Hyper);
        TextView T7_2Hyper = (TextView) findViewById(R.id.T7_2Hyper);
        R7Hyper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(Hyper.this, "added to the cart", Toast.LENGTH_SHORT).show();
                db.insertNewItem(T7_1Hyper.getText().toString(),T7_2Hyper.getText().toString());
            }
        });


        RelativeLayout R8Hyper =(RelativeLayout) findViewById(R.id.R8Hyper);
        TextView T8_1Hyper =(TextView) findViewById(R.id.T8_1Hyper);
        TextView T8_2Hyper = (TextView) findViewById(R.id.T8_2Hyper);
        R8Hyper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(Hyper.this, "added to the cart", Toast.LENGTH_SHORT).show();
                db.insertNewItem(T8_1Hyper.getText().toString(),T8_2Hyper.getText().toString());
            }
        });

    }
}