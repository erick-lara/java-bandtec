package com.ericklara.meuprimeiroprojeto;

public class Tipos {
    public static void main(String[] args) {
        
        String nome = "Erick";
        String sobrenome = "Lara";
        String nomeCompleto = nome + " " + sobrenome;
        String faculdade = "Bandtec";
        String cidadeNatal = "São Caetano";
        System.out.println(
                nomeCompleto + 
                " estuda na faculdade " + 
                faculdade + 
                " e nasceu em " + 
                cidadeNatal
        );
        
        Integer numero1 = 42;
        
        System.out.println(numero1);
        
        Double valor = 10.0;
        
        Boolean isAlive = true;
        Boolean isHappy = false;
    }
}
