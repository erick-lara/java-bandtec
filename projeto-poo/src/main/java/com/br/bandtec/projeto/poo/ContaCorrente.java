package com.br.bandtec.projeto.poo;

public class ContaCorrente {
    private String nome;
    private Double saldo;
    
    public ContaCorrente(String nome, Double saldo){
        this.nome = nome;
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
    
    public void depositar(Double depositValue){
        System.out.println("saldo antes : " + saldo);
        saldo += depositValue;
        System.out.println("saldo dps : " + saldo);
        
    }
    
    public void sacar(Double exctractValue){
        System.out.println("saldo antes : " + saldo);
        saldo -= exctractValue;
        System.out.println("saldo dps : " + saldo);
    }

    @Override
    public String toString() {
        return "Nome = " + getNome() + "\n" +
                "Saldo = " + getSaldo();
    }
    
    
}
