package com.injava.Observerpattern;

import java.util.ArrayList;
import java.util.List;

public abstract class SubjectApp {
    private final List<Observer> olist=new ArrayList<Observer>();
    public void register(Observer o){
        olist.add(o);
    }
    public void deregister(Observer o){
        olist.remove(o);
    }
    protected void notify(String state){
        for(Observer obs:olist)
            obs.update(state);
    }
}
