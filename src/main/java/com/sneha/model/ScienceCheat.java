package com.sneha.model;

public class ScienceCheat implements Cheat{
    public ScienceCheat() {
        System.out.println("ScienceCheat: NoArgs constructor called");
    }

    @Override
    public void cheat(String name) {
        System.out.println("Science Cheating started by "+name);
    }
}
