package com.ex1;

import java.util.ArrayList;
import java.util.List;

public class Radar {

    private List<Carro> carros;

    public Radar() {
        this.carros = new ArrayList<>();
    }

    public void adicionar(Carro carro) {
        if(carro != null)
        {
        carros.add(carro);
        }
    }

    public void mostrarCarrosMovendo() {
        System.out.println("Carros em movimento:");
        for (int i = 0; i < carros.size(); i++) {
            Carro carro = carros.get(i);
            if (carro.getEstado() == EstadoDoCarro.MOVENDO) {
                carro.mostrarEstado();
            }
        }
    }

    public void mostrarCarrosdesligados() {
        System.out.println("Carros desligados:");
        for (int i = 0; i < carros.size(); i++) {
            Carro carro = carros.get(i);
            if (carro.getEstado() == EstadoDoCarro.DESLIGADO) {
                carro.mostrarEstado();
            }
        }
    }

    public void calcularVelocidadeMedia() {
        double somaveloc = 0, velocidademedia = 0;
        int qt = 0;
        for (int i = 0; i < carros.size(); i++) {
            Carro carro = carros.get(i);
            if (carro.getEstado() == EstadoDoCarro.MOVENDO) {
                qt++;
                somaveloc = somaveloc + carro.getVelocidade();
            }
        }
        velocidademedia = somaveloc / qt;
        System.out.println("Velocidade media dos carros em movimento: " + velocidademedia);
    }

    public void quantidadeCarros() {

        int qt = 0;
        for (int i = 0; i < carros.size(); i++) {
            Carro carro = carros.get(i);
            if (carro.getEstado() == EstadoDoCarro.MOVENDO) {
                qt++;
            }
        }
        System.out.println("Quantidade de Carros: " + qt);
    }
}
