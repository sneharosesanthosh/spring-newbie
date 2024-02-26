package com.sneha.model;
public class Student {
    private String studentName;

    MathCheat mathCheat;

    public Student() {
        System.out.println("No args Student constructor called");
    }
    public Student(MathCheat mathCheat) {
        this.mathCheat = mathCheat;
    }

    public Student(String studentName, MathCheat mathCheat) {
        this.mathCheat = mathCheat;
        this.studentName = studentName;
    }

    public void studentCheating(String name) {
        mathCheat.mathCheating(name);
    }

}
