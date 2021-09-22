package com.br.bandtec.projeto.poo.exercicios;

public class Bolo {
    
    String flavor;
    Double value;
    Integer sellQuantity = 0;

    public Bolo(String flavor, Double value) {
        this.flavor = flavor;
        this.value = value;
    }

    public String displayReport() {
        return "O Bolo de " + flavor + " foi comprado " + sellQuantity + 
                " vezes, totalizando R$ " + sellQuantity * value;
    }

    public void setQuantity(Integer sellQuantity) {
        this.sellQuantity = sellQuantity;
    }
    
    void buyCake(Integer quantity){
        if(sellQuantity + quantity > 100){
            System.out.println("Seu pedido ultrapassou nosso limite diário para esse bolo.");
        }else {
            setQuantity(quantity + sellQuantity);
            System.out.println("Foram comprados " + quantity + " bolos de " + this.flavor);
        }
        
    }
    
}
