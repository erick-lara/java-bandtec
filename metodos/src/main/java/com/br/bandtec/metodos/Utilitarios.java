package com.br.bandtec.metodos;

public class Utilitarios {
    
    void exibirNomeDecorado(){
        exibirLinha();
        exibirNome();
        exibirLinha();
    }
    
    void exibirLinha(){
        System.out.println("-------------------------------------------------");
    }
    
    void exibirNome(){
        System.out.printf("Meu nome é %s%n", "Erick");
    }
    
    
}
