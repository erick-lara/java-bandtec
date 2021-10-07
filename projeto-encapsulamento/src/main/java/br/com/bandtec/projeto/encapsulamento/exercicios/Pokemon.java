/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.bandtec.projeto.encapsulamento.exercicios;

/**
 *
 * @author erick.penetta@VALEMOBI.CORP
 */
public class Pokemon {
    private String name;
    private String type;
    private Double strength;
    private Integer candy;

    public Pokemon(String name, String type, Double strength) {
        this.name = name;
        this.type = type;
        this.strength = strength;
        this.candy = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getStrength() {
        return strength;
    }

    public void setStrength(Double strength) {
        this.strength = strength;
    }

    public Integer getCandy() {
        return candy;
    }

    public void setCandy(Integer candy) {
        this.candy = candy;
    }

    @Override
    public String toString() {
        String status = String.format("Pokemon %s\nType %s\nStrength %.2f\nCandies %d\n",
                this.name,
                this.type,
                this.strength,
                this.candy
        );
        return status;    
    }
 
}
