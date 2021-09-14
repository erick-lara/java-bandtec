/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.bandtec.metodos;

/**
 *
 * @author Aluno
 */
public class TesteCalculadora {
    public static void main(String[] args) {
        
        Calculadora calculator = new Calculadora();
        
        System.out.printf("Resultado: %d%n", calculator.soma(4, 8));
        calculator.divisao(10, 2);
        calculator.multiplicar(2, 7);
        calculator.subtrair(10,8);
        System.out.printf("É par? - %s", calculator.isPar(5)? "Sim" : "Não"); 
    }
}
