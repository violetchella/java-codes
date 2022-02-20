package com.injava.compositepattern;

public class leafPanel implements component {
    private  String pos;
    public leafPanel(String pos) {
        this.pos = pos;
    }
    @Override
    public void showd() {
        System.out.println("- "+ pos);
    }
}
