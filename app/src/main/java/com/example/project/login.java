package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        otlbDBHelper myDB = new otlbDBHelper(this) ;

        TextView email = (TextView) findViewById(R.id.email)  ;
        TextView password = (TextView) findViewById(R.id.password)  ;

        MaterialButton login_btn = (MaterialButton) findViewById(R.id.loginbt);


        TextView forgot_pass = (TextView) findViewById(R.id.fgotpass);

        TextView signup = (TextView) findViewById(R.id.gosignup) ;

        login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String userEmail = email.getText().toString() ;
                String userPassword = password.getText().toString();

                if (userEmail.equals("") || userPassword.equals(""))
                {
                    Toast.makeText(login.this, "You must enter the email and password", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Boolean result_login = myDB.loginCheck (userEmail , userPassword) ;
                    if (result_login == true) {

                        Toast.makeText(login.this, "LOGIN SUCCESSFUL", Toast.LENGTH_SHORT).show();
                        Intent i = new Intent(login.this,MainActivity2.class);
                        startActivity(i);

                    }
                    else
                    {
                        Toast.makeText(login.this, "Wrong email or password !", Toast.LENGTH_SHORT).show();
                    }
                }



            }            });



        forgot_pass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(login.this , forgetpass.class) ;
                startActivity(intent);

            }
        });


        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(login.this , Signup.class) ;
                startActivity(intent);

            }
        });



    }

}