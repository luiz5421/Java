
package com.Aula6;
import java.util.Optional;

public class Aula6 {

    public static void main(String[] args) {

        //assert 0 !=0 :("Erro proposital");

        Produto p1 = new Produto("Mouse Gamer",300.00,Tipo.ESCRITORIO);
        Produto p2 = new Produto("Cadeira Gamer",1500.00,Tipo.ESCRITORIO);
        Produto p3 = new Produto("Faca Gamer",299.00,Tipo.ESCRITORIO);

        Carrinho carrinho = new Carrinho();

        carrinho.adicionar(p1);
        carrinho.adicionar(p2);
        carrinho.adicionar(p3);

        Optional<Produto> buscado= carrinho.buscarPrimeiroNome("Mouse Gamer");

        if(buscado.isPresent())
        {
            buscado.get().mostrar();
        }
        else
        {
            System.out.println("Produto não encontrado");
        }


    }
}
