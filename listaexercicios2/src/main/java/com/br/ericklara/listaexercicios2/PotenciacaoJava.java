package com.br.ericklara.listaexercicios2;

import java.util.Scanner;

public class PotenciacaoJava {
    public static void main(String[] args) {
        Scanner numReader = new Scanner(System.in);
        Integer base;
        Integer firstBase ;
        Integer exponent;

        System.out.println("Enter your base Number: ");
        firstBase = numReader.nextInt();

        System.out.println("Enter your exponent Number:");
        exponent = numReader.nextInt();

        base = firstBase;

        for(int i  = 1; i < exponent; i++){
            base *= firstBase;
        }

        System.out.printf("The value of %d raised to %d is %d.",
                firstBase,
                exponent,
                base);
    }
}
