package com.br.ericklara.listaexercicios2;

public class ContadorVariado {
    public static void main(String[] args) {
        Double count = 0.0;
        Double sum = 0.15;
        for (int i = 0; count < 4.95; i++){
            count += sum;
            System.out.printf("%.2f%n", count);
        }
    }
}
