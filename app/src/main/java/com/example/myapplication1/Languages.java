package com.example.myapplication1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import android.animation.LayoutTransition;
import android.content.Intent;
import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Languages extends AppCompatActivity {

    RecyclerView recyclerView;
    List<Model> modelList;
    CardView cardView1,cardView2,cardView3;
    TextView T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25;
    LinearLayout L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_languages);
        recyclerView = findViewById(R.id.recyclerView);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Languages");
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

        modelList.add(new Model("Question 1", "Which of the following statements should be used to obtain a remainder after dividing 3.14 by 2.1 ?\n 1) rem = 3.14 % 2.1;\n 2) rem = modf(3.14, 2.1);\n 3) rem = fmod(3.14, 2.1);\n 4) Remainder cannot be obtain in floating point division.\n\n Answer: Option 3)\n Explanation: fmod(x,y) - Calculates x modulo y, the remainder of x/y. This function is the same as the modulus operator. But fmod() performs floating point divisions."));
        modelList.add(new Model("Question 2", "What are the types of linkages?\n1)Internal and External\n2)External, Internal and None\n3)External and None\n4)Internal\n\nAnswer: Option 2)\nExplanation:\n" + "External Linkage- means global, non-static variables and functions.\nInternal Linkage- means static variables and functions with file scope.\nNone Linkage- means Local variables."));
        modelList.add(new Model("Question 3", "Which of the following special symbol allowed in a variable name?\n1)* (asterisk)\n2)| (pipeline)\n3)- (hyphen)\n4)_ (underscore)\n\nAnswer: Option 4)"));
        modelList.add(new Model("Question 4", "What do the following declaration signify?\nint *f();\n1)f is a pointer variable of function type.\n2)f is a function returning pointer to an int.\n3)f is a function pointer.\n4)f is a simple declaration of pointer variable.\n\nAnswer: Option 2)"));
        modelList.add(new Model("Question 5", "By default a real number is treated as a?\n1)float\n2)double\n3)long double\n4)far double\n\nAnswer: Option 3)"));
        modelList.add(new Model("Question 6", "Is the following statement a declaration or definition?\nextern int i;\n1)Declaration\n2)Definition\n3)Function\n4)Error\n\nAnswer: Option 1)"));
        modelList.add(new Model("Question 7", "When we mention the prototype of a function?\n1)Defining\n2)Declaring\n3)Prototyping\n4)Calling\n\nAnswer: Option 2)"));
        modelList.add(new Model("Question 8", "The keyword used to transfer control from a function back to the calling function is?\n1)switch\n2)goto\n3)go back\n4)return\n\nAnswer: Option 4)"));
        modelList.add(new Model("Question 9", "What is (void*)0?\n1)Representation of NULL pointer\n2)Representation of void pointer\n3)Error\n4)None of above\n\nAnswer: Option 1)"));
        modelList.add(new Model("Question 10", "In which header file is the NULL macro defined?\n1)stdio.h\n2)stddef.h\n3)stdio.h and stddef.h\n4)math.h\n\nAnswer: Option 3)"));
        modelList.add(new Model("Question 11", "How many bytes are occupied by near, far and huge pointers (DOS)?\n1)near=2 far=4 huge=4\n2)near=4 far=8 huge=8\n3)near=2 far=4 huge=8\n4)near=4 far=4 huge=8\n\nAnswer: Option 1)"));
        modelList.add(new Model("Question 12", "If a variable is a pointer to a structure, then which of the following operator is used to access data members of the structure through the pointer variable?\n1).\n2)/\n3)*\n4)none of above\n\nAnswer: Option 4)"));
        modelList.add(new Model("Question 13", "What would be the equivalent pointer expression for referring the array element a[i][j][k][l]?\n1)((((a+i)+j)+k)+l)\n2)*(*(*(*(a+i)+j)+k)+l)\n3)(((a+i)+j)+k+l)\n4)((a+i)+j+k+l)\n\nAnswer: Option 2)"));
        modelList.add(new Model("Question 14", "A pointer is?\n1)A keyword used to create variables\n2)A variable that stores address of an instruction\n3)A variable that stores address of other variable\n4)All of the above\n\nAnswer: Option 3)"));
        modelList.add(new Model("Question 15", "The operator used to get value at address stored in a pointer variable is?\n1)*\n2)!=\n3)==\n4)||\n\nAnswer: Option 1)"));
        modelList.add(new Model("Question 16", "Which of the following function is more appropriate for reading in a multi-word string?\n1)printf();\n2)scanf();\n3)gets();\n4)puts();\n\nAnswer: Option 3)"));
        modelList.add(new Model("Question 17", "What is the similarity between a structure, union and enumeration?\n1)All of them let you define new values\n2)All of them let you define new data types\n3)All of them let you define new pointers\n4)All of them let you define new structures\n\nAnswer: Option 2)"));
        modelList.add(new Model("Question 18", "Which header file should be included to use functions like malloc() and calloc()?\n1)memory.h\n2)stdlib.h\n3)string.h\n4)dos.h\n\nAnswer: Option 2)"));
        modelList.add(new Model("Question 19", "Specify the 2 library functions to dynamically allocate memory?\n1)malloc() and memalloc()\n2)alloc() and memalloc()\n3)malloc() and calloc()\n4)memalloc() and faralloc()\n\nAnswer: Option 3)"));
        modelList.add(new Model("Question 20", "The maximum combined length of the command-line arguments including the spaces between adjacent arguments is?\n1)128 characters\n2)256 characters\n3)67 characters\n4)It may vary from one operating system to another\n\nAnswer: Option 4)"));
        modelList.add(new Model("Question 21", "What do the following declaration signify?\nint *ptr[30];\n1)ptr is a pointer to an array of 30 integer pointers.\n2)ptr is a array of 30 pointers to integers.\n3)ptr is a array of 30 integer pointers.\n4)ptr is a array 30 pointers.\n\nAnswer: Option 2)"));
        modelList.add(new Model("Question 23", "What do the following declaration signify?\nint *f();\n1)f is a pointer variable of function type.\n2)f is a function returning pointer to an int.\n3)f is a function pointer.\n4)f is a simple declaration of pointer variable.\n\nAnswer: Option 2)"));
        modelList.add(new Model("Question 24", "What do the following declaration signify?\nchar *scr;\n1)scr is a pointer to pointer variable.\n2)scr is a function pointer.\n3)scr is a pointer to char.\n4)scr is a member of function pointer.\n\nAnswer: Option 3)"));
        modelList.add(new Model("Question 25", "What are the different types of real data type in C ?\n1)float, double\n2)short int, double, long int\n3)float, double, long double\n4)double, long int, float\n\nAnswer: Option 3)"));
        modelList.add(new Model("Question 26", "What will you do to treat the constant 3.14 as a long double?\n1)use 3.14LD\n2)use 3.14L\n3)use 3.14DL\n4)use 3.14LF\n\nAnswer: Option 2)\nExplanation:Given 3.14 is a double constant.\nTo specify 3.14 as long double, we have to add L to the 3.14. (i.e 3.14L)"));
        modelList.add(new Model("Question 27", "A float occupies 4 bytes. If the hexadecimal equivalent of these 4 bytes are A, B, C and D, then when this float is stored in memory in which of the following order do these bytes gets stored?\n1)ABCD\n2)DCBA\n3)0xABCD\n4)Depends on big endian or little endian architecture\n\nAnswer: Option 4)"));

    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }

}











