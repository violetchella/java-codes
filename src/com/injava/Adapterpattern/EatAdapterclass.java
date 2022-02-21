package com.injava.Adapterpattern;
//class Adapter
public class EatAdapterclass extends WalkAdaptee implements Game {
    @Override
    public void command() {
        this.run();
    }

    @Override
    public void fill() {
        this.drink();
    }
}

