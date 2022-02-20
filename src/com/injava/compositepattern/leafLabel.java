package com.injava.compositepattern;

public class leafLabel implements component {
    private  String pos;
    public leafLabel(String pos) { this.pos = pos; }
    @Override
    public void showd() {
        System.out.println("--"+ pos);
    }
}
