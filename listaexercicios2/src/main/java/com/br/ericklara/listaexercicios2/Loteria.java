package com.br.ericklara.listaexercicios2;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Loteria {

    public static void main(String[] args) {
        Scanner numReader = new Scanner(System.in);
        Integer randomNumber = ThreadLocalRandom.current().nextInt(1, 11);
        Integer luckyNumber;
        Integer rounds = 0;

        System.out.println("Enter your lucky number between 1 and 10!");
        luckyNumber = numReader.nextInt();

        while (luckyNumber < 0 || luckyNumber > 10) {
            System.out.println("Enter a valid number.");
            luckyNumber = numReader.nextInt();
        }
        while (luckyNumber != randomNumber) {
            System.out.printf("You choose the number '%d', and the random number is '%d'\n",
                    luckyNumber,
                    randomNumber);
            rounds++;
            System.out.println("Enter another number: ");
            luckyNumber = numReader.nextInt();

            while (luckyNumber < 0 || luckyNumber > 10) {
                System.out.println("Enter a valid number.");
                luckyNumber = numReader.nextInt();
            }
        }
        if (rounds > 0 && rounds < 4) {
            System.out.printf("You choose the number '%d', and the random number is '%d'\n",
                    luckyNumber,
                    randomNumber);
            System.out.println("You're very lucky!");
        } else if (rounds > 4 && rounds < 10) {
            System.out.printf("You choose the number '%d', and the random number is '%d'\n",
                    luckyNumber,
                    randomNumber);
            System.out.println("You're lucky!");
        } else {
            System.out.printf("You choose the number '%d', and the random number is '%d'\n",
                    luckyNumber,
                    randomNumber);
            System.out.println("It's better stop playin...");
        }

    }
}
