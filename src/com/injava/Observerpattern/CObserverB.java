package com.injava.Observerpattern;

public class CObserverB implements Observer {
    public void update(String state) {
        System.out.println("  Updated B with " +state);
    }
}
