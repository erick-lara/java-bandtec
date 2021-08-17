package com.br.ericklara.projeto.nivelamento;

import java.util.Scanner;

public class NovoOperador {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o ranking (1, 2 e 3)");
        Integer ranking = leitor.nextInt();
        
        switch(ranking){
            case 1:
                System.out.println("Você ganhou um macbook PRO");
            case 2:
                System.out.println("Você ganhou um IPhone 12");
            case 3:
                System.out.println("Você ganhou uma viagem pra floripa;");
                break;
            default:
                System.out.println("O que vale é a intenção");
                break;
        }
    }
}
