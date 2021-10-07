package br.com.bandtec.projeto.encapsulamento.exercicios;

public class TestePokemon {
    public static void main(String[] args) {
        Pokemon poke1 = new Pokemon("Pikachu", "Eletric", 20.0);
        Pokemon poke2 = new Pokemon("Charmander", "Fire", 23.0);
        TreinadorPokemon ash = new TreinadorPokemon("Ash Ketchum");
        
        for(int i = 0; i < 5; i++){
            ash.trainPokemon(poke1);
        }
        
        System.out.println(poke1.toString());
        ash.evolvePokemon(poke1, "Raichu");
        System.out.println(poke1.toString());
        
        for(int i = 0; i < 2; i++){
            ash.trainPokemon(poke2);
        }
        
        System.out.println(poke2.toString());
        ash.evolvePokemon(poke2, "Chameleon");
        
        System.out.println(ash.toString());
    }
}
