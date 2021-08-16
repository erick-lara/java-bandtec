package com.ericklara.listaexercicios1;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner leitorNum = new Scanner(System.in);
        
        System.out.println("Insira o valor do primeiro número: ");
        Double primeiroNumero = leitorNum.nextDouble();
        
        System.out.println("Insira o valor do segundo número: ");
        Double segundoNumero = leitorNum.nextDouble();
        
        Double somaNumero = primeiroNumero + segundoNumero;
        Double subtracaoNumero = primeiroNumero - segundoNumero;
        Double divisaoNumero = primeiroNumero / segundoNumero;
        Double multiNumero = primeiroNumero * segundoNumero;
        
        if(segundoNumero != 0 || primeiroNumero != 0){
        String frase = String.format(
                    "A soma destes numeros é %.0f\n"
                    + "A subtração destes numeros é %.0f\n"
                    + "A divisão destes numeros é %.2f\n"
                    + "A multiplicação destes numeros é %.0f", 
                somaNumero,
                subtracaoNumero,
                divisaoNumero,
                multiNumero);
        
        System.out.println(frase);
        } else {
            String frase = String.format(
                    "A soma destes numeros é %.0f\n"
                    + "A subtração destes numeros é %.0f\n"
                    + "Essa divisão é impossível, não é possível dividir por 0\n"
                    + "A multiplicação destes numeros é %.0f", 
                somaNumero,
                subtracaoNumero,
                multiNumero);
            System.out.println(frase);
        }
    }
}
