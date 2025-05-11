
package com.aula4;

public class Sapo {


    private int qtPulo;//cada sapo terá
    private static int qtSapo;//um qtsapo para todos

    public Sapo(){

        qtPulo++;
        qtSapo++;
    
    }

    public int getQtPulo() {
        return qtPulo;
    }

     public static int getQtSapo() {
        return qtSapo;
    }



}
