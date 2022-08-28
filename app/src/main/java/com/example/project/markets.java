package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;
public class markets extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_markets);

        RelativeLayout carfour  = (RelativeLayout) findViewById(R.id.carfour);
        RelativeLayout hyperone  = (RelativeLayout) findViewById(R.id.hyperone);
        RelativeLayout spinneys  = (RelativeLayout) findViewById(R.id.spinneys);

        ImageView back = (ImageView) findViewById(R.id.tobackk);

        ImageView imageView =(ImageView) findViewById(R.id.cart);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(markets.this,cart.class);
                startActivity(in);
            }
        });

        carfour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(markets.this, "Carrefour products", Toast.LENGTH_SHORT).show();

                        Intent in = new Intent(markets.this,Carrefour.class);
                        startActivity(in);

            }
        });

        hyperone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(markets.this, "Hyper One products", Toast.LENGTH_SHORT).show();
                Intent in = new Intent(markets.this,Hyper.class);
                startActivity(in);

            }
        });


        spinneys.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(markets.this, "Spinneys products", Toast.LENGTH_SHORT).show();
                Intent in = new Intent(markets.this,Spinneys.class);
                startActivity(in);


            }
        });



        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(markets.this , MainActivity2.class) ;
                startActivity(intent);

            }
        });

    }
}