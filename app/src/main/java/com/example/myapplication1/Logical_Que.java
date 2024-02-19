package com.example.myapplication1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class Logical_Que extends AppCompatActivity {
    RecyclerView recyclerView;
    List<Model> modelList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logical_que);
        recyclerView = findViewById(R.id.recyclerView);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Logic Que");
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
        modelList.add(new Model("Question 1", "Look at this series: 2, 1, (1/2), (1/4), ... What number should come next?\n" + "(1/3)\n" + "(1/8)\n" + "(2/8)\n" + "(1/16)\nAnswer 2)\nExplanation:\n" + "This is a simple division series; each number is one-half of the previous number.\n" + "In other terms to say, the number is divided by 2 successively to get the next result.\n" + "4/2 = 2 2/2 = 1 1/2 = 1/2 (1/2)/2 = 1/4 (1/4)/2 = 1/8 and so on."));
        modelList.add(new Model("Question 2", "Look at this series: 7, 10, 8, 11, 9, 12, ... What number should come next?\n" + "7\n" + "10\n" + "12\n" + "13\nAnswer 2)\nExplanation:\n" + "This is a simple alternating addition and subtraction series. In the first pattern, 3 is added; in the second, 2 is subtracted."));
        modelList.add(new Model("Question 3", "Look at this series: 36, 34, 30, 28, 24, ... What number should come next?\n" + "20\n" + "22\n" + "23\n" + "26\nAnswer 2)\nExplanation:\n" + "This is an alternating number subtraction series. First, 2 is subtracted, then 4, then 2, and so on."));
        modelList.add(new Model("Question 4", "Look at this series: 22, 21, 23, 22, 24, 23, ... What number should come next?\n" + "22\n" + "24\n" + "25\n" + "26\nAnswer 3)\nExplanation:\n" + "In this simple alternating subtraction and addition series; 1 is subtracted, then 2 is added, and so on.\n"));
        modelList.add(new Model("Question 5", "Look at this series: 53, 53, 40, 40, 27, 27, ... What number should come next?\n" + "12\n" + "14\n" + "27\n" + "53\nAnswer 2)\nExplanation:\n" + "In this series, each number is repeated, then 13 is subtracted to arrive at the next number."));
        modelList.add(new Model("Question 6", "SCD, TEF, UGH, ____, WKL\n" + "CMN\n" + "UJI\n" + "VIJ\n" + "IJT\nAnswer 3)\nExplanation:\n" + "There are two alphabetical series here. The first series is with the first letters only: STUVW. The second series involves the remaining letters: CD, EF, GH, IJ, KL."));
        modelList.add(new Model("Question 7", "B2CD, _____, BCD4, B5CD, BC6D\n" + "B2C2D\n" + "BC3D\n" + "B2C3D\n" + "BCD7\nAnswer 2)\nExplanation:\n" + "Because the letters are the same, concentrate on the number series, which is a simple 2, 3, 4, 5, 6 series, and follows each letter in order."));
        modelList.add(new Model("Question 8", "FAG, GAF, HAI, IAH, ____\n" + "JAK\n" + "HAL\n" + "HAK\n" + "JAI\nAnswer 1)\nExplanation:\n" + "The middle letters are static, so concentrate on the first and third letters. The series involves an alphabetical order with a reversal of the letters. The first letters are in alphabetical order: F, G, H, I , J. The second and fourth segments are reversals of the first and third segments. The missing segment begins with a new letter."));
        modelList.add(new Model("Question 9", "ELFA, GLHA, ILJA, _____, MLNA\n" + "OLPA\n" + "KLMA\n" + "LLMA\n" + "KLLA\nAnswer 4)\nExplanation:\n" + "The second and forth letters in the series, L and A, are static. The first and third letters consist of an alphabetical order beginning with the letter E."));
        modelList.add(new Model("Question 10", "CMM, EOO, GQQ, _____, KUU\n" + "GRR\n" + "GSS\n" + "ISS\n" + "ITT\nAnswer 3)\nExplanation:\n" + "The first letters are in alphabetical order with a letter skipped in between each segment: C, E, G, I, K. The second and third letters are repeated; they are also in order with a skipped letter: M, O, Q, S, U."));
        modelList.add(new Model("Question 11", "Which word does NOT belong with the others?\n" +"parsley\n" + "basil\n" + "dill\n" + "mayonnaise\nAnswer 4)\nExplanation:\n" + "Parsley, basil, and dill are types of herbs. Mayonnaise is not an herb."));
        modelList.add(new Model("Question 12", "Which word does NOT belong with the others?\n" + "inch\n" + "ounce\n" + "centimeter\n" + "yard\nAnswer 2)\nExplanation:\n" + "An ounce measures weight; the other choices measure length."));
        modelList.add(new Model("Question 13", "Which word does NOT belong with the others?\n" + "tyre\n" + "steering wheel\n" + "engine\n" + "car\nAnswer 4)\nExplanation:\n" + "Tyre, steering wheel, and engine are all parts of a car."));
        modelList.add(new Model("Question 14", "Which word does NOT belong with the others?\n" + "tulip\n" + "rose\n" + "bud\n" + "daisy\nAnswer 3)\nExplanation:\n" + "Tulip, rose, and daisy are all types of flowers. A bud is not."));
        modelList.add(new Model("Question 15", "Which word does NOT belong with the others?\n" + "rye\n" + "sourdough\n" + "pumpernickel\n" + "loaf\nAnswer 1)\nExplanation:\n" + "Loaf, sourdough, and pumpernickel are types of bread. A rye is not a bread type.\n" + "Loaf - Bread that is shaped and baked in one piece and usually sliced before being eaten.\n" + "Pumpernickel - Dark, dense German bread made from coarsely ground whole-grain rye.\n" + "Sourdough - Leaven for making bread, consisting of fermenting dough, typically that left over from a previous batch.\n" + "Rye - A wheatlike cereal plant that tolerates poor soils and low temperatures."));
        modelList.add(new Model("Question 16", "Tanya is older than Eric.\n" + "Cliff is older than Tanya.\n" + "Eric is older than Cliff.\n" + "If the first two statements are true, the third statement is\n" + "true\n" + "false\n" + "uncertain\nAnswer 2)\nExplanation:\n" + "Because the first two statements are true, Eric is the youngest of the three, so the third statement must be false.v"));
        modelList.add(new Model("Question 17", "Blueberries cost more than strawberries.\n" + "Blueberries cost less than raspberries.\n" + "Raspberries cost more than strawberries and blueberries.\n" + "If the first two statements are true, the third statement is\n" + "true\n" + "false\n" + "uncertain\nAnswer 1)\nExplanation:\n" + "Because the first two statements are true, raspberries are the most expensive of the three."));
        modelList.add(new Model("Question 18", "All the trees in the park are flowering trees.\n" + "Some of the trees in the park are dogwoods.\n" + "All dogwoods in the park are flowering trees.\n" + "If the first two statements are true, the third statement is\n" + "true\n" + "false\n" + "uncertain\nAnswer 1)\nExplanation:\n" + "All of the trees in the park are flowering trees, So all dogwoods in the park are flowering trees."));
        modelList.add(new Model("Question 19", "Mara runs faster than Gail.\n" + "Lily runs faster than Mara.\n" + "Gail runs faster than Lily.\n" + "If the first two statements are true, the third statement is\n" + "true\n" + "false\n" + "uncertain\nAnswer 2)\nExplanation:\n" + "We know from the first two statements that Lily runs fastest. Therefore, the third statement must be false."));
        modelList.add(new Model("Question 20", "Apartments in the Riverdale Manor cost less than apartments in The Gaslight Commons.\n" + "Apartments in the Livingston Gate cost more than apartments in the The Gaslight Commons.\n" + "Of the three apartment buildings, the Livingston Gate costs the most.\n" + "If the first two statements are true, the third statement is\n" + "true\n" + "false\n" + "uncertain\nAnswer 1)\nExplanation:\n" + "Since the Gaslight Commons costs more than the Riverdale Manor and the Livingston Gate costs more than the Gaslight Commons, it is true that the Livingston Gate costs the most.\n"));
        modelList.add(new Model("Question 21", "Here are some words translated from an artificial language.\n" + "gorblflur means fan belt\n" + "pixngorbl means ceiling fan\n" + "arthtusl means tile roof\n" + "Which word could mean \"ceiling tile\"?\n" + "gorbltusl\n" + "flurgorbl\n" + "arthflur\n" + "pixnarth\nAnswer 4)\nExplanation:\n" + "Gorbl means fan; flur means belt; pixn means ceiling; arth means tile; and tusl means roof. Therefore, pixnarth is the correct choice."));
        modelList.add(new Model("Question 22", "Here are some words translated from an artificial language.\n" + "hapllesh means cloudburst\n" + "srenchoch means pinball\n" + "resbosrench means ninepin\n" + "Which word could mean \"cloud nine\"?\n" + "leshsrench\n" + "ochhapl\n" + "haploch\n" + "haplresbo\nAnswer 4)\nExplanation:\n" + "Hapl means cloud; lesh means burst; srench means pin; och means ball; and resbo means nine. Leshsrench (choice a) doesn't contain any of the words needed for cloud nine. We know that och means ball, so that rules out choices b and c. When you combine hapl (cloud) with resbo (nine), you get the correct answer"));
        modelList.add(new Model("Question 23", "Here are some words translated from an artificial language.\n" + "moolokarn means blue sky\n" + "wilkospadi means bicycle race\n" + "moolowilko means blue bicycle\n" + "Which word could mean \"racecar\"?\n" + "wilkozwet\n" + "spadiwilko\n" + "moolobreil\n" + "spadivolo\nAnswer 4)\nExplanation:\n" + "From wilkospadi, you can determine that wilko means bicicyle and spadi means race. Therefore, the first part of the word that means racecar should begin with spadi. That limits your choices to b and d. Choice b, spadiwilko, is incorrect because we have already determined that wilkomeans bicycle. Therefore, the answer must be choice d, spadivolo."));
        modelList.add(new Model("Question 24", "Here are some words translated from an artificial language.\n" + "migenlasan means cupboard\n" + "lasanpoen means boardwalk\n" + "cuopdansa means pullman\n" + "Which word could mean \"walkway\"?\n" + "poenmigen\n" + "cuopeisel\n" + "lasandansa\n" + "poenforc\nAnswer 4)\nExplanation:\n" + "Migen means cup; lasan means board; poen means walk; cuop means pull; and dansa means man. The only possible choices, then, are choices a and d. Choice a can be ruled out because migen means cup."));
        modelList.add(new Model("Question 25", "Here are some words translated from an artificial language.\n" + "agnoscrenia means poisonous spider\n" + "delanocrenia means poisonous snake\n" + "agnosdeery means brown spider\n" + "Which word could mean \"black widow spider\"?\n" + "deeryclostagnos\n" + "agnosdelano\n" + "agnosvitriblunin\n" + "trymuttiagnos\nAnswer 3)\nExplanation:\n" + "In this language, the noun appears first and the adjectives follow. Since agnos means spider and should appear first, choices a and d can be ruled out. Choice b can be ruled out because delano means snake."));
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}