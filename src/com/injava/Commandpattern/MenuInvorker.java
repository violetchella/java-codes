package com.injava.Commandpattern;

public class MenuInvorker {
    private Command openc,exitc;
    public void clickOpen(Command o){
        openc=o;
        openc.docommand();
    }
    public void clickExit(Command e){
        exitc=e;
        exitc.docommand();
    }
}
