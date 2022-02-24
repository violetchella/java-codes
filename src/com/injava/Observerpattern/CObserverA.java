package com.injava.Observerpattern;

public class CObserverA implements Observer{
    @Override
    public void update(String state) {
        System.out.println("  Updated A with " +state);
    }
}
