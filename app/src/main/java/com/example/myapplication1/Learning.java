package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Learning extends AppCompatActivity {

    CardView card1,card4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learning);

        card1 = findViewById(R.id.card1);
        card4 = findViewById(R.id.card4);
        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent1 =new Intent(Learning.this, Languages.class);
                startActivity(intent1);
            }
        });

        card4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent4 =new Intent(Learning.this, Verbal_Reasoning.class);
                startActivity(intent4);
            }
        });
    }
}