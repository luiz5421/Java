package com.ex1;

public class Carro {

    private EstadoDoCarro estado;
    private double velocidade;

    public Carro(EstadoDoCarro estado, double velocidade) {
        this.estado = estado;
        this.velocidade = velocidade;
    }

    public EstadoDoCarro getEstado() {
        return estado;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void alterarEstado() {
        switch (estado) {
            case DESLIGADO:
                estado = EstadoDoCarro.LIGADO;
                break;
            case LIGADO:
                estado = EstadoDoCarro.MOVENDO;
                break;
            case MOVENDO:
                estado = EstadoDoCarro.PARADO;
                velocidade = 0;
                break;
            case PARADO:
                estado = EstadoDoCarro.DESLIGADO;
                break;
            default:
                System.out.println(".(2)");
        }

    }
    public void acelerar(double incremento){
        
        if(estado == estado.MOVENDO && incremento > 0)
        {
            velocidade= velocidade + incremento;
        }
        else
        {
            System.out.println("O carro prescisa está se movendo");
        }
        
    }
    public void mostrarEstado()
    {
        System.out.println("Estado do Carro: "+ estado);
        System.out.println("Velocidade do Carro: "+ velocidade);
    }

}
