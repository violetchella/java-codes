package com.injava.Abstractfactorypattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class client {
    public static void main(String args[]) {
        System.out.println("Enter High or Low Export:");
        BufferedReader ex = new BufferedReader(new InputStreamReader(System.in));
        String expo = null;
         try {
                 expo = ex.readLine();
                 AbsClient ac=AbsClient.readExport(expo);
                 ac.Exportdata();
             }
         catch (IOException e) {
                 e.printStackTrace();
         }
    }

}