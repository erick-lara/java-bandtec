/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.bandtec.projeto.poo.exercicios;

/**
 *
 * @author Aluno
 */
public class Empregado {
    private String name;
    private String role;
    private Double payment;

    public Empregado(String name, String role, Double payment) {
        this.name = name;
        this.role = role;
        this.payment = payment;
    }
    
    public Double readjust(Double adjust){
        return payment + payment * adjust / 100;
    }
}
