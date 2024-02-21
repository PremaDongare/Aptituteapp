package com.example.myapplication1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class Percentage extends AppCompatActivity {
    RecyclerView recyclerView;
    List<Model> modelList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_percentage);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Percentage");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

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
        modelList.add(new Model("Question 1", "A batsman scored 110 runs which included 3 boundaries and 8 sixes. What percent of his total score did he make by running between the wickets?\n" + "1)45%\n" + "2)45\t5\t%\n" + "3)11\n" + "4)54\t6\t%\n" + "11\n" + "55%\nAnswer: 2)"));
        modelList.add(new Model("Question 2", "Two students appeared at an examination. One of them secured 9 marks more than the other and his marks was 56% of the sum of their marks. The marks obtained by them are:\n" + "1)39, 30\n" + "2)41, 32\n" +"3)42, 33\n" + "4)43, 34\nAnswer: 3)"));
        modelList.add(new Model("Question 3", "A fruit seller had some apples. He sells 40% apples and still has 420 apples. Originally, he had:\n" + "1)588 apples\n" + "2)600 apples\n" + "3)672 apples\n" + "4)700 apples\nAnswer: 4)"));
        modelList.add(new Model("Question 4", "What percentage of numbers from 1 to 70 have 1 or 9 in the unit's digit?\n" + "1)1\n" + "2)14\n" + "3)20\n" + "4)21\nAnswer: 3)"));
        modelList.add(new Model("Question 5", "If A = x% of y and B = y% of x, then which of the following is true?\n" + "1)A is smaller than B.\n" + "2)A is greater than B\n" + "3)Relationship between A and B cannot be determined.\n" + "4)None of these\nAnswer: 4)"));
        modelList.add(new Model("Question 6", "If 20% of a = b, then b% of 20 is the same as:\n" + "1)4% of a\n" + "2)5% of a\n" + "3)20% of a\n" + "4)None of these\nAnswer: 1)"));
        modelList.add(new Model("Question 7", "In a certain school, 20% of students are below 8 years of age. The number of students above 8 years of age is  of the number of students of 8 years of age which is 48. What is the total number of students in the school?\n" +  "1)72\n" + "2)80\n" + "3)150\n" + "4)100\nAnswer: 4)"));
        modelList.add(new Model("Question 8",  "Two numbers A and B are such that the sum of 5% of A and 4% of B is two-third of the sum of 6% of A and 8% of B. Find the ratio of A : B.\n" + "1)2 : 3\n" + "2)1 : 1\n" + "3)3 : 4\n" + "4)4 : 3\nAnswer: 4)"));
        modelList.add(new Model("Question 9", "A student multiplied a number by\t3\tinstead of\t5\t.\n" + "5\t3\n" +"What is the percentage error in the calculation?\n" + "\n" + "1)34%\n" + "2)44%\n" + "3)54%\n" + "4)64%\nAnswer: 4)"));
        modelList.add(new Model("Question 10", "In an election between two candidates, one got 55% of the total valid votes, 20% of the votes were invalid. If the total number of votes was 7500, the number of valid votes that the other candidate got, was:\n" + "1)2700\n" + "2)2900\n" + "3)3000\n" + "4)3100\nAnswer: 1)"));
        modelList.add(new Model("Question 11", "Three candidates contested an election and received 1136, 7636 and 11628 votes respectively. What percentage of the total votes did the winning candidate get?\n" + "1)57%\n" + "2)60%\n" + "3)65%\n" + "4)90%\nAnswer: 1)"));
        modelList.add(new Model("Question 12", "Two tailors X and Y are paid a total of Rs. 550 per week by their employer. If X is paid 120 percent of the sum paid to Y, how much is Y paid per week?\n" + "1)Rs. 200\n" + "2)Rs. 250\n" + "3)Rs. 300\n" + "4)None of these\nAnswer: 2)"));
        modelList.add(new Model("Question 13", "Gauri went to the stationers and bought things worth Rs. 25, out of which 30 paise went on sales tax on taxable purchases. If the tax rate was 6%, then what was the cost of the tax free items?\n" + "1)Rs. 15\n" + "2)Rs. 15.70\n" + "3)Rs. 19.70\n" + "4)Rs. 20\nAnswer: 3)"));
        modelList.add(new Model("Question 14", "Rajeev buys good worth Rs. 6650. He gets a rebate of 6% on it. After getting the rebate, he pays sales tax @ 10%. Find the amount he will have to pay for the goods.\n" + "1)Rs. 6876.10\n" + "2)Rs. 6999.20\n" + "3)Rs. 6654\n" + "4)Rs. 7000\nAnswer: 1)"));
        modelList.add(new Model("Question 15", "The population of a town increased from 1,75,000 to 2,62,500 in a decade. The average percent increase of population per year is:\n" + "1)4.37%\n" + "2)5%\n" + "3)6%\n" + "4)8.75%\nAnswer: 2)"));
        modelList.add(new Model("Question 16", "20% of a number is 12 find 35% of the same number.\n" + "a) 21\n" + "b) 18\n" + "c) 19\n" + "d) 17\nAnswer: 1)"));
        modelList.add(new Model("Question 17", "30% of a number is 21. What percent of the number is 49?\n" + "a) 50%\n" + "b) 65%\n" + "c) 70%\n" + "d) 72%\nAnswer: 3)"));
        modelList.add(new Model("Question 18", "Find 112% of a number if 20% of the number is 120.\n" + "a) 652\n" + "b) 672\n" + "c) 692\n" + "d) 662\nAnswer: 2)"));
        modelList.add(new Model("Question 19", "A is 25% of a number b, b is 50% of a number c and c is 120% of 25. Find the value of a.\n" + "a) 2.5\n" + "b) 2.75\n" + "c) 3.5\n" + "d) 3.75\nAnswer: 4)"));
        modelList.add(new Model("Question 20", "40% of a number a is 50% of a number b, find the value of a : b.\n" + "a) 2 : 3\n" + "b) 1 : 4\n" + "c) 1 : 5\n" + "d) 3 : 5\nAnswer: 3)"));
        modelList.add(new Model("Question 21", "If the weight of a person increases at a pace of 20% per month, find his weight after 2 months in terms of his weight now.\n" + "a) 1.25 times\n" + "b) 1.4 times\n" + "c) 1.44 times\n" + "d) 1.5 times\nAnswer: 3)"));
        modelList.add(new Model("Question 22", "105% of a number is x. Find 42% of the number in terms of x.\n" + "a) 2x / 10\n" + "b) 2x / 3\n" + "c) x / 11\n" + "d) 2x / 5\nAnswer: 4)"));
        modelList.add(new Model("Question 23", "If 33.33% of a number is 20 more than 16.66% of the number, find 120% of the number.\n" + "a) 121\n" + "b) 139\n" + "c) 144\n" + "d) 169\nAnswer: 3)"));
        modelList.add(new Model("Question 24", "10 times of a number a is 20% more than another number b. Find the value of a : b.\n" + "a) 3 : 25\n" + "b) 4 : 25\n" + "c) 6 : 25\n" +"d) 7 : 25\nAnswer: 1)"));
        modelList.add(new Model("Question 25", "Find 20% of 33.33% of 60% of 900.\n" + "a) 36\n" + "b) 37\n" + "c) 38\n" + "d) 39\nAnswer: 1)"));

    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}