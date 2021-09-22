package com.br.bandtec.projeto.poo.exercicios;

public class Termometro {
    private Double temperaturaAtual;
    private Double temperaturaMax;
    private Double temperaturaMin;

    public Termometro(Double temperaturaAtual, Double temperaturaMax, Double temperaturaMin) {
        this.temperaturaAtual = temperaturaAtual;
        this.temperaturaMax = temperaturaMax;
        this.temperaturaMin = temperaturaMin;
    }

    public Double getTemperaturaAtual() {
        return temperaturaAtual;
    }

    public void setTemperaturaAtual(Double temperaturaAtual) {
        this.temperaturaAtual = temperaturaAtual;
    }

    public void aumentarTemperatura(Double temperatura){
        temperaturaAtual += temperatura;
        if(temperaturaAtual > temperaturaMax){
            setTemperaturaAtual(temperaturaMax);
        }
        System.out.println(temperaturaAtual);
    }

    public void diminuirTemperatura(Double temperatura){
        temperaturaAtual -= temperatura;
        if(temperaturaAtual < temperaturaMin){
            setTemperaturaAtual(temperaturaMin);
        }
        System.out.println(temperaturaAtual);
    }

    public Double exibirFahreiheit(Double temperaturaAtual){
        return temperaturaAtual * 1.8 + 32;
    }

    //F = C x 1,8 + 32 calculo celcius para fahrenheit
}
