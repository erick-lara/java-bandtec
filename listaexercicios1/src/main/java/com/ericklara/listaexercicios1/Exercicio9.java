package com.ericklara.listaexercicios1;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner stringReader = new Scanner(System.in);
        Scanner numReader = new Scanner(System.in);

        String userName;
        Double firstGrade;
        Double secondGrade;
        Double averageGrade;

        System.out.println("Enter Your name:");
        userName = stringReader.nextLine();

        System.out.println("Enter your first grade: ");
        firstGrade = numReader.nextDouble();

        System.out.println("Enter your second grade: ");
        secondGrade = numReader.nextDouble();

        averageGrade = (firstGrade + secondGrade) / 2;

        System.out.printf("Hello %s ! Your average grade was %.1f !!!",
                userName,
                averageGrade);
    }
}
