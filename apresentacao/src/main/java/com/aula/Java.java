
package com.aula;

/**
 * ctrl+shift+p 
 * 
 * @author lab53
 */
public class Java {

    public static void main(String[] args) {
        Jogador j = new Jogador();
        j.nome="Neymar";
        j.clube="Santos";
        j.camisa=10;

        j.mostrarInfo();
        
        Jogador j2 = new Jogador();
        j2.nome="Messi";
        j2.clube="Santos";
        j2.camisa=10;
        j2.mostrarInfo();
    }
}
