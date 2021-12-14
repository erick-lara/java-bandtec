package br.com.sptech.primeiraaplicacaospring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/frases")
public class FrasesController {

    @GetMapping("/hello-world")
    public String getFrase(){
        return "Ânimo galera, falta pouco....";
    }

    @GetMapping("/yoshi")
    public String getFrase2(){
        return "<img style='width: 1000px;' src = 'https://c.tenor.com/iEfTQjqMmkcAAAAM/yoshi-and-egg-yoshi.gif'>";
    }

    @GetMapping("/saudacao/{nome}")
    public String saudation(@PathVariable String nome){
        return "<h2>Olá " + nome + "</h2>";
    }

    @GetMapping("/{conta}/{numero1}/{numero2}")
    public String calculo(
            @PathVariable String conta,
            @PathVariable Integer numero1,
            @PathVariable Integer numero2
    ){
        String frase = "O resultado é : ";

        switch (conta){
            case "soma":
                return frase + (numero1 + numero2);
            case "multi":
                return frase + (numero1 * numero2);
            case "divi":
                return frase + (numero1 / numero2);
            default:
                return "Defina uma conta válida";
        }

    }

}
