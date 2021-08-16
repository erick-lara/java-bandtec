package com.ericklara.listaexercicios1;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner stringReader = new Scanner(System.in);
        Scanner numReader = new Scanner(System.in);

        String loginInsert;
        String passInsert;
        Integer errorInsert;

        System.out.println("Insert your username: ");
        loginInsert = stringReader.nextLine();

        System.out.println("Insert your password: ");
        passInsert = stringReader.nextLine();

        System.out.println("Insert how many times you can type your password wrong: ");

        errorInsert = numReader.nextInt();

        System.out.println("Your username is " +
                loginInsert +
                ", your password is " +
                passInsert +
                ". You can type your password wrong " +
                errorInsert +
                " times.");
    }
}
