package com.injava.Decoratorpattern;

public class Fontsize extends Decorator {
    public Fontsize(component com)
    {
        super(com);
    }
    public String apply()
    {
        return co.apply() + addFontsize();
    }
    private String addFontsize()
    {
        return "FontSize";
    }
}
