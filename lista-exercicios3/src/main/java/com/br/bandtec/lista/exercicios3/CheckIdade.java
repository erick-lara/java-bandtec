package com.br.bandtec.lista.exercicios3;

public class CheckIdade {
    
    public void classificaIdade(Integer age){
        if(age > 0 && age <= 2){
            System.out.println("0 a 2 anos - Bebê");
        } else if (age >= 3 && age <= 11){
            System.out.println("3 a 11 anos - Criança");
        } else if (age >= 12 && age <= 19){
            System.out.println("12 a 19 anos - Adolescente");
        } else if (age >= 20 && age <= 30) {
            System.out.println("20 a 30 anos - Jovem");
        } else if (age >= 31 && age <= 60) {
            System.out.println("31 a 60 anos - Adulto");
        } else if (age > 60) {
            System.out.println("acima de 60 anos - Idoso");
        }
    }
}
