package com.injava.Decoratorpattern;

public abstract class Decorator implements component {
    protected component com;
    public Decorator(component c)
    {
        this.com=c;
    }
    public String apply(){
        return com.apply();
    }
}
