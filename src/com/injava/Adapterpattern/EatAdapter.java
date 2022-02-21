package com.injava.Adapterpattern;
//object Adapter
public class EatAdapter implements Game {
    private WalkAdaptee wa;
    public EatAdapter(WalkAdaptee w){
        this.wa=w;
    }
    @Override
    public void command() {
        wa.run();
    }

    @Override
    public void fill() {
        wa.drink();
    }
}

