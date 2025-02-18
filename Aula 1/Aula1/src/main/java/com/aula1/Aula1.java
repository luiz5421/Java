/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.aula1;

/**
 *
 * @author lab53
 */
public class Aula1 {

    public static void main(String[] args) {
        Contador k= new Contador();
        k.incrementar();
        k.incrementar();
        k.incrementar();
        k.incrementar();

        k.decrementar();

        k.mostrar();
        k.zerar();
        k.mostrar();

        Cachorro c= new Cachorro("REX","SRD");

        c.latir();
        c.mostrarRaca();

        Cachorro d= new Cachorro("MONSTRO","POODLE");

        d.latir();
        d.mostrarRaca();

        Aluno a= new Aluno("Joao",Curso.ADS);

        a.mostrarInfo();
        Aluno b= new Aluno("Mari",Curso.RH);
        b.mostrarInfo();
        
    }
}
