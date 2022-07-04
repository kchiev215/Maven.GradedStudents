package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {

    private String firstName;
    private String lastName;
    private ArrayList<Double> examScores;

    public Student(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = new ArrayList<>();
    }


    public Student(String firstName, String lastName, Double[] testScores){
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = new ArrayList<>(Arrays.asList(testScores));
    }

    public void setFName(String firstName){this.firstName = firstName;}

    public String getFirstName(){
        return this.firstName;
    }

    public void setLName(String lastName){this.lastName = lastName;}

    public String getLastName(String lastName){
        return this.lastName;
    }

    public int getNumberofExamsTaken(){return examScores.size();}

    public void addExamScore(double examScore){examScores.add(examScore);}

    public int setExamScore(int examNumber, double newScore){
        examScores.remove(examNumber-1);
        examScores.add(examNumber-1, newScore);




    }



}
