package com.injava.Commandpattern;

public class Client {
    public static void main(String args[]) {
        WordReceiver w=new WordReceiver();
        OpenCcmd oc=new OpenCcmd(w);
        ExitCcmd ec=new ExitCcmd(w);
        MenuInvorker m=new MenuInvorker();
        m.clickOpen(oc);
        m.clickExit(ec);
    }
}
