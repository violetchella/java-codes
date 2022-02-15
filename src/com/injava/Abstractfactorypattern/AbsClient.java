package com.injava.Abstractfactorypattern;

public class AbsClient {

    private VideoExport vx;
    private AudioExport ax;

    public AbsClient(Absfactory abs){
        vx=abs.getV();
        ax=abs.getA();
    }

    public static AbsClient readExport(String expo1){

        Absfactory af;
        String expo=expo1;
        if ("High".equalsIgnoreCase(expo))
            af=new Highdef();
        else if ("Low".equalsIgnoreCase(expo))
            af=new Lowdef();
        else
            return null;
        return new AbsClient(af);
    }


    public void Exportdata(){
        vx.doExport();
        ax.doExport();
    }

}
