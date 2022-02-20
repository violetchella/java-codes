package com.injava.singletonpattern;
//Easy Instantiation
public class Sclass {
    private static Sclass ourInstance = new Sclass();
    private Sclass() { }
    public static Sclass getInstance()
    {
        return ourInstance;
    }
}
////lazy Instantiation- multithreading problem
//public final class Sclass {
//    private static int count=0;
//    private static Sclass ourInstance;
//    private Sclass() { }
//    public static Sclass getInstance() {
//        if (ourInstance == null) {
//        System.out.println("Creating unique ourInstance of SClass");
//        ourInstance = new Sclass();
//        }
//        System.out.println("Returning instance of Sclass: "+ count++);
//        return ourInstance;
//        }
//}
////solution:Use synchronized block inside the if loop and volatile variable
//public class Sclass {
//    private static int count=0;
//    private volatile static Sclass ourInstance;
//    private Sclass() { }
//    public static Sclass getInstance() {
//        if (ourInstance == null) {
//            System.out.println("Creating unique ourInstance of SClass");
//            synchronized (Sclass.class) {
//                if (ourInstance == null)
//                    ourInstance = new Sclass();
//            }
//        }
//        System.out.println("Returning instance of Sclass: "+ count++);
//        return ourInstance;
//    }
//}
//
