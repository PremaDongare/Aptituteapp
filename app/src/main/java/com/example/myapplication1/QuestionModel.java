package com.example.myapplication1;

public class QuestionModel {
    private Object question,optionA,optionB,optionC,optionD,correctANS;
     private  int setNo;
     public  QuestionModel(){

     }
    public QuestionModel(Object question, Object optionA, Object optionB, Object optionC, Object optionD, Object correctANS,int setNo) {
        this.setNo = setNo;
        this.question = question;
        this.optionA = optionA;
        this.optionB = optionB;
        this.optionC = optionC;
        this.optionD = optionD;
        this.correctANS = correctANS;
    }

    public Object getQuestion() {
        return question;
    }

    public void setQuestion(Object question) {
        this.question = question;
    }

    public Object getOptionA() {
        return optionA;
    }

    public void setOptionA(Object optionA) {
        this.optionA = optionA;
    }

    public Object getOptionB() {
        return optionB;
    }

    public void setOptionB(Object optionB) {
        this.optionB = optionB;
    }

    public Object getOptionC() {
        return optionC;
    }

    public void setOptionC(Object optionC) {
        this.optionC = optionC;
    }

    public Object getOptionD() {
        return optionD;
    }

    public void setOptionD(Object optionD) {
        this.optionD = optionD;
    }

    public Object getCorrectANS() {
        return correctANS;
    }

    public void setCorrectANS(Object correctANS) {
        this.correctANS = correctANS;
    }

    public int getSetNo() {
        return setNo;
    }

    public void setSetNo(int setNo) {
        this.setNo = setNo;
    }
}
