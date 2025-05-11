package com.aula5;

public class Aula5 {

    public static void main(String[] args) {
        Produto p1 = new Produto("apagador", 20, Tipo.ESCRITORIO);
        Produto p2 = new Produto("celular", 30, Tipo.TECNOLOGIA);
        Produto p3 = new Produto("lapis", 5, Tipo.ESCRITORIO);

        Carrinho k = new Carrinho();
        k.cadastrar(p1);
        k.cadastrar(p2);
        k.cadastrar(p3);
        //k.cadastrar(null);
        k.remover();
        System.out.println("total do carrinho: "+k.calcularTotal());
        System.out.println("");

        k.buscarPorNome("celular");

        System.out.println("");
        
        //k.calcularTotalTipo(Tipo.ESCRITORIO);
        k.listar();


    }
}
