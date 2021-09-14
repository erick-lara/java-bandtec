package com.br.bandtec.metodos;

public class Calculadora {
    
    Integer soma(Integer numA, Integer numB){
        return numA + numB;
    }
    
    Boolean isPar(Integer numA){
        return numA % 2 == 0;
    }
    
    Integer soma(Integer numA, Integer numB, Integer numC){
        return numA + numB + numC;
    }
    
    void subtrair(Integer numA, Integer numB){
        System.out.printf("Resultado: %d%n", numA - numB);
    }
    
    void multiplicar(Integer numA, Integer numB){
        System.out.printf("Resultado: %d%n", numA * numB);
    }
    
    void divisao(Integer numA, Integer numB){
        
        System.out.printf("Resultado: %d%n", numA / numB);
    }
    
//    void potencia(Integer numA, Integer numB){
//        Double totalBase = 0;
//        for(int i = 0; i < numB; i++){
//            
//        }
//    }
}
