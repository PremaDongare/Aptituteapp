package com.example.myapplication1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class Technical_Que extends AppCompatActivity {
    RecyclerView recyclerView;
    List<Model> modelList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_technical_que);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Technical Que");
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
        modelList.add(new Model("Question 1", "Which of the following approach is adapted by C++?\n" + "Top-down\n" + "Bottom-up\n" + "Right-left\n" + "Left-right\nAnswer: 1)"));
        modelList.add(new Model("Question 2", "Out of all the 2-digit integers between 1 and 100, a 2-digit number has to be selected at random. What is the probability that the selected number is not divisible by 7?\n" + "13/90\n" + "12/90\n" + "78/90\n" + "77/90\nAnswer: 4)\nExplanation: There are total 90 two digit numbers, out of them 13 are divisible by 7, these are 14, 21, 28, 35, 42, 49, 56, 63, 70, 77, 84, 91, 98. Therefore, probability that selected number is not divisible by 7 = 1 – 13/90 = 77/90. So, option (D) is true."));
        modelList.add(new Model("Question 3", "If the difference between expectation of the square of a random variable (E[X²]) and the square of the expectation of the random variable (E[X])² is denoted by R, then?\n" + "R = 0\n" + "R < 0\n" +"R >= 0\n" + "R > 0\nAnswer: 3)\nExplanation: The difference between  (E[X²]) and (E[X])² is called variance of a random variable.  Variance measures how far a set of numbers is spread out. (A variance of zero indicates that all the values are identical.) A non-zero variance is always positive:"));
        modelList.add(new Model("Question 4", "A deck of 5 cards (each carrying a distinct number from 1 to 5) is shuffled thoroughly. Two cards are then removed one at time from the deck. What is the probability that the two cards are selected with the number on the first card being one higher than the number on the second card?\n" + "1/5\n" + "4/25\n" + "1/4\n" + "2/5\nAnswer: 1)\nExplanation: You have to select 2 cards from 5. Since the order in which they are drawn matters, there are 5P2 = 5!/3! = 20 elementary events from which there are 4 favorable number of cases: 5 before 4, 4 before 3, 3 before 2 and 2 before 1. Hence, probability = 4/20 = 1/5"));
        modelList.add(new Model("Question 5", "Let X be a random variable following normal distribution with mean +1 and variance 4. Let Y be another normal variable with mean -1 and variance unknown If P(X <=-1) = P(Y >=2). the standard deviation of Y is\n" + "3\n" + "2\n" + "sqrt(2)\n" + "1\nAnswer: 1)"));
        modelList.add(new Model("Question 6", "#include <stdio.h>\n"+"#define a 10\n"+"int main()\n" + "{\n" + "printf(\"%d \",a);\n" + " \n" + "#define a 50\n" +"printf(\"%d \",a);\n" + "  return 0;\n" + "}\n" + "Compiler Error\n" + "10 50\n" + "50 50\n" + "10 10\nAnswer: 2)"));
        modelList.add(new Model("Question 7", "#include <stdio.h>\n" + "#define square(x) x*x\n" + "int main()\n" + "{\n" + "  int x;\n" + "  x = 36/square(6);\n" + "  printf(\"%d\", x);\n" + "  return 0;\n" + "}\n" + "1\n" + "36\n" + "0\n" + "Compiler Error\nAnswer: 2)\nExplanation: Preprocessor replaces square(6) by 6*6 and the expression becomes x = 36/6*6 and value of x is calculated as 36. Note that the macro will also fail for expressions “x = square(6-2)” If we want correct behavior from macro square(x), we should declare the macro as\n" + "#define square(x) ((x)*(x)) "));
        modelList.add(new Model("Question 8", "#include <stdio.h>\n" + "#define macro(n, a, i, m) m##a##i##n\n" + "#define MAIN macro(n, a, i, m)\n" + " \n" + "int MAIN()\n" + "{\n" + "    printf(\"AptiGenius\");\n" + "    return 0;\n" + "}\n"  + "Compiler Error\n" + "AptiGenius\n"+ "MAIN\n" + "main\nAnswer: 2)"));
        modelList.add(new Model("Question 9", "#include <stdio.h>\n" + "#define ISEQUAL(X, Y) X == Y\n" + "int main()\n" + "{\n" + "    #if ISEQUAL(X, 0)\n" + "        printf(\"AptiGenius\");\n" + "    #else\n" + "        printf(\"Quiz\");\n" + "    #endif\n" + "    return 0;\n" + "}\n" + "Output of the above program?\n" + "AptiGenius\n" + "Quiz\n" + "Any of Geeks or Quiz\n" + "Compile time error\n\nAnswer: 1)"));
        modelList.add(new Model("Question 10", "#include <stdio.h>\n" + "#define a 10\n" + "int main()\n" + "{\n" + "  printf(\"%d \",a);\n" + " \n" + "  #define a 50\n" + " \n" + "  printf(\"%d \",a);\n" + "  return 0;\n" + "}\n" +"Compiler Error\n" + "10 50\n" + "50 50\n" + "10 10\nAnswer: 2)"));
        modelList.add(new Model("Question 11", "#include<stdio.h> \n" + "#define f(g,g2) g##g2 \n" + "int main() \n" + "{ \n" + "   int var12 = 100; \n" + "   printf(\"%d\", f(var,12)); \n" + "   return 0; \n" + "}\n" + "Run on IDE\n" + "100\n" + "Compiler Error\n" + "0\n" + "1\nAnswer: 1)\nExplanation: The operator ## is called “Token-Pasting” or “Merge” Operator. It merges two tokens into one token. So, after preprocessing, the main function becomes as follows, and prints 100."));
        modelList.add(new Model("Question 12", "Predict the output of following program?\n" + "#include <stdio.h>\n" + "#define MAX 1000\n" + "int main()\n" + "{\n" + "   int MAX = 100;\n" + "   printf(\"%d \", MAX);\n" + "   return 0;\n" + "}\n" + "Run on IDE\n" + "1000\n" + "100\n" + "Compiler Error\n" + "Garbage Value\nAnswer: 3)\nAfter preprocessing stage of compilation, the function main() changes"));
        modelList.add(new Model("Question 13", "#include <stdio.h>\n" + "#if X == 3\n" + "    #define Y 3\n" + "#else\n" + "    #define Y 5\n" + "#endif\n" + " \n" + "int main()\n" + "{\n" + "    printf(\"%d\", Y);\n" + "    return 0;\n" + "}\nWhat is the output of the above program?\n" + "3\n" + "5\n" + "3 or 5 depending on value of X\n"  + "Compile time error\nAnswer: 2)"));
        modelList.add(new Model("Question 14", "In C, sizes of an integer and a pointer must be same.\n" + "True\n" + "False\n\nAnswer: 2)\nExplanation: Sizes of integer and pointer are compiler dependent. The both sizes need not be same."));
        modelList.add(new Model("Question 15", "#include <stdio.h>\n" + "int main()\n" + "{\n" + "    if (sizeof(int) > -1)\n" + "        printf(\"Yes\");\n" + "    else\n" + "        printf(\"No\");\n" + "    return 0;\n" + "}\n"+ "Yes\n" + "No\n" + "Compiler Error\n" + "Runtime Error\nAnswer: 2)\nExplanation: In C, when an integer value is compared with an unsigned it, the int is promoted to unsigned. Negative numbers are stored in 2’s complement form and unsigned value of the 2’s complement form is much higher than the sizeof int."));
        modelList.add(new Model("Question 16", "Suppose n and p are unsigned int variables in a C program. We wish to set p to nC3. If n is large, which of the following statements is most likely to set p correctly?\n" + "p = n * (n-1) * (n-2) / 6;\n" + "p = n * (n-1) / 2 * (n-2) / 3;\n" + "p = n * (n-1) / 3 * (n-2) / 2;\n" + "p = n * (n-1) * (n-2) / 6.0;\nAnswer: 2)\nExplanation: As n is large, the product n*(n-1)*(n-2) will go out of the range(overflow) and it will return a value different from what is expected. Therefore, option (A) and (D) are eliminated. So we consider a shorter product n*(n-1). n*(n-1) is always an even number. So the subexpression ” n * (n-1) / 2 ” in option B would always produce an integer, which means no precision loss in this subexpression. And when we consider ” n*(n-1)/2*(n-2) “, it will always give a number which is a multiple of 3. So dividing it with 3 won’t have any loss."));
        modelList.add(new Model("Question 17", "Output of following program?\n" + "#include<stdio.h>\n" + "int main()\n" + "{\n" + "    float x = 0.1;\n" + "    if ( x == 0.1 )\n" + "        printf(\"IF\");\n" + "    else if (x == 0.1f)\n" + "        printf(\"ELSE IF\");\n" + "    else\n" + "        printf(\"ELSE\");\n" + "}\n" + "ELSE IF\n" + "IF\n" + "ELSE\nAnswer: 1)"));
        modelList.add(new Model("Question 18", "Suppose a C program has floating constant 1.414, what's the best way to convert this as \"float\" data type?\n" + "(float)1.414\n" + "float(1.414)\n" + "1.414f or 1.414F\n" + "1.414 itself of \"float\" data type i.e. nothing else required.\nAnswer: 3)\nExplanation: By default floating constant is of double data type. By suffixing it with f or F, it can be converted to float data type."));
        modelList.add(new Model("Question 19", "Predict the output\n" + "#include <stdio.h>\n" + " \n" + "int main()\n" + "{\n" + "   float c = 5.0;\n" + "   printf (\"Temperature in Fahrenheit is %.2f\", (9/5)*c + 32);\n" + "   return 0;\n" + "}\n"  + "Temperature in Fahrenheit is 41.00\n" + "Temperature in Fahrenheit is 37.00\n" + "Temperature in Fahrenheit is 0.00\n" + "Compiler Error\nAnswer: 2)\nExplanation: Since 9 and 5 are integers, integer arithmetic happens in subexpression (9/5) and we get 1 as its value. To fix the above program, we can use 9.0 instead of 9 or 5.0 instead of 5 so that floating point arithmetic happens."));
        modelList.add(new Model("Question 20", "Predict the output of following C program\n" + "#include <stdio.h>\n" + "int main()\n" + "{\n" + "    char a = 012;\n" + " \n" + "    printf(\"%d\", a);\n" + " \n" + "    return 0;\n" + "}\n" + "Compiler Error\n" + "12\n" + "10\n" + "Empty\nAnswer: 3)\nExplanation: The value ‘\\012’ means the character with value 12 in octal, which is decimal 10. Note: It is equivalent to char a = 012 and int a = ‘\\012’ and int a = 012."));
        modelList.add(new Model("Question 21", "Assume that the size of char is 1 byte and negatives are stored in 2's complement form\n" + "#include<stdio.h>\n" + "int main()\n" + "{\n" + "    char c = 125;\n" + "    printf(\"%d\", c);\n" + "    return 0;\n" + "}\n"  + "135\n" + "+INF\n" + "-121\n" + "-8\nAnswer: 3)\nExplanation: 125 is represented as 01111101 in binary and when we add 10 i.e 1010 in binary it becomes : 10000111. Now what does this number represent? Firstly, you should know that char can store numbers only -128 to 127 since the most significant bit is kept for sign bit. Therefore 10000111 represents a negative number. To check which number it represents we find the 2’s complement of it and get 01111001 which is = 121 in decimal system. Hence, the number 10000111 represents -121."));
        modelList.add(new Model("Question 22", "#include <stdio.h>\n" + "int main()\n" + "{\n" + "    if (sizeof(int) > -1)\n" + "        printf(\"Yes\");\n" + "    else\n" + "        printf(\"No\");\n" + "    return 0;\n" + "}\n"  + "Yes\n" + "No\n" + "Compiler Error\n" + "Runtime Error\nAnswer: 2)\nExplanation: In C, when an integer value is compared with an unsigned it, the int is promoted to unsigned. Negative numbers are stored in 2’s complement form and unsigned value of the 2’s complement form is much higher than the sizeof int."));
        modelList.add(new Model("Question 23", "When fopen() is not able to open a file, it returns\n" + "EOF\n" + "NULL\n" + "Runtime Error\n" + "Compiler Dependent\nAnswer: 2)\nExplanation: fopen() returns NULL if it is not able to open the given file due to any of the reasons like file not present, inappropriate permissions, etc."));
        modelList.add(new Model("Question 24", "getc() returns EOF when\n" + "End of files is reached\n" + "When getc() fails to read a character\n" + "Both of the above\n" + "None of the above\n\nAnswer: 3)"));
        modelList.add(new Model("Question 25", "In fopen(), the open mode \"wx\" is sometimes preferred \"w\" because. 1) Use of wx is more efficient. 2) If w is used, old contents of file are erased and a new empty file is created. When wx is used, fopen() returns NULL if file already exists.\n" + "Only 1\n" + "Only 2\n" + "Both 1 and 2\n" + "Neither 1 nor 2\nAnswer: 2)"));
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}