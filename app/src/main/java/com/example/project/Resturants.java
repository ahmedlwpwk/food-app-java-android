package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class Resturants extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resturants);

        RelativeLayout kfc  = (RelativeLayout) findViewById(R.id.kfc);
        RelativeLayout pizzahut  = (RelativeLayout) findViewById(R.id.pizzahut);
        RelativeLayout asmak  = (RelativeLayout) findViewById(R.id.asmak);

        ImageView back = (ImageView) findViewById(R.id.toback);


        ImageView imageView =(ImageView) findViewById(R.id.cart);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(Resturants.this,cart.class);
                startActivity(in);
            }
        });


        kfc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(Resturants.this, "meals of kfc", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Resturants.this , KFC.class);
                startActivity(intent);


            }
        });

        pizzahut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(Resturants.this, "meals of pizza hut", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Resturants.this , PizzaHut.class);
                startActivity(intent);

            }
        });


        asmak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(Resturants.this, "meals of Asmak", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Resturants.this , Asmak.class);
                startActivity(intent);

            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Resturants.this , MainActivity2.class) ;
                startActivity(intent);

            }
        });

    }
}