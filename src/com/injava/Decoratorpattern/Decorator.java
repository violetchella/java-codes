package com.injava.Decoratorpattern;

public abstract class Decorator implements component {
    protected component co;
    public Decorator(component c)
    {
        this.co=c;
    }
    public String apply(){
        return co.apply();
    }
}
