package br.com.sptech.primeiraaplicacaospring.model;

public class PokemonModel {

    private String nome;
    private String tipo;

    public PokemonModel(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    public PokemonModel() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
