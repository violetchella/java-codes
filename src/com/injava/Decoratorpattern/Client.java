package com.injava.Decoratorpattern;

public class Client {
    public static void main(String[] args){
        component c=new Bgcolor(new Colortext(new Button()));
        System.out.println(c.apply());
    }
}
