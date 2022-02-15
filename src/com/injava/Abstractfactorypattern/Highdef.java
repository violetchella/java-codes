package com.injava.Abstractfactorypattern;

public class Highdef implements Absfactory {


     public VideoExport getV()
      {
            return new HighV();
      }
      public AudioExport getA()
      {
       return new HighA();
      }



}
