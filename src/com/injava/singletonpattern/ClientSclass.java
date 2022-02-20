package com.injava.singletonpattern;

public class ClientSclass {


        public static void main(String args[]) {
            Sclass s1 = Sclass.getInstance();
            System.out.println("S1: "+ s1);
            Sclass s2 = Sclass.getInstance();
            System.out.println("S2: "+ s2);
        }
}