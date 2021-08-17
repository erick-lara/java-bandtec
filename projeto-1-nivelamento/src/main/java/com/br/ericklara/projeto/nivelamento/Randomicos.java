package com.br.ericklara.projeto.nivelamento;

import java.util.concurrent.ThreadLocalRandom;

public class Randomicos {
        
    public static void main(String[] args) {
       
//        Maneiras de executar um metodo aleatorio.

//        Random random = new Random();
//        random.nextInt(10);
//        Math.random();

        Integer numeroInteiroGerado = 
                ThreadLocalRandom.current().nextInt(0, 21);
        
        System.out.println("Numero gerado: " + numeroInteiroGerado);
        
        Integer bigNumber = Integer.MAX_VALUE;
        Integer smallNumber = Integer.MIN_VALUE;
        
    }
    
}
