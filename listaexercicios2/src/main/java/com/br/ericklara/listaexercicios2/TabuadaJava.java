package com.br.ericklara.listaexercicios2;

import java.util.Scanner;

public class TabuadaJava {
    public static void main(String[] args) {
        Scanner numReader = new Scanner(System.in);
        Integer selectedNumber;
        Integer multiResult;

        System.out.println("Enter the selected number: ");
        selectedNumber = numReader.nextInt();

        System.out.printf("Multiplication table of: %d%n", selectedNumber);
        for (int i = 0; i <= 10; i++){
            multiResult = selectedNumber * i;
            System.out.printf("%d X %d = %d%n",
                    selectedNumber,
                    i,
                    multiResult);
        }
        System.out.println("End of execution.");
    }
}
