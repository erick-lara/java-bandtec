package com.br.ericklara.projeto.nivelamento;

import java.util.Scanner;

public class LacoDeRepeticao {

    public static void main(String[] args) {
        //for convencional
        for (int i = 0; i < 10; i++) {
            System.out.println(String.format("Contador %d", i));
        }

        System.out.println("Exemplo 2");

        for (int i = 10; i > 0; i--) {
            System.out.println(String.format("Contador %d", i));
        }
        //for(;;){} - for infinito

        System.out.println("Exemplo 3 - while");
        Scanner leitorNum = new Scanner(System.in);

//        System.out.println("Digite 42");
//        Integer numeroDigitado = leitorNum.nextInt();
//
//        while (numeroDigitado != 42) {
//            System.out.println("Essa não é a resposta!");
//            numeroDigitado = leitorNum.nextInt();
//        }
//        System.out.println("Agora sim!!!");

        System.out.println("Exemplo 4 - 0 a 10 com while");

        Integer contador = 0;
        while (contador < 10) {
            System.out.println(String.format("Contador %d", contador));
            contador++;
        }

        Integer contadorInverso = 10;
        while (contadorInverso > 10) {
            System.out.println(String.format("Contador %d", contadorInverso));
            contadorInverso--;
        }
        
        Scanner leitorNum2 = new Scanner(System.in);
        Integer numeroDigitado2;

        do {            
            System.out.println("Digite um número");
            numeroDigitado2 = leitorNum2.nextInt();
        } while (numeroDigitado2 != 42);
    }
}
