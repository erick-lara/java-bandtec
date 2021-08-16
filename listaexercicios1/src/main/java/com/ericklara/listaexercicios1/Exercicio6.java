package com.ericklara.listaexercicios1;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner numReader = new Scanner(System.in);

        Double productValue;
        Integer productQuantity;
        Double clientPayment;

        Double totalCashBack;

        System.out.println("Enter the product value:");
        productValue = numReader.nextDouble();

        System.out.println("Enter the product quantity:");
        productQuantity = numReader.nextInt();

        System.out.println("Enther the payment value:");
        clientPayment = numReader.nextDouble();

        totalCashBack = clientPayment - (productValue * productQuantity) ;

        if (clientPayment < productValue * productQuantity) {
            System.out.println("Insufficient money.");
        } else {
            System.out.printf("Your cashback will be R$%.2f", totalCashBack);
        }
    }
}
