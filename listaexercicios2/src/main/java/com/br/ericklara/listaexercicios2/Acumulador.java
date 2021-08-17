package com.br.ericklara.listaexercicios2;

import java.util.Scanner;

public class Acumulador {

    public static void main(String[] args) {
        Scanner numReader = new Scanner(System.in);
        Integer numberValues;
        Integer totalValue = 0;

        System.out.println("Enter the values of the numbers you want! If want to end, enter '0'");
        numberValues = numReader.nextInt();
        while (numberValues != 0) {
            totalValue = totalValue + numberValues;
            System.out.println("Enter another number...");
            numberValues = numReader.nextInt();
        }
        if (numberValues == 0) {
            System.out.printf("The total sum of numbers is %d", totalValue);
        }
    }
}
