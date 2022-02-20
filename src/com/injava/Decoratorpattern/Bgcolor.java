package com.injava.Decoratorpattern;

public class Bgcolor extends Decorator {
    public Bgcolor(component com)
    {
        super(com);
    }
    public String apply()
    {
        return com.apply() + addBGcolor();
    }
    private String addBGcolor()
    {
        return "Bgcolor";
    }

}
