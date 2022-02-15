package com.injava.Abstractfactorypattern;

public class Lowdef implements Absfactory {

       public VideoExport getV(){
        return new LowV();
       }
       public AudioExport getA()   {
        return new LowA();
       }

}