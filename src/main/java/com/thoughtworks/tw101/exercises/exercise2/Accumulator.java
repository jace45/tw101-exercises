package com.thoughtworks.tw101.exercises.exercise2;

public class Accumulator {
    int totals = 0;
    public void increment(){
        totals++;

    }

    public void total(){
        System.out.println(totals);
    }
}
