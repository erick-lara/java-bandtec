/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ericklara.meuprimeiroprojeto;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Desafio {
    public static void main(String[] args) {
        Scanner leitorNum = new Scanner(System.in);
        
        System.out.println("Digite quanto você ainda tem no bilhete unico:");
        
        Double saldo = leitorNum.nextDouble();
        
        Double passagemRestante = saldo / 4.40;
        Integer passagem = passagemRestante.intValue();
        System.out.println("Você ainda pode usar o bilhete " + passagem
        + " vezes");
    }
}
