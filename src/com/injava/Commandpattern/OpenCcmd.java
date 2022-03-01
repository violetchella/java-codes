package com.injava.Commandpattern;

public class OpenCcmd implements Command {

    private WordReceiver r;
    public OpenCcmd(WordReceiver w){
        this.r=w;
    }
    @Override
    public void docommand() {
        r.open();
    }
}
