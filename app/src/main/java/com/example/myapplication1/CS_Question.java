package com.example.myapplication1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class CS_Question extends AppCompatActivity {
    RecyclerView recyclerView;
    List<Model> modelList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cs_question);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("CS Question");
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
        modelList.add(new Model("Question 1", "The DBMS acts as an interface between what two components of an enterprise-class database system?\n" + "Database application and the database\n" + "Data and the database\n" + "The user and the database application\n" + "Database application and SQL\nAnswer 1)"));
        modelList.add(new Model("Question 2", "Which of the following products was an early implementation of the relational model developed by E.F. Codd of IBM?\n" + "IDMS\n" + "DB2\n" + "dBase-II\n" + "R:base\nAnswer 2)"));
        modelList.add(new Model("Question 3", "The following are components of a database except ________ .\n" + "user data\n" + "metadata\n" + "reports\n" + "indexes\nAnswer 3)"));
        modelList.add(new Model("Question 4", "An application where only one user accesses the database at a given time is an example of a(n) ________ .\n" + "single-user database application\n" + "multiuser database application\n" + "e-commerce database application\n" + "data mining database application\nAnswer 1)"));
        modelList.add(new Model("Question 5", "An on-line commercial site such as Amazon.com is an example of a(n) ________ .\n" + "single-user database application\n" + "multiuser database application\n" + "e-commerce database application\n" + "data mining database application\nAnswer 3)"));
        modelList.add(new Model("Question 6", "How long is an IPv6 address?\n" + "32 bits\n" + "128 bytes\n" + "64 bits\n" + "128 bits\nAnswer 4)\nExplanation:\n" + "An IPv6 address is 128 bits long."));
        modelList.add(new Model("Question 7", "What flavor of Network Address Translation can be used to have one IP address allow many users to connect to the global Internet?\n" + "NAT\n" + "Static\n" + "Dynamic\n" + "PAT\nAnswer 4)\nExplanation:\n" + "Port Address Translation (PAT) allows a one-to-many approach to network address translation."));
        modelList.add(new Model("Question 8", "You have 10 users plugged into a hub running 10Mbps half-duplex. There is a server connected to the switch running 10Mbps half-duplex as well. How much bandwidth does each host have to the server?\n" + "100 kbps\n" + "1 Mbps\n" + "2 Mbps\n" + "10 Mbps\nAnswer 4)\nExplanation:\n" + "Each device has 10 Mbps to the server."));
        modelList.add(new Model("Question 9", "Which of the following is the valid host range for the subnet on which the IP address 192.168.168.188 255.255.255.192 resides?\n" + "192.168.168.129-190\n" + "192.168.168.129-191\n" + "192.168.168.128-190\n" + "192.168.168.128-192\nAnswer 1)\nExplanation:\n" + "256 - 192 = 64. 64 + 64 = 128. 128 + 64 = 192. The subnet is 128, the broadcast address is 191, and the valid host range is the numbers in between, or 129-190.\n"));
        modelList.add(new Model("Question 10", "What protocol does PPP use to identify the Network layer protocol?\n" + "NCP\n" + "ISDN\n" + "HDLC\n" + "LCP\nAnswer 1)\nExplanation:\n" + "Network Control Protocol is used to help identify the Network layer protocol used in the packet."));
        modelList.add(new Model("Question 11", "Which of the following is not a type of constructor?\n" + "Copy constructor\n" + "Friend constructor\n" + "Default constructor\n" + "Parameterized constructor\nAnswer 2)"));
        modelList.add(new Model("Question 12", "Which of the following statements is correct?\n" + "Base class pointer cannot point to derived class.\n" + "Derived class pointer cannot point to base class.\n" + "Pointer to derived class cannot be created.\n" + "Pointer to base class cannot be created.\nAnswer 2)"));
        modelList.add(new Model("Question 13", "Which of the following is not the member of class?\n" + "Static function\n" + "Friend function\n" + "Const function\n" + "Virtual function\nAnswer 2)"));
        modelList.add(new Model("Question 14", "Which of the following concepts means determining at runtime what method to invoke?\n" + "Data hiding\n" + "Dynamic Typing\n" + "Dynamic binding\n" + "Dynamic loading\nAnswer: 3)"));
        modelList.add(new Model("Question 15", "Which of the following term is used for a function defined inside a class?\n" + "Member Variable\n" + "Member function\n" + "Class function\n" + "Classic function\nAnswer: 2)"));
        modelList.add(new Model("Question 16", "Which of the following concept of oops allows compiler to insert arguments in a function call if it is not specified?\n" + "Call by value\n" + "Call by reference\n" + "Default arguments\n" + "Call by pointer\nAnswer: 3)"));
        modelList.add(new Model("Question 17", "How many instances of an abstract class can be created?\n" + "1\n" + "5\n" + "13\n" + "0\nAnswer: 4)"));
        modelList.add(new Model("Question 18", "Which of the following cannot be friend?\n" + "Function\n" + "Class\n" + "Object\n" + "Operator function\nAnswer: 3)"));
        modelList.add(new Model("Question 19", "Which of the following concepts of OOPS means exposing only necessary information to client?\n" + "Encapsulation\n" + "Abstraction\n" + "Data hiding\n" + "Data binding\nAnswer: 3)"));
        modelList.add(new Model("Question 20", "Why reference is not same as a pointer?\n" + "A reference can never be null.\n" + "A reference once established cannot be changed.\n" + "Reference doesn't need an explicit dereferencing mechanism.\n" + "All of the above.\nAnswer: 4)"));
        modelList.add(new Model("Question 21", "cout is a/an __________ .\n" + "operator\n" + "function\n" + "object\n" + "macro\nAnswer: 3)"));
        modelList.add(new Model("Question 22", "Which of the following concepts provides facility of using object of one class inside another class?\n" + "Encapsulation\n" + "Abstraction\n" + "Composition\n" + "Inheritance\nAnswer: 3)"));
        modelList.add(new Model("Question 23", "How many types of polymorphisms are supported by C++?\n" + "1\n" + "2\n" + "3\n" + "4\nAnswer: 2)\nExplanation:\n" + "The two main types of polymorphism are run-time (implemented as inheritance and virtual functions), and compile-time (implemented as templates)."));
        modelList.add(new Model("Question 24", "Which of the following is an abstract data type?\n" + "int\n" + "double\n" + "string\n" + "Class\nAnswer: 4)"));
        modelList.add(new Model("Question 25", "Which of the following approach is adapted by C++?\n" + "Top-down\n" + "Bottom-up\n" + "Right-left\n" + "Left-right\nAnswer: 2)"));
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}