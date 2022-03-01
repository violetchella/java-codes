package com.injava.strategypattern;

//public abstract class Context {
//    private Strategy1 s1;
//    private Strategy2 s2;
//    public void setB1(Strategy1 ss1){
//        s1=ss1;
//    }
//    public void setB2(Strategy2 ss2){
//        s2=ss2;
//    }
//    public void executeS1(){
//        s1.action1();
//    }
//    public void executeS2(){
//        s2.action2();
//    }
//    public abstract void display();
//}
public class Context {
    private Strategy1 s1;
    private Strategy2 s2;
    private String t;
    public Context(String r){
        this.t=r;
        System.out.println(t);
    }
    public void setB1(Strategy1 ss1){
        s1=ss1;
    }
    public void setB2(Strategy2 ss2){
        s2=ss2;
    }
    public void executeS(){
        s1.action1();
        s2.action2();
    }

}