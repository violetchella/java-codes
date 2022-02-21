package com.injava.Adapterpattern;

public class Drive implements Game {
    @Override
    public void command() {
        System.out.println("Steady Driving, Cool");
    }

    @Override
    public void fill() {
        System.out.println(" Fill GAS");
    }
}
