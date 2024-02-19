package com.example.myapplication1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class Verbal_Ability extends AppCompatActivity {
    RecyclerView recyclerView;
    List<Model> modelList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verbal_ability);
        recyclerView = findViewById(R.id.recyclerView);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Verbal Ability");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
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
        modelList.add(new Model("Question 1", "\n" + "CUP : LIP :: BIRD : ?\n" + "BUSH\n" + "GRASS\n" + "FOREST\n" + "BEAK\nAnswer 4)\nExplanation:\n" + "Cup is used to drink something with the help of lips. Similarly birds collects grass with the help of beak to make her nest."));
        modelList.add(new Model("Question 2", "Flow : River :: Stagnant : ?\n" + "Rain\n" + "Stream\n" + "Pool\n" + "Canal\nAnswer 3)\nExplanation:\n" +"As Water of a River flows similarly water of Pool is Stagnant."));
        modelList.add(new Model("Question 3", "Peacock : India :: Bear : ?\n" + "Australia\n" + "America\n" + "Russia\n" + "England\nAnswer 3)\nExplanation:\n" + "As Peacock is the national bird of India, similarly Bear is the national animal of Russia."));
        modelList.add(new Model("Question 4", "Conference : Chairman :: Newspaper : ?\n" + "Reporter\n" + "Distributor\n" + "Printer\n" + "Editor\nAnswer 4)\nExplanation:\n" + "As Chairman is the highest authority in a conference similarly Editor is in Newspaper."));
        modelList.add(new Model("Question 5", "Safe : Secure :: Protect : ?\n" + "Lock\n" + "Sure\n" + "Guard\n" + "Conserve\nAnswer 3)\nExplanation:\n" + "As safe ans secure have same meaning in the same way protect and guard have same meaning."));
        modelList.add(new Model("Question 6", "Arrange the words given below in a meaningful sequence.\n" + "\n" + "1. Key\t2. Door\t3. Lock\n" + "4. Room\t5. Switch on\t \n" + "5, 1, 2, 4, 3\n" + "4, 2, 1, 5, 3\n" + "1, 3, 2, 4, 5\n" + "1, 2, 3, 5, 4\nAnswer 3)\nExplanation:\n" + "The correct order is :\n" + "\n" + "Key\tLock\tDoor\tRoom\tSwitch on\n" + "1\t3\t2\t4\t5\n"));
        modelList.add(new Model("Question 7", "Arrange the words given below in a meaningful sequence.\n" + "\n" + "1. Word\t2. Paragraph\t3. Sentence\n" + "4. Letters\t5. Phrase\t \n" + "4, 1, 5, 2, 3\n" + "4, 1, 3, 5, 2\n" + "4, 2, 5, 1, 3\n" + "4, 1, 5, 3, 2\nAnswer 4)\nExplanation:\n" + "The correct order is :\n" + "\n" + "Letters\tWord\tPhrase\tSentence\tParagraph\n" + "4\t1\t5\t3\t2"));
        modelList.add(new Model("Question 8", "Arrange the words given below in a meaningful sequence.\n" + "\n" + "1. Police\t2. Punishment\t3. Crime\n" + "4. Judge\t5. Judgement\t \n" + "3, 1, 2, 4, 5\n" + "1, 2, 4, 3, 5\n" + "5, 4, 3, 2, 1\n" + "3, 1, 4, 5, 2\nAnswer 4)\nThe correct order is :\n" + "\n" + "Crime\tPolice\tJudge\tJudgement\tPunishment\n" + "3\t1\t4\t5\t2"));
        modelList.add(new Model("Question 9", "Arrange the words given below in a meaningful sequence.\n" + "\n" + "1. Family\t2. Community\t3. Member\n" + "4. Locality\t5. Country\t \n" + "3, 1, 2, 4, 5\n" + "3, 1, 2, 5, 4\n" + "3, 1, 4, 2, 5\n" + "3, 1, 4, 5, 2\nAnswer 1)\nThe correct order is :\n" + "\n" + "Member\tFamily\tCommunity\tLocality\tCountry\n" + "3\t1\t2\t4\t5\n"));
        modelList.add(new Model("Question 10", "Arrange the words given below in a meaningful sequence.\n" + "\n" + "1. Poverty\t2. Population\t3. Death\n" + "4. Unemployment\t5. Disease\t \n" +"2, 3, 4, 5, 1\n" + "3, 4, 2, 5, 1\n" + "2, 4, 1, 5, 3\n" + "1, 2, 3, 4, 5\nAnswer 3)\nExplanation:\n" + "The correct order is :\n" + "\n" + "Population\tUnemployment\tPoverty\tDisease\tDeath\n" + "2\t4\t1\t5\t3\n"));
        modelList.add(new Model("Question 11", "Pointing to a photograph of a boy Suresh said, \"He is the son of the only son of my mother.\" How is Suresh related to that boy?\n" + "Brother\n" + "Uncle\n" + "Cousin\n" + "Father\nAnswer 4)\nExplanation:\n" + "The boy in the photograph is the only son of the son of Suresh's mother i.e., the son of Suresh. Hence, Suresh is the father of boy."));
        modelList.add(new Model("Question 12", "If A + B means A is the mother of B; A - B means A is the brother B; A % B means A is the father of B and A x B means A is the sister of B, which of the following shows that P is the maternal uncle of Q?\n" + "Q - N + M x P\n" + "P + S x N - Q\n" + "P - M + N x Q\n" + "Q - S % P\nAnswer 3)\nExplanation:\n" + "P - M → P is the brother of M\n" + "\n" + "M + N → M is the mother of N\n" + "\n" + "N x Q → N is the sister of Q\n" + "\n" + "Therefore, P is the maternal uncle of Q."));
        modelList.add(new Model("Question 13", "If A is the brother of B; B is the sister of C; and C is the father of D, how D is related to A?\n" + "Brother\n" + "Sister\n" + "Nephew\n" + "Cannot be determined\nAnswer 4)\nExplanation:\n" + "If D is Male, the answer is Nephew.\n" + "\n" + "If D is Female, the answer is Niece.\n" + "\n" + "As the sex of D is not known, hence, the relation between D and A cannot be determined.\n" + "\n" + "Note: Niece - A daughter of one's brother or sister, or of one's brother-in-law or sister-in-law. Nephew - A son of one's brother or sister, or of one's brother-in-law or sister-in-law."));
        modelList.add(new Model("Question 14", "If A + B means A is the brother of B; A - B means A is the sister of B and A x B means A is the father of B. Which of the following means that C is the son of M?\n" + "M - N x C + F\n" + "F - C + N x M\n" + "N + M - F x C\n" + "M x N - C + F\nAnswer 4)\nExplanation:\n" + "M x N → M is the father of N\n" + "\n" + "N - C → N is the sister of C\n" + "\n" + "and C + F → C is the brother of F.\n" + "\n" + "Hence, M is the father of C or C is the son of M"));
        modelList.add(new Model("Question 15", "Introducing a boy, a girl said, \"He is the son of the daughter of the father of my uncle.\" How is the boy related to the girl?\n" + "Brother\n" + "Nephew\n" + "Uncle\n" + "Son-in-law\nAnswer 1)\nExplanation:\n" + "The father of the boy's uncle → the grandfather of the boy and daughter of the grandfather → sister of father.\n"));
        modelList.add(new Model("Question 16", "120, 99, 80, 63, 48, ?\n" + "35\n" + "38\n" + "39\n" + "40\nAnswer 1)\nExplanation:\n" + "The pattern is - 21, - 19, - 17, - 15,.....\n" + "\n" + "So, missing term = 48 - 13 = 35."));
        modelList.add(new Model("Question 17", "589654237, 89654237, 8965423, 965423, ?\n" + "58965\n" + "65423\n" + "89654\n" + "96542\nAnswer 4)\nExplanation:\n" + "The digits are removed one by one from the beginning and the end in order alternately\n" + "\n" + "so as to obtain the subsequent terms of the series."));
        modelList.add(new Model("Question 18", "3, 10, 101,?\n" + "10101\n" + "10201\n" + "10202\n" + "11012\nAnswer 3)\nExplanation:\n" + "Each term in the series is obtained by adding 1 to the square of the preceding term.\n" + "\n" + "So, missing term = (101)2 + 1 = 10202."));
        modelList.add(new Model("Question 19", "In the series 2, 6, 18, 54, ...... what will be the 8th term ?\n" + "4370\n" + "4374\n" + "7443\n" + "7434\nAnswer 2)\nExplanation:\n" + "Clearly, 2 x 3 = 6, 6 x 3 = 18, 18 x 3 = 54,.....\n" + "\n" + "So, the series is a G.P. in which a = 2, r = 3.\n" + "\n" + "Therefore 8th term = ar8-1 = ar7 = 2 x 37 = (2 x 2187) = 4374."));
        modelList.add(new Model("Question 20", "125,80,45,20,?\n" + "5\n" + "8\n" + "10\n" + "12\nAnswer 1)\nExplanation:\n" + "The pattern is - 45, - 35, - 25, .....\n" + "\n" + "So, missing term = 20 - 15 = 5."));
        modelList.add(new Model("Question 21", "The total of the ages of Amar, Akbar and Anthony is 80 years. What was the total of their ages three years ago ?\n" + "71 years\n" + "72 years\n" + "74 years\n" + "77 years\nAnswer 1)\nExplanation:\n" + "Required sum = (80 - 3 x 3) years = (80 - 9) years = 71 years."));
        modelList.add(new Model("Question 22", "Two bus tickets from city A to B and three tickets from city A to C cost Rs. 77 but three tickets from city A to B and two tickets from city A to C cost Rs. 73. What are the fares for cities B and C from A ?\n" + "Rs. 4, Rs. 23\n" + "Rs. 13, Rs. 17\n" + "Rs. 15, Rs. 14\n" + "Rs. 17, Rs. 13\nAnswer 2)\nExplanation:\n" + "Let Rs. x be the fare of city B from city A and Rs. y be the fare of city C from city A.\n" + "\n" + "Then, 2x + 3y = 77 ...(i) and\n" + "\n" + "3x + 2y = 73 ...(ii)\n" + "\n" + "Multiplying (i) by 3 and (ii) by 2 and subtracting, we get: 5y = 85 or y = 17.\n" + "\n" + "Putting y = 17 in (i), we get: x = 13."));
        modelList.add(new Model("Question 23", "An institute organised a fete and 1/5 of the girls and 1/8 of the boys participated in the same. What fraction of the total number of students took part in the fete ?\n" + "2/13\n" + "13/40\n" + "Data inadequate\n" + "None of these\nAnswer 3)"));
        modelList.add(new Model("Question 24", "A number of friends decided to go on a picnic and planned to spend Rs. 96 on eatables. Four of them, however, did not turn up. As a consequence, the remaining ones had to contribute Rs. 4 each extra. The number of those who attended the picnic was\n" + "8\n" + "12\n" + "16\n" + "24\nAnswer 1)"));
        modelList.add(new Model("Question 25", "A, B, C, D and E play a game of cards. A says to B, \"If you give me three cards, you will have as many as E has and if I give you three cards, you will have as many as D has.\" A and B together have 10 cards more than what D and E together have. If B has two cards more than what C has and the total number of cards be 133, how many cards does B have ?\n" + "22\n" + "23\n" + "25\n" + "35\nAnswer 3)\nExplanation:\n" + "Clearly, we have :\n"+ "B-3 = E ...(i)\n"+ "B + 3 = D ...(ii)\n" + "A+B = D + E+10 ...(iii)\n" + "B = C + 2 ...(iv)\n" + "A+B + C + D + E= 133 ...(v)\n"+ "From (i) and (ii), we have : 2 B = D + E ...(vi)\n" + "From (iii) and (vi), we have : A = B + 10 ...(vii)\n"+ "Using (iv), (vi) and (vii) in (v), we get:\n"+ "(B + 10) + B + (B - 2) + 2B = 133  5B = 125  B = 25."));

    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}