package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class HR_Question extends AppCompatActivity {

    RecyclerView recyclerView;
    List<Model> modelList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hr_question);

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

        modelList.add(new Model("Question 1", "A group of positions that have similar duties, tasks & responsibilities is called ______\n" + "\n" + "A. Job\n" + "\n" + "B. Business\n" + "\n" + "C. Career\n" + "\n" + "D. Entrepreneurship\n\nAnswer: Option A"));
        modelList.add(new Model("Question 2", "______ can be derived from Job Analysis.\n" + "\n" + "A. Job Specification\n" + "\n" + "B. Job Description\n" + "\n" + "C. Job requirement\n" + "\n" + "D. Both A & B\n\nAnswer: Option D"));
        modelList.add(new Model("Question 3", "A written summary of content & context of job is called _______\n" + "\n" + "A. resume\n" + "\n" + "B. job specification\n" + "\n" + "C. Job Description\n" + "\n" + "D. Job posting\n\nAnswer: Option C"));
        modelList.add(new Model("Question 4", "A written summary of KSA required to per form a job is _________\n" + "\n" + "A. resume\n" + "\n" + "B. job specification\n" + "\n" + "C. Job Description\n" + "\n" + "D. Job posting\n\nAnswer: Option B"));
        modelList.add(new Model("Question 5", "KSA represents ______ & ________\n" + "\n" + "A. Knowledge\n" + "\n" + "B. Skill\n" + "\n" + "C. Attitude\n" + "\n" + "D. All of the above\n\nAnswer: Option D"));
        modelList.add(new Model("Question 6", "Identifying the source of potential candidates and _______ them to apply for the job is called Recruitment.\n" + "\n" + "A. rejecting\n" + "\n" + "B. training\n" + "\n" + "C. attracting\n" + "\n" + "D. all of the above\n\nAnswer: Option D"));
        modelList.add(new Model("Question 7", "Promotion is a ________ source Recruitment\n" + "\n" + "A. external\n" + "\n" + "B. internal\n" + "\n" + "C. macro\n" + "\n" + "D. none of the above\n\nAnswer: Option B"));
        modelList.add(new Model("Question 8", "Campus selection is a __________ source of recruitment\n" + "\n" + "A. external\n" + "\n" + "B. internal\n" + "\n" + "C. macro\n" + "\n" + "D. none of the above\n\nAnswer: Option A"));
        modelList.add(new Model("Question 9", "To be ethical and social towards needs of society is _______ objective of HRM\n" + "\n" + "A. corporate\n" + "\n" + "B. profitable\n" + "\n" + "C. non essential\n" + "\n" + "D. societal\n\nAnswer: Option D"));
        modelList.add(new Model("Question 10", "Strategic HRM concerned with the relation of HRM and ________\n" + "\n" + "A. business policy\n" + "\n" + "B. business strategy\n" + "\n" + "C. business tactics\n" + "\n" + "D. short term strategies\n\nAnswer: Option B"));
        modelList.add(new Model("Question 11", "SHRM tries to establish employees as the ______ of organization\n" + "\n" + "A. managers and officers\n" + "\n" + "B. important workers\n" + "\n" + "C. capital\n" + "\n" + "D. strategic partner\n\nAnswer: Option D"));
        modelList.add(new Model("Question 12", "When either the party of bargaining is not ready to give up from a particular Point, that point is called as ______ Point\n" + "\n" + "A. grief\n" + "\n" + "B. sticky\n" + "\n" + "C. barter\n" + "\n" + "D. crucial\n\nAnswer option B"));
        modelList.add(new Model("Question 13", "The list of Demands prepared by the employees at the time of bargaining is called as _______\n" + "\n" + "A. charter\n" + "\n" + "B. barter\n" + "\n" + "C. want\n" + "\n" + "D. promotion\n\nAnswer: Option A"));
        modelList.add(new Model("Question 14", " _______ will be done when an employee is suspected to be guilty not yet proved\n" + "\n" + "A. firing\n" + "\n" + "B. attrition\n" + "\n" + "C. suspension\n" + "\n" + "D. posting\n\nAnswer: Option C"));
        modelList.add(new Model("Question 15", "Group of employees joined to solve the production related issues is called ______\n" + "\n" + "A. internal group\n" + "\n" + "B. production group\n" + "\n" + "C. virtual community\n" + "\n" + "D. quality circle\n\nAnswer: Option D"));
        modelList.add(new Model("Question 16", "_______ is the Last stage in Career planning\n" + "\n" + "A. resignation\n" + "\n" + "B. resume building\n" + "\n" + "C. withdrawal\n" + "\n" + "D. negotiation\n\nAnswer: Option  C"));
        modelList.add(new Model("Question 17", "When an employee is trained for a key position in the organization is called ________\n" + "\n" + "A. talent management\n" + "\n" + "B. replacement planning\n" + "\n" + "C. leadership development\n" + "\n" + "D. Succession Planning\n\nAnswer: Option D"));
        modelList.add(new Model("Question 18", "_______ is the assessment of individual’s performance in a systematic way.\n" + "\n" + "A. systematic appraisal\n" + "\n" + "B. The 360-Degree Appraisal\n" + "\n" + "C. Ranking Appraisal\n" + "\n" + "D. Performance Appraisal\n\nAnswer: Option D"));
        modelList.add(new Model("Question 19", "The compensation paid during the time of layoff is called _______\n" + "\n" + "A. Dearness Allowance\n" + "\n" + "B. Servant Allowance\n" + "\n" + "C. Retaining Allowance\n" + "\n" + "D. Cash Allowance\n\nAnswer: Option B"));
        modelList.add(new Model("Question 20", "The First stage in career planning is ________\n" + "\n" + "A. Preparation Stage\n" + "\n" + "B. Investigation Stage\n" + "\n" + "C. Establishment Stage\n" + "\n" + "D. Retention Stage\n\nAnswer: Option C"));
        modelList.add(new Model("Question 21", "In a make or buy decision, the most important factor(s) to consider is ________.\n" + "\n" + "A. cost of production\n" + "\n" + "B. availability of production capacity\n" + "\n" + "C. marketing of the product\n" + "\n" + "D. Both A & B\n\nAnswer: Option D"));
        modelList.add(new Model("Question 23", "A budget is a ________ financial plan.\n" + "\n" + "A. Backward\n" + "\n" + "B. Upward\n" + "\n" + "C. Forward\n" + "\n" + "D. All of the above\n\nAnswer: Option C"));
        modelList.add(new Model("Question 24", "The size of ________ is an important indicator of the strength of business.\n" + "\n" + "A. cost of production\n" + "\n" + "B. marketing activity\n" + "\n" + "C. margin of safety\n" + "\n" + "D. employees\n\nAnswer: Option C"));
        modelList.add(new Model("Question 25", "Pricing is one of the most important decision areas of ________.\n" + "\n" + "A. Marketing\n" + "\n" + "B. Accounting\n" + "\n" + "C. Human Resource Management\n" + "\n" + "D. Production\n\nAnswer: Option A"));
    }
}