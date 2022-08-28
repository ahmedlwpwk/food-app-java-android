package com.example.project;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.nio.charset.StandardCharsets;
import java.security.PublicKey;

public class otlbDBHelper extends SQLiteOpenHelper {
    private static final String databaseName = "OtlbDatebase";

    //the flag to check if he logged in
    private static boolean loginFlag = false;

    //every string have the sql to create each table

    private final String loginTableCreation =
            "create table login(PersonalID integer primary key autoincrement, "
            + "First_name text not null, Last_name text not null, Email text not null unique, "
            + /*"Location text not null,*/ "Password text not null,PhoneNumber text not null unique);";

    //------------------------------------------------------
    private SQLiteDatabase otlbDatabase;
    public otlbDBHelper(Context context){super(context, databaseName,null,2); }

    //on create

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("create table login(personalID integer primary key autoincrement,Frist_name text not null,Last_name text not null,Email text not null unique ,Password text not null,PhoneNumber text not null );");
        db.execSQL("create table cart(ID integer primary key autoincrement,Item_Name text not null,Price text not null);");
    }

    //on upgrade

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS login");
        db.execSQL("DROP TABLE IF EXISTS cart");
        onCreate(db);
    }

    ////////functions for the login and register

    //function to get the information in the register
    public boolean getRegisterInformation(String Fname,String Lname,String Email,String Password/*,String Location*/,String PhoneNumber)
    {
        ContentValues row=new ContentValues();
        row.put("First_name",Fname);
        row.put("Last_name",Lname);
        row.put("Email",Email);
        row.put("Password",Password);
        /*row.put("Location",Location);*/
        row.put("PhoneNumber",PhoneNumber);
        otlbDatabase = getWritableDatabase();
        long result =  otlbDatabase.insert("login",null, row);
        otlbDatabase.close();
        if (result != -1) {
            return true;
        }
        else {
            return false;
        }
    }

    //function to check the information at the login
    //if the email and password correct will return true ,otherwise false
    public boolean loginCheck(String email,String password)
    {
        otlbDatabase = getReadableDatabase();
        Cursor cursor = otlbDatabase.rawQuery("select * from login where Email = ? and Password = ? ", new String[]{email, password});
        cursor.moveToFirst();
        otlbDatabase.close();
        if(cursor.getCount() > 0)
        {
                loginFlag = true;
                return true;
        }
        else
        {
            return false;
        }
    }

    //function to check if logged in or in guest mode
    //if logged in will return true , if guest mode will return false
    public boolean isLogin()
    {
        if(loginFlag == true)
            return true;
        else
            return false;
    }

    //function to check if the email at registration is new
    //if the email is already registered (aka used before) will return false if the email is new will return true
    public boolean isEmailNew(String email)
    {
        otlbDatabase = getReadableDatabase();
        String[] arg = {email};
        Cursor cursor = otlbDatabase.rawQuery("Select * from login where Email like ?",arg);
        cursor.moveToFirst();
        otlbDatabase.close();
        if(cursor.getCount() == 0)
        {
            return true;
        }
        return false;
    }
    //function to check if the phone at registration is new
    //if the phone is already registered (aka used before) will return false if the phone is new will return true
    public Boolean isPhoneNew (String phone) {
        otlbDatabase = getReadableDatabase();
        String[] arg = {phone};
        Cursor cursor = otlbDatabase.rawQuery("select * from login where PhoneNumber like ?", arg);
        cursor.moveToFirst();
        otlbDatabase.close();
        if(cursor.getCount() == 0)
        {
            return true;
        }
        return false;
    }

    //function to change the password
    public void changePassword(String email,String password)
    {

        SQLiteDatabase myDb = this.getReadableDatabase();
        ContentValues contentValues = new ContentValues() ;
        contentValues.put("Password" , password);
        myDb.update("login" , contentValues , "Email = ?" , new String[]{email}) ;

    }

    // check email and phone for Forgot Password

    public Boolean checkemailphone (String email , String phone) {
        otlbDatabase = getReadableDatabase();
        Cursor cursor = otlbDatabase.rawQuery("select * from login where Email = ? and PhoneNumber = ? ", new String[]{email, phone});
        if(cursor.getCount() > 0)
        {
            return true;
        }
        return false;

    }
    //////function for the cart activity
    public boolean insertNewItem (String name,String price)
    {
        ContentValues row = new ContentValues();
        row.put("Item_Name",name);
        row.put("Price",price);
        otlbDatabase = getWritableDatabase();
        long result = otlbDatabase.insert("cart",null,row);
        otlbDatabase.close();
        if(result != -1)
        {
            return true;
        }
        else
            return false;
    }

    public Cursor fetchAllItems()
    {
        otlbDatabase = getReadableDatabase();
        Cursor cursor = otlbDatabase.rawQuery("select ID,Item_Name, Price from cart",null);
        cursor.moveToFirst();
        return cursor;
    }

    public int gettingPriceSum()
    {
        int sum = 0;
        otlbDatabase = getReadableDatabase();
        Cursor cursor = otlbDatabase.rawQuery("select Price from cart",null);
        cursor.moveToFirst();
        while(!cursor.isAfterLast()) {
            String S = cursor.getString(0);
            sum = sum + Integer.parseInt(S);
            cursor.moveToNext();

        }
        otlbDatabase.close();
        return sum;
    }

    public void clearCart()
    {
        otlbDatabase = getWritableDatabase();
        otlbDatabase.execSQL("DROP TABLE IF EXISTS cart");
        otlbDatabase.execSQL("create table cart(ID integer primary key autoincrement,Item_Name text not null,Price text not null);");
        otlbDatabase.close();
    }

    public void removeItem(String name)
    {


        otlbDatabase = getWritableDatabase();
        otlbDatabase.delete("cart","Item_Name= '"+name+"'",null);
        otlbDatabase.close();
    }
}
