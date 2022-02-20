package com.injava.singletonpattern;

public class ChocolateController {
       public static void main(String args[]) {
        ChocolateBoiler boiler = ChocolateBoiler.getInstance();
        System.out.println("boiler1: "+ boiler);
        boiler.fill();
        boiler.boil();
        boiler.drain();

        // will return the existing instance
        ChocolateBoiler boiler2 = ChocolateBoiler.getInstance();
           System.out.println("boiler2: "+ boiler2);
           boiler2.fill();
           boiler2.boil();
           boiler2.drain();
           ChocolateBoiler boiler3 = ChocolateBoiler.getInstance();
    }
}
