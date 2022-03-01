package com.injava.Templatepattern;

public abstract class Report {
    public final void execute(){
        establishConn();
        fetchdata();
        saveformat();
    }
    public void establishConn(){
        System.out.println("Connection Established");
    }
    public void fetchdata(){
        System.out.println("Fetch Data ");
    }
    public abstract void saveformat();
}
