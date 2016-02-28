//CIS 3334 Sec 700 Mobile Device Programming - Spring 2016
//Assignment 6: Simple Texter
//Date: 02/27/2016
//Submitted by: Dana McGree

package com.ebookfrenzy.simpletexter;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public void onClickB1(View view) {
        // create an intent for the second activity
        Intent i = new Intent(getApplicationContext(), SecondActivity.class);
        i.putExtra("textName","1");         // pass the name number 1 to the second activity
        startActivity(i);                   // start up the second activity
    }

    public void onClickB2(View view) {
        // create an intent for the second activity
        Intent i = new Intent(getApplicationContext(), SecondActivity.class);
        i.putExtra("textName","2");         // pass the name number 2 to the second activity
        startActivity(i);                   // start up the second activity
    }

    public void onClickB3(View view) {
        // create an intent for the second activity
        Intent i = new Intent(getApplicationContext(), SecondActivity.class);
        i.putExtra("textName","3");         // pass the name number 3 to the second activity
        startActivity(i);                   // start up the second activity
    }
}
