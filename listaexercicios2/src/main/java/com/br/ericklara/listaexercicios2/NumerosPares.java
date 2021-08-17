package com.br.ericklara.listaexercicios2;

public class NumerosPares {
    public static void main(String[] args) {
        Integer i = 0;
        while(i < 41){
            if(i % 2 == 0){
                System.out.println("Even number : " + i);
            }
            i++;
        }
    }
}
