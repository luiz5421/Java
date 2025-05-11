
package com.ex1;


public class Ex1 {

    public static void main(String[] args) {

        Carro meuCarro = new Carro();
        meuCarro.mostrarEstado();
        System.out.println(" ");
        meuCarro.alterarEstado();
        meuCarro.mostrarEstado();
        System.out.println(" ");
        meuCarro.alterarEstado();
        meuCarro.mostrarEstado();
        meuCarro.acelerar(200);
        meuCarro.mostrarEstado();
    }
}
