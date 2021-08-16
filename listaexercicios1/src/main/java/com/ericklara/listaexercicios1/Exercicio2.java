package com.ericklara.listaexercicios1;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner numReader = new Scanner(System.in);

        Double childValue;
        Double youngValue;
        Double adultValue;
        Double assistanceValue;
        Integer sonNumber;

        System.out.println("Quantos filhos de 0 a 3 anos você tem?");
        Integer childSon = numReader.nextInt();

        System.out.println("Quantos filhos de 4 a 16 anos você tem?");
        Integer youngSon = numReader.nextInt();

        System.out.println("Quantos filhos de 17 a 18 anos você tem?");
        Integer adultSon = numReader.nextInt();

        childValue = childSon * 25.12;
        youngValue = youngSon * 15.88;
        adultValue = adultSon * 12.44;
        assistanceValue = childValue + youngValue + adultValue;
        sonNumber = childSon + youngSon + adultSon;

        System.out.printf(
                "Você tem um total de %s filhos, e vai receber uma bolsa de R$%.2f",
                sonNumber,
                assistanceValue
        );

    }
}
