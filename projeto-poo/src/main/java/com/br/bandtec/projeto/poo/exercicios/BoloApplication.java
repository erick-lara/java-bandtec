/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.bandtec.projeto.poo.exercicios;


/**
 *
 * @author Aluno
 */
public class BoloApplication {
    public static void main(String[] args) {

        Bolo bolo1 = new Bolo("Morango",30.00);
        Bolo bolo2 = new Bolo("Chocolate", 40.00);
        Bolo bolo3 = new Bolo("Abacaxi", 35.00);
        
        System.out.println("Bem vindo à confeitaria da dona Maria :D \n"
                + "Temos bolos de Chocolate, Morango e Abacaxi."
        );
            
        bolo1.comprarBolo(10);
        bolo1.comprarBolo(10);
        bolo1.comprarBolo(10);
        bolo1.comprarBolo(10);
        bolo1.comprarBolo(10);

        bolo2.comprarBolo(32);
        bolo2.comprarBolo(15);
        bolo2.comprarBolo(25);
        bolo2.comprarBolo(90);
        bolo2.comprarBolo(10);

        bolo3.comprarBolo(20);
        bolo3.comprarBolo(46);
        bolo3.comprarBolo(90);
        bolo3.comprarBolo(20);
        bolo3.comprarBolo(20);
        
        System.out.println(bolo1.exibirRelatorio());
        System.out.println(bolo2.exibirRelatorio());
        System.out.println(bolo3.exibirRelatorio());

    }
}
