package com.EX1;

public class Produto {
    String nome;
    Double preco;
    Status status;

    Produto(String nome,double  preco,Status status){

        this.nome=nome;
        this.preco=preco;
        this.status=status;
    }

    void mostrarInfo(){

        switch (status) {
            case NORMAL:
                System.out.println("Nome do produto:"+ nome);
                System.out.println("Preço do produto:"+ preco);
                break;
            case PROMO:
            preco= preco -((preco* 20)/100) ;
            System.out.println("Nome do produto:"+ nome);
            System.out.println("Preço do produto:"+ preco);
            break;
            case BIAXO_ESTOQUE:
            preco=((preco* 10)/100)+ preco;
            System.out.println("Nome do produto:"+ nome);
            System.out.println("Preço do produto:"+ preco);
                break;
            default:
                System.out.println("Status não encontrado");
    }
}
}
