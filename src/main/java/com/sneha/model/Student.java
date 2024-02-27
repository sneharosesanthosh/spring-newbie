package com.sneha.model;
public class Student {
    private String studentName;

//    MathCheat mathCheat;   // using the implementation/class reference
    Cheat cheat;   // using the interface reference
    public Student() {
        System.out.println("No args Student constructor called");
    }
    public Student(Cheat cheat) {
//        this.mathCheat = mathCheat;
        this.cheat = cheat;
    }

    public Student(String studentName, Cheat cheat) {
//        this.mathCheat = mathCheat;
        this.cheat = cheat;
        this.studentName = studentName;
    }

    public void studentCheating(String name) {
//        mathCheat.mathCheating(name);
        cheat.cheat(name);
    }

}
