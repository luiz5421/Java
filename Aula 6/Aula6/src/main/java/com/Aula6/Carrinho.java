
package com.Aula6;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Optional;

public class Carrinho {

    //lista de produtos
    private ArrayList<Produto> carrinho;

    public Carrinho(){
        //a lista deve ser criada na memoria antes do seu uso
        carrinho= new ArrayList<Produto>();
    }

    public void adicionar(Produto p){

        if(p!= null)
        {
            carrinho.add(p);
        }
    }
    public void listar(){

        //for(int i=0; i< carrinho.size(); i++)
        //{
          //  carrinho.get(i).mostrar();
        //}

        for(Produto produto : carrinho)
        {
            produto.mostrar();
        }
    }

    public double calcularToltal(){

        double soma=0;

        for(Produto produto : carrinho)
        {
            soma += produto.getPreco();
        }
        return soma;
    }
    public double calcularPortipo(Tipo t){

        double soma=0;

        for(Produto produto : carrinho)
        {
            if(t==produto.getTipo())
            {
                soma += produto.getPreco();
            }
            
        }
        return soma;
    }

    public Optional<Produto> buscarPrimeiroNome(String nm){

        for(Produto produto : carrinho)
        {   // equals compara conteudo
            //== compara endereço de memoria
            if(nm.equals(produto.getNome()))
            {
                 return Optional.of(produto);
            }
            
        }
       return Optional.empty();
        
    }

    public ArrayList<Produto> buscarPorNome(String nm){

        ArrayList<Produto> aux = new ArrayList<Produto>();
        for(Produto produto : carrinho)
        {   
            if(produto.getNome().equals(nm))
            {
                 aux.add(produto);
            }
            
        }
        return aux; 
    }

    public void removerPorNome(String nm){
        Optional<Produto> produtoachadoounao= buscarPrimeiroNome(nm);

        if(produtoachadoounao.isPresent())
        {
            carrinho.remove(produtoachadoounao.get());
        }
        else
        {
            System.out.println("Produto não encontrado");
        }
    }

}
