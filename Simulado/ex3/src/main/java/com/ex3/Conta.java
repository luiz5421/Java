package com.ex3;


public class Conta {

    private String nome;
    private double saldo;

    public Conta(String nome, double saldo) {
        this.nome = nome;
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor){
        saldo=saldo+valor;
    }
    public void retirar(double valor ){
        double aux;
        aux=saldo-valor;
        if(saldo>0 && aux>=0)
        {
            saldo=saldo-valor;
        }
        else
        {
            System.out.println("saldo insuficiente");
        }
    }

    public boolean verificar(){
        return saldo>0;
    }
    

}
