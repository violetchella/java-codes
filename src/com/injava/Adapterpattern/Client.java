package com.injava.Adapterpattern;
//oject Adapter
public class Client {
    public static void main(String[] args){
        WalkAdaptee w =new WalkAdaptee();
        Game g1=new Drive();
        Game g2=new EatAdapter((new WalkAdaptee()));
        System.out.println(" Drive");
        g1.command();
        g1.fill();
        System.out.println(" new EatAdapter(new WalkAdaptee())");
        g2.command();
        g2.fill();
        System.out.println("   WalkAdaptee");
        w.run();
        w.drink();
    }
}
