package com.injava.Proxypattern;

public class Client {
    public static void main(String[] args){
        ExpensiveObject e=new ExpensiveObjectProxy();
        e.process();
        e.process();
        ExpensiveObject e1=new ExpensiveObjectProxy();
        e1.process();
        e1.process();
    }
}
