package com.ericklara.listaexercicios1;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner stringReader = new Scanner(System.in);
        Scanner numReader = new Scanner(System.in);

        String username;
        Integer birthYear;
        Integer ageSum;

        System.out.println("Enter your name: ");
        username = stringReader.next();

        System.out.printf("Hello %s! What year were you born?\n",
                username);
        birthYear = numReader.nextInt();
        
        ageSum = 2030 - birthYear;

        System.out.printf("In 2030 you will be %d years old!",
                ageSum);
    }
}
