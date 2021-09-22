package com.br.bandtec.projeto.poo.exercicios;

public class TesteApplication {
    public static void main(String[] args) {
        Empregado empregado1 = new Empregado("João", "Analista de Sistemas", 5400.00);
        Empregado empregado2 = new Empregado("Erick", "Desenvolvedor", 2000.00);
        
        System.out.println(empregado1.readjust(15.0));
        
        System.out.println(empregado2.readjust(10.0));

    }
}
