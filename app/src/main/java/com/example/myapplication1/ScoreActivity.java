package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

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
        int a = getIntent().getIntExtra("score", 0);
        scored.setText(String.valueOf(a));
        total.setText("/"+String.valueOf(getIntent().getIntExtra("total", 0)));
        done_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (a > 7) {
                    Toast.makeText(ScoreActivity.this, "Next Set is Unlocked", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(ScoreActivity.this, "Score is Not Satisfied", Toast.LENGTH_SHORT).show();
                }
                finish();
            }
        });
    }
}