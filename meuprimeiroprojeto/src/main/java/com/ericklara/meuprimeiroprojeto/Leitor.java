package com.ericklara.meuprimeiroprojeto;

import java.util.Scanner;

public class Leitor {
    public static void main(String[] args) {
        
        Scanner leitorString = new Scanner(System.in);
        Scanner leitorNum = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        
        String nome = leitorString.nextLine();
        
        System.out.println("\t Bem Vindo " + nome + "\n");
        
        System.out.println("Digite sua idade:");
        
        Integer idade = leitorNum.nextInt();
        
        System.out.println("\t Você tem " + idade + " anos" + "\n");
        
        System.out.println("Digite a faculdade em que você estuda:");
        
        String nomeFaculdade = leitorString.nextLine();
        
        System.out.println("\t A melhor faculdade de SP:" + nomeFaculdade + "\n");
        
        System.out.println("Digite seu salario pretendido:");
        
        Double salarioSonhos = leitorNum.nextDouble();
        
        System.out.println("\t Seu salário dos sonhos é:" + salarioSonhos + "\n");

    }
}
