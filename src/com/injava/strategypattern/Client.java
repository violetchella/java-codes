package com.injava.strategypattern;

public class Client {
        public static void main(String args[]) {
           // Context c1=new CContext_a();
            Context c1=new Context("CContextA");
            c1.setB1(new CStrategy1A());
            c1.setB2(new CStrategy2A() );
            c1.executeS();
            //c1.display();
            Context c2=new Context("CContextB");
            c2.setB1(new CStrategy1A());
            c2.executeS();
        }
}

