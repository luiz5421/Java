
package com.aula4;

public class Celular {
    private String nome,numero;
    private Bateria bat;
    private Status status;

    public Celular(Bateria bat, String nome, String numero, Status status) {
        this.bat = bat;
        this.nome = nome;
        this.numero = numero;
        this.status = status;
    }

    public void ligar(){
        if(bat.isVazio() || status.getStatus())
            return;
        bat.gastar(5);
        System.out.println("OI"+nome);
        status= status.ON;
    }

    public void desligar(){

        if(status.getStatus())
        status=Status.OFF;
    }

    public void mostrarInfo(){
        if(!bat.verificarEnergia() || !status.getStatus())
            return;
        bat.gastar(5);

        System.out.println("Nome:"+nome);
        System.out.println("Numero:"+numero);

    }

}
