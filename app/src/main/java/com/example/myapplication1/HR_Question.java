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
        modelList.add(new Model("Question 1", "1. Tell me about yourself.\nHello Sir/Madam. Good Morning.\nThank you for providing me a wonderful opportunity to express myself in front of you.\n My name is P.Moulika,I am from proddatur.\nI am currently pursuing Btech in the stream of Electronics and Communication Engineering at Gouthami Institute of Technology and Management for Women with 80%.\n\nI completed my State Board if Technical Education at government Polytechnic College with 69%.\nI completed my schooling at Z.P High School at 72%.\nI know programming languages like C, Python, HTML .And coming to my technical skills,I know Very Large scale Scale Integration.\nMy hobbies are traveling, and listening to music.\n\nMy short-term goal is to get a job and explore my skills and knowledge.\nMy term goal is to achieve a good position in a reputed company."));
        modelList.add(new Model("Question 2", "2. Tell me about yourself.\nMy name is Saibarapu Jasnavi. I am from Proddatur, Kadapa district.\nComing to my educational background I am currently pursuing my Bachelor of Technology in the Gouthami Institute of Technology and Management for Women.\nThere are 5 members in my family including me.\nMy father is a Weaver and my mother is a housewife.\nMy short-term goal is to get placed in a reputed company where I can improve my skills and knowledge.\nMy long-term goal is to get placed in a reputed company.\nI have a piece of knowledge on C, Python, HTML, CSS.\nI have done projects on Portfolio by using HTML, CSS, and Javascript.\nI completed an Internship on Data Science in Internshala.\nI also completed an Internship on AI and ML in the APLMS portal.\nMy hobbies are Listening to Music and Dancing.\nThank you."));
        modelList.add(new Model("Question 3", "1. Why should I hire you?\nI am a fresher I hope that the job description matches my skills and qualifications. If I have a chance I can enhance my career as well as the company."));
        modelList.add(new Model("Question 4", "2. Why should I hire you?\nBased on my relevant skills and passion for the Industry.\nMy positive attitude, work ethic, and long-term goals align with the job requirements, making me a committed and valuable asset to the company."));
        modelList.add(new Model("Question 5", "3. Why should I hire you?\nBased on my skill knowledge and passion for industry.\nMy positive attitude, work ethic, and long term goals align with the job requirements, making me a committed and valuable asset to the company.\nThank you."));
        modelList.add(new Model("Question 6", "4. Why should I hire you?\nI am a fresher. I have no experience but if you give me a chance to work in your company then I will give my 100% effort in working and lead to go best level with your company."));
        modelList.add(new Model("Question 7", "1. What are your strengths and weaknesses?\nMy strength is I am a positive thinker. I take everything positive for the sake of myself to be better in my life and for the future also.\nMy weakness is I am not a public speaker, but I am trying to improve my speaking in front of people by taking opportunities and imitations.\n"));
        modelList.add(new Model("Question 8", "2. What are your strengths and weaknesses?\nMy strengths are I am a quick learner and always I like to gain new skills.\nMy weakness is I don't say no to anyone for help and I am a sensitive person or My weakness is I am straightforward or My weakness is I always over-prepare for any work that is assigned to me. I feel uncomfortable until I finish my work."));
        modelList.add(new Model("Question 9", "Why do you want to work at our company?\n1) Everyone wants to join in a highly growing company so I searched for that, so I thought that your company is better to me. I utilize my knowledge and skills to develop your organization and as well as myself also.\n2) I think I am capable enough with the skills that you mentioned and herd about you are positive company. As a fresher, I see this opportunity as a way to contribute my knowledge for company growth.\n3) I consider this company as a well-known popular and reputed company so, I want to get placed in this company for my career and I think this is the best place to achieve my short-term goal."));
        modelList.add(new Model("Question 10", "What is the difference between confidence and over confidence?\nConfidence means a self-belief that I can do it and to be ready for everything with that attitude and hope.\nOverconfidence is excessive self-assurance means, they believe that they are more talented, and skilled than they are.or \nAccording to me, Confidence means positive thinking.\nOverconfidence means a person has over attitude toward his knowledge.\nor According to me, confidence means positive thinking, Example: I can do that given work on time.\nAnd Overconfidence means over positive thinking, eg: no one can do this task except me"));
        modelList.add(new Model("Question 11", "How do you feel about working nights and weekends?\nIn my point of view doing night shift and at weekends is not big problem if it is work from home. If the person is doing job at workplace then their is a problem of relocation at midnights. As the company require extra time to work in order to complete the project then I will try to do work at night shift.\n or As a fresher, it's my responsibility & My priority is to gain knowledge and experience. If will need to work nights and weekends then I will be ready to work at any time.\n or Sir/Madam, I am a fresher thus firstly my priority is to learn & gain experience.\nor Secondly, I come from a college background where we were given a lot of exposure & we would take up challenges and work on it at any required schedule."));
        modelList.add(new Model("Question 12", "Would you lie for the company?\nI don't lie for the company, if the situation is demanding, if the company gets anything in return from that lie I will definitely lie in a positive manner.\n or I will try my best not to lie to the company but if a problem occurs and if it will help the growth of the company without harming any assets.\nIt's depending on the situation, it will in a positive way so that no one can feel hurt."));
        modelList.add(new Model("Question 13", "What motivates you to do good job?\nThe only motivator was my mother because she had worked so hard since her childhood, and she had got a lot of debt for my studies. So this makes me motivated to work a lot.\n or As I'm a self-motivated person my mistakes motivates me a lot to do my job properly.\n or The only motivator was my father because he had worked so hard since his childhood, and he had got a lot of debt for my studies. So this makes me motivate to work a lot so everyday can motivated for me."));
        modelList.add(new Model("Question 14", "Give me an example of your creativity.\n Creativity for me is to reuse the waste items and turns it into a new thing of home.\n or According to me, Creativity is nothing but doing ordinary work in an extraordinary way.\nLike; a software employee solves a problem by first analyzing it, then designing and then coding and finally testing it.\n or It is the concept of seeing something from a different perspective in order to make things more doable, less time-consuming and more interesting."));
        modelList.add(new Model("Question 15", "Are not you overqualified for this position?\nNo sir, I don't think I'm overqualified. I have only theoretical knowledge from my bachelor's degree, even though I have done a few projects in various phases of engineering, that won't match the level of practical experience required in Industries. So, I just believe that I'm qualified with enough knowledge in my field of education."));
        modelList.add(new Model("Question 16", "How long would you expect to work for us if hired?\nI can work as long as the company wants me and long periods of work will satisfy me and financially independent. So, I will work much time & many years it helped me to gain experience and more knowledge.\n or You have allowed me to improve my technical skills and knowledge. As long as the company is satisfied with my work then I would like to continue my work for the growth of our company.\n or As long as my health is good, I will work in your company."));
        modelList.add(new Model("Question 17", "What was the toughest decision you ever had to make?\nMaking decisions will not be tough as long as you have clear thought process. But on our path of fulfillment of that decision we should not look back and rethink about taking this decision. One must believe in his path no matter what."));
        modelList.add(new Model("Question 18", "Describe your ideal company, location and job.\nAn ideal job is a job which gives self-satisfaction to the core as it is our dream job. And it is a job where I should work from my heart. \n or I believe an ideal company is where I can grow and learn.\nI would love to stay in Pune, so it is my ideal location a job that can give me a work-life balance is ideal for me."));
        modelList.add(new Model("Question 19", "How much salary do you expect?\nAs a fresher, my priority is to enhance my skills and knowledge. I will accept a considerable salary for this position that will help me to achieve my economic needs \nor I will go according to the company's norms. I will accept a considerable salary for this position that will help me to achieve my economic needs. "));
        modelList.add(new Model("Question 20", "Where do you see yourself five years from now?\nAfter 5 years, I would like to see myself in a leading position with more knowledge, skills, and as one of the responsible people in the company. I will use these years to gain more knowledge and experience so that I can reach the position I want to be in. I will contribute my entire skills to develop the company and simultaneously gain knowledge from the company."));
        modelList.add(new Model("Question 21", "Do you have any questions for me?\nYes sir, what do you think I should improve in myself? or What are the roles and responsibilities of this job role and what are the daily day-to-day activities?"));

        }
}