package com.br.ericklara.listaexercicios2;

import java.util.Scanner;

public class Authentication {

    public static void main(String[] args) {
        Scanner stringReader = new Scanner(System.in);

        String username;
        String password;

        System.out.println("Insert the username:");
        username = stringReader.nextLine();

        System.out.println("Insert the password:");
        password = stringReader.nextLine();

        while (!"admin".equals(username) && !"#Bandtec".equals(password)) {
            System.out.println("Invalid login/password.");

            System.out.println("Enter your username again.");
            username = stringReader.nextLine();

            System.out.println("Enter your password again.");
            password = stringReader.nextLine();
        }
        System.out.println("Login successful! Welcome " + username + "!");

    }
}
