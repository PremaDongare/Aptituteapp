package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Technical_Que extends AppCompatActivity {
    RecyclerView recyclerView;
    List<Model> modelList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_technical_que);

        recyclerView = findViewById(R.id.recyclerView);

        initData();
        setRecyclerView();
    }

    private void setRecyclerView() {
        ModelAdapter modelAdapter = new ModelAdapter(modelList);
        recyclerView.setAdapter(modelAdapter);
        recyclerView.setHasFixedSize(true);
    }

    private void initData() {
        modelList = new ArrayList<>();
        modelList.add(new Model("Question 1", ""));
        modelList.add(new Model("Question 2", ""));
        modelList.add(new Model("Question 3", ""));
        modelList.add(new Model("Question 4", ""));
        modelList.add(new Model("Question 5", ""));
        modelList.add(new Model("Question 6", ""));
        modelList.add(new Model("Question 7", ""));
        modelList.add(new Model("Question 8", ""));
        modelList.add(new Model("Question 9", ""));
        modelList.add(new Model("Question 10", ""));
        modelList.add(new Model("Question 11", ""));
        modelList.add(new Model("Question 12", ""));
        modelList.add(new Model("Question 13", ""));
        modelList.add(new Model("Question 14", ""));
        modelList.add(new Model("Question 15", ""));
        modelList.add(new Model("Question 16", ""));
        modelList.add(new Model("Question 17", ""));
        modelList.add(new Model("Question 18", ""));
        modelList.add(new Model("Question 19", ""));
        modelList.add(new Model("Question 20", ""));
        modelList.add(new Model("Question 21", ""));
        modelList.add(new Model("Question 22", ""));
        modelList.add(new Model("Question 23", ""));
        modelList.add(new Model("Question 24", ""));
        modelList.add(new Model("Question 25", ""));
    }
}