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
    private String nome;
    private String cargo;
    private Double salario;

    public Empregado(String nome, String cargo, Double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }
    
    public Double reajuste(Double adjust){
        return salario + salario * adjust / 100;
    }
}
