package com.injava.Templatepattern;

public class Client {
    public static void main(String args[]) {
        Report r1=new PDF();
        r1.execute();
        Report r2=new Charts();
        r2.execute();
    }
}
