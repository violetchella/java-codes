package com.injava.compositepattern;

import java.util.ArrayList;
import java.util.List;
//composite
public class container implements component {
    private List<component> listc=new ArrayList<component>();
    @Override
    public void showd()
    {
        for(component c:listc)
            c.showd();
    }
    public void cadd(component c){
        listc.add(c);
    }
    public void cremove(component c){listc.remove(c);    }
}

