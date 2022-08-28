package com.example.project;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import java.nio.charset.StandardCharsets;

public class cart extends AppCompatActivity {

    ArrayAdapter<String> listAdapter;
    otlbDBHelper db;
    int Position;
    ListView myList ;
    Cursor cursor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);

        db = new otlbDBHelper(this);
        Button confirm_btn =(Button) findViewById(R.id.confirm_btn);
        Button clear_btn = (Button) findViewById(R.id.clear_btn);
        ImageView back = (ImageView) findViewById(R.id.toback3);
        EditText totalPrice = (EditText) findViewById(R.id.totalprice);
        myList = (ListView) findViewById(R.id.listview);
        listAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1);
        myList.setAdapter(listAdapter);

        registerForContextMenu(myList);

        int sum = db.gettingPriceSum();
        totalPrice.setText(String.valueOf(sum));

        cursor = db.fetchAllItems();
        while (!cursor.isAfterLast())
             {
                 String name = cursor.getString(1);
                 String price = cursor.getString(2);
                 listAdapter.add(name+"    "+price);
                 cursor.moveToNext();
             }


        myList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Position = position;
            }
        });

        confirm_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(cart.this,"Payment success",Toast.LENGTH_LONG).show();
                db.clearCart();
                listAdapter.clear();
                Intent intent = new Intent(cart.this , MainActivity2.class);
                startActivity(intent);
            }
        });

        clear_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(cart.this,"cart cleared",Toast.LENGTH_LONG).show();
                db.clearCart();
                listAdapter.clear();
                totalPrice.setText("0");
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(cart.this , MainActivity2.class) ;
                startActivity(intent);

            }
        });
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        MenuInflater inflater = new MenuInflater(this);
        inflater.inflate(R.menu.menu,menu);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.remove:
            cursor.moveToPosition(Position);
            String I =cursor.getString(1);
            db.removeItem(I);
                cursor = db.fetchAllItems();
                listAdapter.clear();
                while (!cursor.isAfterLast())
                {
                    String name = cursor.getString(1);
                    String price = cursor.getString(2);
                    listAdapter.add(name+"    "+price);
                    cursor.moveToNext();
                }
                EditText totalPrice = (EditText) findViewById(R.id.totalprice);
                int sum = db.gettingPriceSum();
                if(listAdapter.getCount() != 0) {
                    totalPrice.setText(String.valueOf(sum));
                }
                else
                {
                    totalPrice.setText(String.valueOf(0));
                }
                return true;
            case R.id.cancel:
                return true;
        }
        return false;
    }
}