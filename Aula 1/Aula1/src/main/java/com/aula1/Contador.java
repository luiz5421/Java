
package com.aula1;

public class Contador {
    int quantidade;

    void zerar(){
        quantidade=0;
    }

    void incrementar(){
        quantidade=quantidade+1;
    }
    void decrementar(){
        if(quantidade>0)
        quantidade--;
    }

    void mostrar(){
        System.out.println(quantidade);
    }


}
