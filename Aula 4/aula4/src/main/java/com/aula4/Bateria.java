
package com.aula4;

public class Bateria {

    private int carga;

    public Bateria(int carga) {
        this.carga =Math.min(Math.max(0, carga), 100);
    }

    public void gastar(int qt){
        int aux= Math.min(carga, qt);
        assert (aux > carga): "qt tem que ser maior que carga";
        carga=carga-aux;

    }

    public void recarregar(){
        if (carga<=95){
            carga=carga+5;
        }
        else{
            carga=100;
        }
    }

    public boolean isVazio(){
       return carga==0;
    }

    public boolean verificarEnergia(){
        return carga>=5;
    }
}
