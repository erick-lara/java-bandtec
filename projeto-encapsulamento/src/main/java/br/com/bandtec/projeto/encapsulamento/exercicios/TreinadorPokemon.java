/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.bandtec.projeto.encapsulamento.exercicios;

/**
 *
 * @author erick.penetta@VALEMOBI.CORP
 */
public class TreinadorPokemon {    
    private String name;
    private Integer level;
    
    public TreinadorPokemon(String name) {
        this.name = name;
        this.level = 0;
    }
    
    public void trainPokemon(Pokemon pokemon){
        Double str = pokemon.getStrength();
        Integer candy = pokemon.getCandy();
        
        pokemon.setStrength(str += str * 0.10);
        pokemon.setCandy(candy + 10);
        this.level += 2;
    }
    
    public void evolvePokemon(Pokemon pokemon, String nameEvolution){
        String atualName = pokemon.getName();
        Integer candy = pokemon.getCandy();
        
        if(candy >= 50){
            pokemon.setName(nameEvolution);
            pokemon.setCandy(candy - 50);
            this.level += 10;
            System.out.printf("Pokemón %s evolved into pokemón %s\n", 
                    atualName,
                    nameEvolution
            );  
        } else {
            System.out.println("Unable to perform the operation\n");
        }
    }

    @Override
    public String toString() {
        String status = String.format("Trainer %s, level %d .",
                this.name,
                this.level
        );
        return status;
    }
    
    
}
