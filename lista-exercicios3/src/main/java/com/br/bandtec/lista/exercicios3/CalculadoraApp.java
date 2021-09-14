/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.bandtec.lista.exercicios3;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class CalculadoraApp {
    public static void main(String[] args) {
        Scanner numReader = new Scanner(System.in);
        Calculadora calculator = new Calculadora();
        
        Double firstNumber;
        Double secondNumber;
        
        System.out.println("Enter the 1st Number:");
        firstNumber = numReader.nextDouble();
        
        System.out.println("Enter the 2st Number");
        secondNumber = numReader.nextDouble();
        
        System.out.printf("The total average is: %.2f%n", 
                calculator.calcularMedia(firstNumber, secondNumber)
        );
    }
}
