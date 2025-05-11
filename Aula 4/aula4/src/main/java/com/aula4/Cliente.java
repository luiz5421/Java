package com.aula4;

public class Cliente {

    private String nome;
    //puxo todos os membros publicos de endereço
    //co            nstrutor e o mostrar infos
    private Endereco endereco;

    public Cliente(Endereco endereco, String nome) {
        this.endereco = endereco;
        this.nome = nome;
    }

    public void mostrarInfos() {
        System.out.println("nome:" + nome);
        //reaproveitamos o codigo já emplementado em endereco
        endereco.mostrarInfo();
    }
}
