package com.aula1;

public class Aluno {

    String nome;
    Curso curso;
    Aluno(String nome, Curso curso){

        this.nome=nome;
        this.curso=curso;

    }

    void mostrarInfo(){

        System.out.println(nome);
        switch (curso) {
            case ADS:
                System.out.println("Curso de cobol");
                break;
            case SI:
            System.out.println("Curso de desing");
            break;
            case CD:
                System.out.println("Curso de Python");
                break;
            case RH:
                System.out.println("Curso de MARI");
                break;
            case GE:
                System.out.println("Curso de ");
                break;
            case LOG:
                System.out.println("Curso de ");
                break;
            case GP:
                System.out.println("Curso de ");
                break;
            default:
                System.out.println("FDS");
        }
    }
}
