package com.injava.Decoratorpattern;

public class Bgcolor extends Decorator {
    public Bgcolor(component comp)
    {
        super(comp);
    }
    public String apply()
    {
        return co.apply() + addBGcolor();
    }
    private String addBGcolor()
    {
        return "Bgcolor";
    }

}
