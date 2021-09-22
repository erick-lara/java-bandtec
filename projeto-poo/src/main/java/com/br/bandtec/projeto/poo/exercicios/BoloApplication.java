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
            
        bolo1.buyCake(10);
        bolo1.buyCake(10);
        bolo1.buyCake(10);
        bolo1.buyCake(10);
        bolo1.buyCake(10);

        bolo2.buyCake(32);
        bolo2.buyCake(15);
        bolo2.buyCake(25);
        bolo2.buyCake(90);
        bolo2.buyCake(10);

        bolo3.buyCake(20);
        bolo3.buyCake(46);
        bolo3.buyCake(90);
        bolo3.buyCake(20);
        bolo3.buyCake(20);
        
        System.out.println(bolo1.displayReport());
        System.out.println(bolo2.displayReport());
        System.out.println(bolo3.displayReport());

    }
}
