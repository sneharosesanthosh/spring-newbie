package com.sneha.model;
public class Student {
    private String studentName;

//    MathCheat mathCheat;   // using the implementation/class reference
    ScienceCheat scienceCheat;
    public Student() {
        System.out.println("No args Student constructor called");
    }
    public Student(MathCheat mathCheat, ScienceCheat scienceCheat) {
//        this.mathCheat = mathCheat;
        this.scienceCheat = scienceCheat;
    }

    public Student(String studentName, MathCheat mathCheat, ScienceCheat scienceCheat) {
//        this.mathCheat = mathCheat;
        this.scienceCheat = scienceCheat;
        this.studentName = studentName;
    }

    public void studentCheating(String name) {
//        mathCheat.mathCheating(name);
        scienceCheat.scienceCheat(name);
    }

}
