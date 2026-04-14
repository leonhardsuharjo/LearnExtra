package com.example.gradebook;

/*
always add CONSTRUCTOR to a private final
    inside the constuctor, there will be super() constructor

if we have exact same line twice ==> overriding happens, leading to error
    if its not exact same ==> overload happens, not error

private final static needed to be initialized
*/

public class GradeBook {
    private final String firstName; 
    private final String lastName; 
    private final String stdId; 
    private final static Subject sub=new Subject("OOP"); 
    
    public GradeBook (String firstName, String lastName, String stdId){
        this.firstName = firstName;

    }
}

class Subject {
    private final String name; /* initialized to zero as default value */
    private int grade;
    
    public Subject(String n){
        name=n; 
    }

    public int getGrade(){return grade;} /* access modifier */

    public void setGrade(int grade){
        if (grade >= 0)&& (grade < 32) this.grade = grade; 
    }

    

}