package com.example.myapplication1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
   CardView startBtn,learning;

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startBtn = findViewById(R.id.next_btn);
        learning = findViewById(R.id.learning);


        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent categoryIntent = new Intent(MainActivity.this,CategoriesActivity.class);
                startActivity(categoryIntent);
            }
        });
        learning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent categoryIntent = new Intent(MainActivity.this,Learning.class);
                startActivity(categoryIntent);
            }
        });

        //Toolbar
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }
    //Toolbar methods
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_item, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.Item1){
            Intent intent = new Intent(MainActivity.this, Logout.class);
            startActivity(intent);
            return true;
        }
        else
        if (id == R.id.Item2){
            try {
                startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("market://details?id= " + getPackageName())));
            }
            catch (Exception ex){
                startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://play.google.com/store/app/details?id=" + getPackageName())));
            }
            return true;
        }
        else
        if (id == R.id.Item3){
            Intent intent2 = new Intent(Intent.ACTION_SEND);
            intent2.setType("text/plain");
            String shareBody = "This is an Aptitude Learning and Quiz App " + "https://play.google.com/store/app/details?id=com.example.myapplication1&h1=en";
            String shareSub = "Let's Crack an Interview";
            intent2.putExtra(Intent.EXTRA_SUBJECT, shareSub);
            intent2.putExtra(Intent.EXTRA_TEXT, shareBody);
            startActivity(Intent.createChooser(intent2,"Share using"));

        }
        return true;
    }


}