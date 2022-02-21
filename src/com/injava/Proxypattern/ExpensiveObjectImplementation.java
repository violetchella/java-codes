package com.injava.Proxypattern;

public class ExpensiveObjectImplementation implements ExpensiveObject {
    public void initialconfig(){
        System.out.println("Loading initial configuration");
    }

    public ExpensiveObjectImplementation(){
        initialconfig();
    }

    @Override
    public void process() {
        System.out.println("Process complete");
    }
}
