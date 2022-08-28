package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;
public class Dessert extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dessert);

        RelativeLayout monginis  = (RelativeLayout) findViewById(R.id.monginis);
        RelativeLayout elabd  = (RelativeLayout) findViewById(R.id.elabd);
        RelativeLayout etoile  = (RelativeLayout) findViewById(R.id.etoile);

        ImageView back = (ImageView) findViewById(R.id.to_back);


        ImageView imageView =(ImageView) findViewById(R.id.cart);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(Dessert.this,cart.class);
                startActivity(in);
            }
        });

        monginis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(Dessert.this, "Monginis Sweets", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Dessert.this , orderPage.class) ;
                startActivity(intent);


            }
        });

        elabd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(Dessert.this, "El-Abd Sweets", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Dessert.this , orderpage2.class) ;
                startActivity(intent);


            }
        });


        etoile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(Dessert.this, "Etoile Sweets", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Dessert.this , etoile.class) ;
                startActivity(intent);



            }
        });



        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Dessert.this , MainActivity2.class) ;
                startActivity(intent);

            }
        });


    }
}