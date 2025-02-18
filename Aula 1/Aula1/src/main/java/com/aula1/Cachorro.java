
package com.aula1;

public class Cachorro {
    String nome, raca;

    Cachorro(String nome, String raca){
        //this.nome-> atributo
        //nome-> parametro(local)
        this.nome=nome;
        this.raca=raca;
    }


    void latir(){

        System.out.println(nome+":AUAUAU");
    }

    void mostrarRaca(){
        System.out.println(raca);
    }


}
