package com.br.bandtec.lista.exercicios3;

import java.util.Scanner;

public class CheckIdadeApp {
    public static void main(String[] args) {
        Scanner numReader = new Scanner(System.in);
        CheckIdade idade = new CheckIdade();
        
        Integer newAge;
        
        System.out.println("Enter your age: ");
        newAge = numReader.nextInt();
        
        idade.classificaIdade(newAge);
    }
}
