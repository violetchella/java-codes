package com.injava.Decoratorpattern;

public class Colortext extends Decorator {
    public Colortext(component com)
    {
        super(com);
    }
    public String apply()
    {
        return co.apply() + addColortext();
    }
    private String addColortext()
    {
        return "ColorText";
    }
}
