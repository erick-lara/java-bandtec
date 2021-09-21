/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.bandtec.projeto.poo.exercicios;

/**
 *
 * @author AlunoThreadLocalRandom
 */
public class TesteApplication {
    public static void main(String[] args) {
        Empregado empregado1 = new Empregado("João", "Analista de Sistemas", 5400.00);
        Empregado empregado2 = new Empregado("Erick", "Desenvolvedor", 2000.00);
        
        System.out.println(empregado1.reajuste(15.0));
        
        System.out.println(empregado2.reajuste(10.0));

    }
}
