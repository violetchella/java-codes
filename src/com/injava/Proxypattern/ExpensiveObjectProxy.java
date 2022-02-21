package com.injava.Proxypattern;

public class ExpensiveObjectProxy implements ExpensiveObject{
    private static ExpensiveObject obj;

    @Override
    public void process() {
        if (obj==null)
            obj=new ExpensiveObjectImplementation();
        obj.process();
    }
}
