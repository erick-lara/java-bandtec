package com.br.bandtec.lista.exercicios3;

public class ClassesSociais {
    
    Double minPayment = 1100.00;
    
    public String checkSocialClass(Double salary){
        String socialClass = "";
        
        if(salary <= 2090){
            socialClass = "Class E";
        } else if (salary <= 4180 && salary > 2090){
            socialClass = "Class D";
        } else if (salary <= 10450 && salary > 4180){
            socialClass = "Class C";
        } else if (salary <= 20900 && salary > 10450){
            socialClass = "Class B";
        } else if (salary < 20900){
            socialClass = "Class A";
        }
        
        return socialClass;
    }
    
    public Double checkPayment(Double salary){
        return salary / minPayment;
    }
}
