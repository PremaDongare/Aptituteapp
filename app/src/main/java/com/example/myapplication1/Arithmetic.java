package com.example.myapplication1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class Arithmetic extends AppCompatActivity {
    RecyclerView recyclerView;
    List<Model> modelList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arithmetic);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Arithmetic");
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

        modelList.add(new Model("Question 1", "It was Sunday on Jan 1, 2006. What was the day of the week Jan 1, 2010?\n" + "1.Sunday\n" + "2.Saturday\n" + "3.Friday\n" + "4.Wednesday\n\nAnswer: Option 3)\nExplanation:\n" + "On 31st December, 2005 it was Saturday.\n" + "Number of odd days from the year 2006 to the year 2009 = (1 + 1 + 2 + 1) = 5 days.\n" + " On 31st December 2009, it was Thursday.\n" + "Thus, on 1st Jan, 2010 it is Friday."));
        modelList.add(new Model("Question 2", "What was the day of the week on 28th May, 2006?\n" + "1.Thursday\n" + "2.Friday\n" + "3.Saturday\n" + "4.Sunday\n\nAnswer: Option 4)\nExplanation:\n28 May, 2006 = (2005 years + Period from 1.1.2006 to 28.5.2006)\n" + "Odd days in 1600 years = 0\n" + "Odd days in 400 years = 0\n" + "5 years = (4 ordinary years + 1 leap year) = (4 x 1 + 1 x 2)  6 odd days\n" + "Jan. Feb. March April May (31 + 28 + 31 + 30 + 28 ) = 148 days\n" + " 148 days = (21 weeks + 1 day)  1 odd day.\n" + "Total number of odd days = (0 + 0 + 6 + 1) = 7  0 odd day.\n" + "Given day is Sunday."));
        modelList.add(new Model("Question 3", "What was the day of the week on 17th June, 1998?\n" + "1.Monday\n" + "2.Tuesday\n" + "3.Wednesday\n" + "4.Thursday\n\nAnswer: Option 3)\nExplanation:\n17th June, 1998 = (1997 years + Period from 1.1.1998 to 17.6.1998)\n" + "Odd days in 1600 years = 0\n" + "Odd days in 300 years = (5 x 3)  1\n" + "97 years has 24 leap years + 73 ordinary years.\n" + "Number of odd days in 97 years ( 24 x 2 + 73) = 121 = 2 odd days.\n" + "Jan. Feb. March April May June (31 + 28 + 31 + 30 + 31 + 17) = 168 days\n" + " 168 days = 24 weeks = 0 odd day.\n" + "Total number of odd days = (0 + 1 + 2 + 0) = 3.\n" + "Given day is Wednesday."));
        modelList.add(new Model("Question 4", "What will be the day of the week 15th August, 2010?\n" + "1.Sunday\n" + "2.Monday\n" + "3.Tuesday\n" + "4.Friday\n\nAnswer: Option 1)\nExplanation:\n15th August, 2010 = (2009 years + Period 1.1.2010 to 15.8.2010)\n" + "Odd days in 1600 years = 0\n" + "Odd days in 400 years = 0\n" + "9 years = (2 leap years + 7 ordinary years) = (2 x 2 + 7 x 1) = 11 odd days  4 odd days.\n" + "Jan. Feb. March April May June July Aug. (31 + 28 + 31 + 30 + 31 + 30 + 31 + 15) = 227 days\n" + " 227 days = (32 weeks + 3 days)  3 odd days.\n" + "Total number of odd days = (0 + 0 + 4 + 3) = 7  0 odd days.\n" + "Given day is Sunday."));
        modelList.add(new Model("Question 5", "Today is Monday. After 61 days, it will be:\n" + "1.Wednesday\n" + "2.Saturday\n" + "3.Tuesday\n" + "4.Thursday\n\nAnswer: Option 2)\nExplanation:\nEach day of the week is repeated after 7 days.\n" + "So, after 63 days, it will be Monday.\n" + " After 61 days, it will be Saturday."));
        modelList.add(new Model("Question 6", "A train can travel 50% faster than a car. Both start from point A at the same time and reach point B 75 kms away from A at the same time. On the way, however, the train lost about 12.5 minutes while stopping at the stations. The speed of the car is:\n" + "1.100 kmph\n" + "2.110 kmph\n" + "3.120 kmph\n" + "4.130 kmph\n\nAnswer: Option 3)\nExplanation:\nLet speed of the car be x kmph.\n" + "\n" + "Then, speed of the train =\t150\tx\t=\t\t3\tx\tkmph.\n" + "100\t2\n" + "\t75\t-\t75\t=\t125\n" + "x\t(3/2)x\t10 x 60\n" + "\t75\t-\t50\t=\t5\n" + "x\tx\t24\n" + " x =\t\t25 x24\t\t= 120 kmph.\n" + "5\n"));
        modelList.add(new Model("Question 7", "If a person walks at 14 km/hr instead of 10 km/hr, he would have walked 20 km more. The actual distance travelled by him is:\n" + "1. 50 km\n" + "2. 56 km\n" + "3. 70 km\n" + "4. 80 km\n\nAnswer: Option 1)\nExplanation:\nLet the actual distance travelled be x km.\n" + "\n" + "Then,\tx\t=\tx + 20\n" + "10\t14\n" + " 14x = 10x + 200\n" + "\n" + " 4x = 200\n" + "\n" + " x = 50 km."));
        modelList.add(new Model("Question 8", "An aeroplane covers a certain distance at a speed of 240 kmph in 5 hours. To cover the same distance in 1 hours, it must travel at a speed of:\n" + "1. 300 kmph\n" + "2. 360 kmph\n" + "3. 600 kmph\n" + "4. 720 kmph\n\nAnswer: Option 4)\nExplanation:\nDistance = (240 x 5) = 1200 km.\n" + "\n" + "Speed = Distance/Time\n" + "\n" + "Speed = 1200/(5/3) km/hr.     [We can write 1 hours as 5/3 hours]\n" + "\n" + " Required speed =\t\t1200 x\t3\tkm/hr\t= 720 km/hr.\n" + "5\n"));
        modelList.add(new Model("Question 9", "A man on tour travels first 160 km at 64 km/hr and the next 160 km at 80 km/hr. The average speed for the first 320 km of the tour is:\n" + "1. 35.55 km/hr\n" + "2. 36 km/hr\n" + "3. 71.11 km/hr\n" + "4. 71 km/hr\n\nAnswer: Option 3)\nExplanation:\nTotal time taken =\t\t160\t+\t160\thrs.\t=\t9\thrs.\n" + "64\t80\t2\n" + " Average speed =\t\t320 x\t2\tkm/hr\t= 71.11 km/hr.\n" + "9\n"));
        modelList.add(new Model("Question 10", "In a flight of 600 km, an aircraft was slowed down due to bad weather. Its average speed for the trip was reduced by 200 km/hr and the time of flight increased by 30 minutes. The duration of the flight is:\n" + "1. 1 hour\n" + "2. 2 hours\n" + "3. 3 hours\n" + "4. 4 hours\n\nAnswer: Option 1)\nExplanation:\nLet the duration of the flight be x hours.\n" + "\n" + "Then,\t600\t-\t600\t= 200\n" + "x\tx + (1/2)\n" + "\t600\t-\t1200\t= 200\n" + "x\t2x + 1\n" + " x(2x + 1) = 3\n" + "\n" + " 2x2 + x - 3 = 0\n" + "\n" + " (2x + 3)(x - 1) = 0\n" + "\n" + " x = 1 hr.      [neglecting the -ve value of x]"));
        modelList.add(new Model("Question 11", "Find the greatest number that will divide 43, 91 and 183 so as to leave the same remainder in each case.\n" + "1. 4\n" + "2. 7\n" + "3. 9\n" + "4. 13\n\nAnswer: Option 1)\nExplanation:\nRequired number = H.C.F. of (91 - 43), (183 - 91) and (183 - 43)\n" + "     = H.C.F. of 48, 92 and 140 = 4."));
        modelList.add(new Model("Question 12", "The H.C.F. of two numbers is 23 and the other two factors of their L.C.M. are 13 and 14. The larger of the two numbers is:\n" + "1. 276\n" + "2. 299\n" + "3. 322\n" + "4. 345\n\nAnswer: Option 3)\nExplanation:\nClearly, the numbers are (23 x 13) and (23 x 14).\n" + " Larger number = (23 x 14) = 322."));
        modelList.add(new Model("Question 13", "The greatest number of four digits which is divisible by 15, 25, 40 and 75 is:\n" + "1. 9000\n" + "2. 9400\n" + "3. 9600\n" + "4. 9800\n\nAnswer: Option 3)\nExplanation:\nGreatest number of 4-digits is 9999.\n" + "L.C.M. of 15, 25, 40 and 75 is 600.\n" + "On dividing 9999 by 600, the remainder is 399.\n" + " Required number (9999 - 399) = 9600."));
        modelList.add(new Model("Question 14", "hree number are in the ratio of 3 : 4 : 5 and their L.C.M. is 2400. Their H.C.F. is:\n" + "1. 40\n" + "2. 80\n" + "3. 120\n" + "4. 200\n\nAnswer: Option 1)\nExplanation:\nLet the numbers be 3x, 4x and 5x.\n" + "Then, their L.C.M. = 60x.\n" + "So, 60x = 2400 or x = 40.\n" + " The numbers are (3 x 40), (4 x 40) and (5 x 40).\n" + "Hence, required H.C.F. = 40."));
        modelList.add(new Model("Question 15", "The least multiple of 7, which leaves a remainder of 4, when divided by 6, 9, 15 and 18 is:\n" + "1. 74\n" + "2. 94\n" + "3. 184\n" + "4. 364\n\nAnswer: Option 4)\nExplanation:\nL.C.M. of 6, 9, 15 and 18 is 90.\n" + "Let required number be 90k + 4, which is multiple of 7.\n" + "Least value of k for which (90k + 4) is divisible by 7 is k = 4.\n" + " Required number = (90 x 4) + 4   = 364."));
        modelList.add(new Model("Question 16", "Which one of the following is not a prime number?\n" + "1. 31\n" + "2. 61\n" + "3. 71\n" + "4. 91\n\nAnswer: Option 4)\nExplanation:\n91 is divisible by 7. So, it is not a prime number."));
        modelList.add(new Model("Question 17", "(112 x 54) = ?\n" + "1. 67000\n" + "2. 70000\n" + "3. 76500\n" + "4. 77200\n\nAnswer: Option 2)\nExplanation:\n\n" + "(112 x 54) = 112 x\t\t10\t\t4\t=\t112 x 104\t=\t1120000\t= 70000\n" + "2\t24\t16\n"));
        modelList.add(new Model("Question 18", "It is being given that (232 + 1) is completely divisible by a whole number. Which of the following numbers is completely divisible by this number?\n" + "1. (216 + 1)\n" + "2. (216 - 1)\n" + "3. (7 x 223)\n" + "4. (296 + 1)\n\nAnswer: Option 4)\nExplanation:\nLet 232 = x. Then, (232 + 1) = (x + 1).\n" + "\n" + "Let (x + 1) be completely divisible by the natural number N. Then,\n" + "\n" + "(296 + 1) = [(232)3 + 1] = (x3 + 1) = (x + 1)(x2 - x + 1), which is completely divisible by N, since (x + 1) is divisible by N."));
        modelList.add(new Model("Question 19", "Find the greatest number that will divide 43, 91 and 183 so as to leave the same remainder in each case.\n" + "1. 4\n" + "2. 7\n" + "3. 9\n" + "4. 13\n\nAnswer: Option 1)\nExplanation:\nRequired number = H.C.F. of (91 - 43), (183 - 91) and (183 - 43)\n" + "\n" + "     = H.C.F. of 48, 92 and 140 = 4."));
        modelList.add(new Model("Question 21", "The H.C.F. of two numbers is 23 and the other two factors of their L.C.M. are 13 and 14. The larger of the two numbers is:\n" + "1. 276\n" + "2. 299\n" + "3. 322\n" + "4. 345\n\nAnswer: Option 3)\nExplanation:\nClearly, the numbers are (23 x 13) and (23 x 14).\n" + "\n" + " Larger number = (23 x 14) = 322."));
        modelList.add(new Model("Question 22", "Six bells commence tolling together and toll at intervals of 2, 4, 6, 8 10 and 12 seconds respectively. In 30 minutes, how many times do they toll together ?\n" + "1. 4\n" + "2. 10\n" + "3. 15\n" + "4. 16\n\nAnswer: Option 4)\nExplanation:\nL.C.M. of 2, 4, 6, 8, 10, 12 is 120.\n" + "\n" + "So, the bells will toll together after every 120 seconds(2 minutes).\n" + "\n" + "In 30 minutes, they will toll together\t30\t+ 1 = 16 times.\n" + "2\n"));
        modelList.add(new Model("Question 23", "The greatest number of four digits which is divisible by 15, 25, 40 and 75 is:\n" + "1. 9000\n" + "2. 9400\n" + "3. 9600\n" + "4. 9800\n\nAnswer: Option 3)\nExplanation:\nGreatest number of 4-digits is 9999.\n" + "\n" + "L.C.M. of 15, 25, 40 and 75 is 600.\n" + "\n" + "On dividing 9999 by 600, the remainder is 399.\n" + "\n" + " Required number (9999 - 399) = 9600."));
        modelList.add(new Model("Question 24", "The sum of ages of 5 children born at the intervals of 3 years each is 50 years. What is the age of the youngest child?\n" + "1. 4 years\n" + "2. 8 years\n" + "3. 10 years\n" + "4. None of these\n\nAnswer: Option 1)\nExplanation:\nLet the ages of children be x, (x + 3), (x + 6), (x + 9) and (x + 12) years.\n" + "\n" + "Then, x + (x + 3) + (x + 6) + (x + 9) + (x + 12) = 50\n" + "\n" + " 5x = 20\n" + "\n" + " x = 4.\n" + "\n" + " Age of the youngest child = x = 4 years."));
        modelList.add(new Model("Question 25", "A father said to his son, I was as old as you are at the present at the time of your birth\". If the father's age is 38 years now, the son's age five years back was:\n" + "14 years\n" + "19 years\n" + "33 years\n" + "38 years\n\nAnswer: Option 1)\nExplanation:\nLet the son's present age be x years. Then, (38 - x) = x\n" + "\n" + " 2x = 38.\n" + "\n" + " x = 19.\n" + "\n" + " Son's age 5 years back (19 - 5) = 14 years."));

    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}