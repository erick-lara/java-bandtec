/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.bandtec.projeto.encapsulamento.exercicios;

/**
 *
 * @author erick.penetta@VALEMOBI.CORP
 */
public class TesteColaborador {
    public static void main(String[] args) {
        Colaborador colaborador1 = new Colaborador("Erick", "Analista", 1500.0);
        Colaborador colaborador2 = new Colaborador("Diego", "Professor", 4000.0);
        
        RecursosHumanos recursos = new RecursosHumanos();
        
        System.out.println(colaborador1.toString());
        System.out.println(colaborador2.toString());
        
        recursos.validatePromotion(colaborador1, "DevOps", 0.05);
        recursos.validatePromotion(colaborador2, "Analista", 1.15);
  
        System.out.println(colaborador1.toString());
        System.out.println(colaborador2.toString());
        
        System.out.println("Salários ajustados : " + recursos.getAdjusted());
        System.out.println("Funcionários promovidos : " + recursos.getPromoted());

    }
}
