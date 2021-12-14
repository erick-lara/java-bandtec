package br.com.sptech.primeiraaplicacaospring.controller;

import br.com.sptech.primeiraaplicacaospring.model.PokemonModel;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/pokemon")
public class PokemonController {

    List<PokemonModel> pokemonModels = new ArrayList<>();

    @GetMapping("/get-default")
    public PokemonModel getPokemonDefault(){
        PokemonModel pokemon = new PokemonModel(
                "Pikachu",
                "Elétrico"
        );

        return pokemon;
    }

    @GetMapping("/get-all")
    public List<PokemonModel> getAll(){

        return pokemonModels;
    }

    @PostMapping("/add")
    public void addPokemon(@RequestBody PokemonModel pokemonModel){
        pokemonModels.add(pokemonModel);
    }
}
