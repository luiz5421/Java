package com.aula4;

public class Endereco {
    private String cep,logradouro,cidade;
    private Estado estado;

    public Endereco(String cep, String cidade, Estado estado, String logradouro) {
        this.cep = cep;
        this.cidade = cidade;
        this.estado = estado;
        this.logradouro = logradouro;
    }

    public void mostrarInfo(){

        System.out.println("cep:"+ cep);
        System.out.println("cidade:"+ cidade);
        System.out.println("logradouro:"+ logradouro);
        System.out.println("estado:"+ estado);

    }

}
