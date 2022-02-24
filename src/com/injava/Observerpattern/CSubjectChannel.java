package com.injava.Observerpattern;

public class CSubjectChannel extends SubjectApp {
    private String state;
    public void setState(String s)
    {
      this.state=s;
      notify(state);
    }
    public String getState(){
        return state;

    }
}
