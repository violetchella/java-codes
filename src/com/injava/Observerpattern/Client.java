package com.injava.Observerpattern;

public class Client {
    public static void main(String[] args) {
        CSubjectChannel channel=new CSubjectChannel();
        channel.register(new CObserverA());
        channel.register(new CObserverB());
        channel.setState("New pattern");
    }
    }
