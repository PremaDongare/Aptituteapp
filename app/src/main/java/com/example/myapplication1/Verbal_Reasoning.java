package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Verbal_Reasoning extends AppCompatActivity {

    RecyclerView recyclerView;
    List<Model> modelList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verbal_reasoning);

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

        modelList.add(new Model("Question 1", "Arrange the words given below in a meaningful sequence.\n 1.Key 2.Door 3.Lock 4.Room 5.Switch on\n1)5, 1, 2, 4, 3\n2)4, 2, 1, 5, 3\n3)1, 3, 2, 4, 5\n4)1, 2, 3, 5, 4\nAnswer: Option 3)"));
        modelList.add(new Model("Question 2", "Arrange the words given below in a meaningful sequence.\n 1. Word\t2. Paragraph\t3. Sentence\n4. Letters\t5. Phrase\n1)4, 1, 5, 2, 3\n2)\n4, 1, 3, 5, 2\n3)4, 2, 5, 1, 3\n4)4, 1, 5, 3, 2\n\nAnswer: Option 4)"));
        modelList.add(new Model("Question 3", "Arrange the words given below in a meaningful sequence.\n1. Family\t2. Community\t3. Member\n4. Locality\t5. Country\n1)3, 1, 2, 4, 5\n2)3, 1, 2, 5, 4\n3)3, 1, 4, 2, 5\n4)3, 1, 4, 5, 2\n\nAnswer: Option 1)"));
        modelList.add(new Model("Question 4", "Arrange the words given below in a meaningful sequence.\n1. Police\t2. Punishment\t3. Crime\n4. Judge\t5. Judgement\n1)3, 1, 2, 4, 5\n2)1, 2, 4, 3, 5\n3)5, 4, 3, 2, 1\n4)3, 1, 4, 5, 2\n\nAnswer: Option 4)"));
        modelList.add(new Model("Question 5", "Arrange the words given below in a meaningful sequence.\n1. Poverty\t2. Population\t3. Death\n4. Unemployment\t5. Disease\n1)2, 3, 4, 5, 1\n2)3, 4, 2, 5, 1\n3)2, 4, 1, 5, 3\n4)1, 2, 3, 4, 5\n\nAnswer: Option 3)"));
        modelList.add(new Model("Question 6", "Pointing to a photograph of a boy Suresh said, He is the son of the only son of my mother.\" How is Suresh related to that boy?\n1)Brother\n2)Uncle\n3)Cousin\n4)Father\n\nAnswer: Option 4)\nExplanation:\nThe boy in the photograph is the only son of the son of Suresh's mother i.e., the son of Suresh. Hence, Suresh is the father of boy."));
        modelList.add(new Model("Question 7", "If A + B means A is the mother of B; A - B means A is the brother B; A % B means A is the father of B and A x B means A is the sister of B, which of the following shows that P is the maternal uncle of Q?\n1)Q - N + M x P\n2)P + S x N - Q\n3)P - M + N x Q\n4)Q - S % P\n\nAnswer: Option 3)\nExplanation:\nP - M → P is the brother of M\nM + N → M is the mother of N\nN x Q → N is the sister of Q\nTherefore, P is the maternal uncle of Q."));
        modelList.add(new Model("Question 8", "If A is the brother of B; B is the sister of C; and C is the father of D, how D is related to A?\n1)Brother\n2)Uncle\n3)Cousin\n4)Cannot be determined\n\nAnswer: Option 4)"));
        modelList.add(new Model("Question 9", "Introducing a boy, a girl said,He is the son of the daughter of the father of my uncle. How is the boy related to the girl?\n1)Brother\n2)Uncle\n3)Cousin\n4)Son-in-law\n\nAnswer: Option 1)"));
        modelList.add(new Model("Question 10", "Pointing to a photograph Lata says,He is the son of the only son of my grandfather.How is the man in the photograph related to Lata?\n1)Brother\n2)Data is inadequate\n3)Cousin\n4)Son-in-law\n\nAnswer: Option 1)\nExplanation:\nThe man in the photograph is the son of the only son of Lata's grandfather i.e., the man is the son of Lata's father. Hence, the man is the brother of Lata."));
        modelList.add(new Model("Question 11", "If A + B means A is the brother of B; A x B means A is the son of B; and A % B means B is the daughter of A then which of the following means M is the maternal uncle of N?\n1)M + O x N\n2)M % O x N + P\n3)M + O % N\n4)None of these\n\nAnswer: Option 4)\nExplanation:\nBecause the sex of O is not known.\n"));
        modelList.add(new Model("Question 13", "Pointing to a photograph. Bajpai said, He is the son of the only daughter of the father of my brother.How Bajpai is related to the man in the photograph?\n1)Uncle\n2)Brother\n3)Cousin\n4)Father\n\nAnswer: Option 4)\nExplanation:\nThe man in the photo is the son of the sister of Bajpai. Hence, Bajpai is the maternal uncle of the man in the photograph."));
        modelList.add(new Model("Question 14", "Deepak said to Nitin, That boy playing with the football is the younger of the two brothers of the daughter of my father's wife.How is the boy playing football related to Deepak?\n1)Brother\n2)Son\n3)Cousin\n4)Cannot be determined\n\nAnswer: Option 1)\nExplanation:\nFather's wife → mother. Hence, the daughter of the mother means sister and sister's younger brother means brother. Therefore, the boy is the brother of Deepak."));
        modelList.add(new Model("Question 15", "Choose the word which is different from the rest.\n1)Chicken\n2)Snake\n3)Swan\n4)Crocodile\n\nAnswer: Option 1)\nExplanation:\nAll except Chicken can live in water."));
        modelList.add(new Model("Question 16", "Choose the word which is different from the rest.\n1)Rigveda\n2)Yajurveda\n3)Atharvaveda\n4)Ayurveda\n\nAnswer: Option 4)\nExplanation:\nAll except Ayurveda are names of holy scriptures, the four Vedas. Ayurveda is a branch of medicine."));
        modelList.add(new Model("Question 17", "A train always has\n1)Rails\n2)Driver\n3)Guard\n4)Engine\n\nAnswer: Option 4)"));
        modelList.add(new Model("Question 18", "Which one of the following is always found in 'Bravery'?\n1)Experience\n2)Power\n3)Courage\n4)Knowledge\n\nAnswer: Option 3)"));
        modelList.add(new Model("Question 19", "Yesterday I saw an ice cube which had already melted due to heat of a nearby furnace.\n1)Always\n2)Never\n3)Often\n4)Sometimes\n\nAnswer: Option 2)\nExplanation:\nSince the ice cube had already melted due to the heat of a nearby furnace so after this ice cannot remain as ice cube."));
        modelList.add(new Model("Question 20", "What is found necessarily in milk?\n1)Cream\n2)Curd\n3)Water\n4)Whiteness\n\nAnswer: Option 4)"));
        modelList.add(new Model("Question 21", "One morning Udai and Vishal were talking to each other face to face at a crossing. If Vishal's shadow was exactly to the left of Udai, which direction was Udai facing?\n1)East\n2)West\n3)North\n4)South\n\nAnswer: Option 3)"));
        modelList.add(new Model("Question 23", "Y is in the East of X which is in the North of Z. If P is in the South of Z, then in which direction of Y, is P?1)West\n2)East\n3)None of these\n4)South\n\nAnswer: Option 3)"));
        modelList.add(new Model("Question 24", "A man walks 5 km toward south and then turns to the right. After walking 3 km he turns to the left and walks 5 km. Now in which direction is he from the starting place?\n1)East\n2)South\n3)South-West\n4)North-East\n\nAnswer: Option 2)"));
        modelList.add(new Model("Question 25", "A boy rode his bicycle Northward, then turned left and rode 1 km and again turned left and rode 2 km. He found himself 1 km west of his starting point. How far did he ride northward initially?\n1)4 km\n2)1 km\n3)2 km\n4)7 km\n\nAnswer: Option 3)"));
    }
}















