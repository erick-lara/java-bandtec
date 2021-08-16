package com.ericklara.listaexercicios1;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner numRead = new Scanner(System.in);

        Double brutePayment;
        Double discountINSS;
        Double discountIR;
        Double discountVT;
        Double totalVT;
        Double totalDiscounts;
        Double totalPayment;

        System.out.println("Enter your brute payment value: ");
        brutePayment = numRead.nextDouble();

        System.out.println("Enter the value of your transport to the work:");
        discountVT = numRead.nextDouble();

        discountINSS =(brutePayment * 0.10);

        discountIR = (brutePayment * 0.20);

        totalVT = (discountVT * 2 * 22);

        totalDiscounts =  totalVT + discountINSS + discountIR;

        totalPayment = brutePayment - totalDiscounts;

        System.out.printf(
                "Your brute payment is R$%.2f, with a total of R$%.2f discounts and a liquid total of %.2f",
                brutePayment,
                totalDiscounts,
                totalPayment);
    }
}
