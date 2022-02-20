package com.injava.Factorypattern;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class clientdemo
 {
         public static void main(String args[])
         {
            System.out.println("Enter High or Low Export:");
            BufferedReader ex = new BufferedReader(new InputStreamReader(System.in));
            String expo = null;
            try
            {
                expo = ex.readLine();
                Export ac=AbsClient.readExport(expo);
                ac.doExport();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
 }
