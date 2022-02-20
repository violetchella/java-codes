package com.injava.singletonpattern;

public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;
    public static int count=0;
    private static ChocolateBoiler uniqueInstance;

    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    public static  ChocolateBoiler getInstance() {
       if (uniqueInstance == null) {
           System.out.println("Creating unique instance of Chocolate Boiler");
           uniqueInstance = new ChocolateBoiler();
       }
        System.out.println("Returning instance of Chocolate Boiler: "+ count++);
        return uniqueInstance;
    }

    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
            System.out.println(" fill the boiler with a milk/chocolate mixture");
        }
    }

    public void drain() {
        if (!isEmpty() && isBoiled()) {
            System.out.println("drain the boiled milk and chocolate");
            empty = true;
        }
    }

    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            System.out.println("bring the contents to a boil");
            boiled = true;
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}
