package com.ericklara.listaexercicios1;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner numReader = new Scanner(System.in);

        Double paymentValue;
        Double discPercentage;

        Double paymentTotal;

        System.out.println("Enter your payment value: ");
        paymentValue = numReader.nextDouble();

        System.out.println("Enter your discount percentage");
        discPercentage = numReader.nextDouble();

        paymentTotal = paymentValue - (paymentValue * (discPercentage / 100));

        System.out.printf("Your total payment is %.2f", paymentTotal);
    }
}
