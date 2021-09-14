package com.br.bandtec.lista.exercicios3;

import java.util.Scanner;

public class SocialClassApp {
    public static void main(String[] args) {
        Scanner numReader = new Scanner(System.in);
        ClassesSociais social = new ClassesSociais();
        
        Double salary;
        
        System.out.println("Enter your salary.");
        salary = numReader.nextDouble();
        
        System.out.printf("you get approximately %.2f minimum wages%n",
                social.checkPayment(salary)
        );
        
        System.out.printf("you belong to social class: %s",
                social.checkSocialClass(salary)
        );
    }
}
