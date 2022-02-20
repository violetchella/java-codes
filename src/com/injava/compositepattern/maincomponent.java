package com.injava.compositepattern;

public class maincomponent {
    public static void main(String[] args){
      leafLabel l1=new leafLabel("Label");
      leafscrollbar s1=new leafscrollbar("Scrollbar");
      leafButton b1=new leafButton("Button1");
      leafButton b2=new leafButton("Button2");
      leafPanel p1=new leafPanel("Panel");
      container pan=new container();
      container c1=new container();
      System.out.println("Container1");
      System.out.println("  Panel created");
      pan.cadd(p1);
      pan.cadd(l1);
      pan.cadd(s1);
      c1.cadd(pan);
      c1.cadd(b1);
      c1.cadd(b2);
      c1.showd();

      System.out.println("Container2");
      container c2=new container();
      System.out.println("  Panel created");
      c2.cadd(pan);
      c2.cadd(b1);
      c2.showd();
      System.out.println("Container2 panel removed");
      c2.cremove(pan);
      c2.showd();
    }
}
