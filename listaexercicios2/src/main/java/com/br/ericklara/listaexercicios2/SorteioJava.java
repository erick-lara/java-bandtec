package com.br.ericklara.listaexercicios2;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class SorteioJava {
    public static void main(String[] args) {
        Scanner numReader = new Scanner(System.in);
        Integer luckyNumber;
        Integer randomNumber;

        Integer oddNumber = 0;
        Integer evenNumber = 0;

        Integer appearNumber = 0;
        Integer appearCount = 0;

        System.out.println("Enter a number between 1 and 100");
        luckyNumber = numReader.nextInt();

        while (luckyNumber < 1 || luckyNumber > 100){
            System.out.println("Enter a valid number.");
            luckyNumber = numReader.nextInt();
        }

        for(int i = 0; i < 200; i++){
            randomNumber = ThreadLocalRandom.current().nextInt(1,100);
            System.out.printf("%dth Number is - %d%n", i + 1, randomNumber);

            if (randomNumber % 2 != 0){
                oddNumber++;
            } else {
                evenNumber++;
            }

            while (randomNumber == luckyNumber && appearNumber == 0){
                appearNumber++;
            }
            if (appearNumber == 0){
                appearCount++;
            }

        }

        System.out.printf("%d Odd numbers were drawn and %d even numbers were drawn",
                oddNumber,
                evenNumber);
        if ( appearNumber == 1) {
            System.out.printf("Your number appeared in the %dth position!%n", appearCount + 1);
        }
    }
}
