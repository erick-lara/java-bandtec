package com.br.bandtec.projeto.poo.exercicios;

public class TesteTermometro {
    public static void main(String[] args) {
        Termometro termometro = new Termometro(20.0,39.0,12.0);

        termometro.aumentarTemperatura(5.0);

        termometro.diminuirTemperatura(20.0);

        System.out.println(termometro.exibirFahreiheit(termometro.getTemperaturaAtual()) + "Fº");
    }
}
