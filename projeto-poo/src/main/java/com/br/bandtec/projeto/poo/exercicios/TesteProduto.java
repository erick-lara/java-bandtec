package com.br.bandtec.projeto.poo.exercicios;

public class TesteProduto {
    public static void main(String[] args) {
        Encomenda encomenda = new Encomenda(
                "P",
                "Rua madeira, 772",
                "Rua Haddock Lobo, 595",
                100.0,
                25.0
        );

        Encomenda encomenda2 = new Encomenda(
                "M",
                "Rua madeira, 772",
                "Rua Haddock Lobo, 595",
                250.0,
                30.0
        );

        System.out.println(encomenda.emitirEtiqueta());

        System.out.println(encomenda2.emitirEtiqueta());
    }
}
