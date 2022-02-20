package com.injava.Factorypattern;



public class AbsClient {

      public static Export readExport(String expo1)
       {
           Export e1;
        String expo=expo1;
        if ("High".equalsIgnoreCase(expo))
            e1=new High();
        else if ("Low".equalsIgnoreCase(expo))
            e1=new Low();
        else
            return null;
        return e1;
    }

}
