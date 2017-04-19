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
        console.append("\n\nTABLE NAMES v2\n");
//        for(String l: myDB.getTables()) {
//            console.append(l + "\n");
//        }
    }
}
