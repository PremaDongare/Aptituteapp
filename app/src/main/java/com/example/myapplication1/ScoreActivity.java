package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ScoreActivity extends AppCompatActivity {
    private TextView scored,total;
    private View done_btn;


    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
        scored = findViewById(R.id.score);
        total = findViewById(R.id.total);
        done_btn = findViewById(R.id.done_btn);
        scored.setText(String.valueOf(getIntent().getIntExtra("score", 0)));
        total.setText("/"+String.valueOf(getIntent().getIntExtra("total", 0)));
        done_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}