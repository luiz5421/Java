/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.EX1;

/**
 *
 * @author lab53
 */
public class EX1 {

    public static void main(String[] args) {
        
        
        Produto b= new Produto("Melancia", 10.0 , Status.NORMAL);
        b.mostrarInfo();

        Produto a= new Produto("Melancia", 10.0 , Status.PROMO);
        a.mostrarInfo();

        Produto p= new Produto("Melancia", 10.0 , Status.BIAXO_ESTOQUE);
        p.mostrarInfo();
    }
}
