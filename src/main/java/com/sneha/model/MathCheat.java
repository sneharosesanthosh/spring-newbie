package com.sneha.model;

public class MathCheat implements Cheat{


    public MathCheat() {
        System.out.println("MathCheat: NoArgs constructor called");
    }

    @Override
    public void cheat(String name) {
        System.out.println("Math cheating started by "+ name);
    }
}
