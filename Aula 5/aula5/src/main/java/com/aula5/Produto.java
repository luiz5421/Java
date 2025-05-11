
package com.aula5;

public class Produto {
    private final String nome;
    private double preco;
    private Tipo tipo;

    public Produto(String nome, double preco, Tipo tipo) {
        this.nome = nome;
        this.preco = preco;
        this.tipo = tipo;
    }

    public double getPreco() {
        return preco;
    }

    public Tipo getTipo() {
        return tipo;
    }
    public String getNome() {
        return nome;
    }

   public void mostrarInfo(){

    System.out.println("Nome:"+nome);
    System.out.println("Preço:"+preco);
    System.out.println("Tipo:"+ tipo);
   }
    
    

    
}
