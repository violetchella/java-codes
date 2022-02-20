package com.injava.compositepattern;

public class leafscrollbar implements component {
    private  String pos;
    public leafscrollbar(String pos) { this.pos = pos; }
    @Override
    public void showd() {
        System.out.println("- "+ pos);
    }
}
