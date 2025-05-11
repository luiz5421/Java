
package com.ex3;


public class Transferencia {

    public static void tranferir(Conta de, Conta para, double valor) {
        
        if(de.getSaldo()>valor)
        {
            de.retirar(valor);
            para.depositar(valor);
        }
        else
        {
            System.out.println("A operação não pode ser realizada");
        }
    }
}
