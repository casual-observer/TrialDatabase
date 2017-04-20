package com.example.anisha.trialdatabase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    DatabaseHelper myDB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView console = (TextView) findViewById(R.id.textView);
        myDB = new DatabaseHelper(this);
        console.append("\n\nLoading...");

        console.append("\n\n1. TABLE NAMES ARE\n\n");
        for(String l : myDB.getTables()){
            console.append(l+"\n");
        }
        SQLiteDatabase db = myDB.getWritableDatabase();
        db.execSQL("CREATE TABLE User_Info2 (USERID INTEGER PRIMARY KEY, USERNAME TEXT, PASSWORD TEXT,NAME TEXT, PHONENO TEXT)");
        db.execSQL("CREATE TABLE User_Info3 (USERID INTEGER PRIMARY KEY, USERNAME TEXT, PASSWORD TEXT,NAME TEXT, PHONENO TEXT)");
        console.append("\n\n2. TABLE NAMES ARE\n\n");
        for(String l : myDB.getTables()){
            console.append(l+"\n");
        }
    }
}
