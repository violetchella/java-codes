package com.injava.Commandpattern;

public class ExitCcmd implements Command {
     private WordReceiver r;
     public ExitCcmd(WordReceiver w){
         this.r=w;
     }
    @Override
    public void docommand() {
        r.exit();
    }
}
