package com.br.ericklara.projeto.nivelamento;

public class NovaCondicao {
    
    public static void main(String[] args) {
        
        String nome = "Erick";
        Boolean isProfessor = false;
        
        System.out.println(String.format("Nome: %s\nÉ professor: %s",
                nome, (isProfessor ? "Sim" : "Não")));
        
    }
}
