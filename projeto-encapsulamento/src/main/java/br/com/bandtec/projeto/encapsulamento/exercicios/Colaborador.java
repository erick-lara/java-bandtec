/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.bandtec.projeto.encapsulamento.exercicios;

/**
 *
 * @author erick.penetta@VALEMOBI.CORP
 */
public class Colaborador {
    private String name;
    private String job;
    private Double payment;

    public Colaborador(String name, String job, Double payment) {
        this.name = name;
        this.job = job;
        this.payment = payment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Double getPayment() {
        return payment;
    }

    public void setPayment(Double payment) {
        this.payment = payment;
    }
    
    @Override
    public String toString() {
        return "Nome: " + name + ", Cargo: " + job + ", Salário: " + payment + "\n";
    }
    
}
