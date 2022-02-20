package com.injava.compositepattern;

public class leafButton implements component{
    private  String pos;
    public leafButton(String pos) {
        this.pos = pos;
            }
    @Override
    public void showd() {
        System.out.println("-- "+ pos);
    }
}
