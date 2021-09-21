package com.br.bandtec.projeto.poo;

public class TesteApplication {
    public static void main(String[] args) {
        
        ContaCorrente conta1 = new ContaCorrente("Erick", 500.00);
        ContaCorrente conta2 = new ContaCorrente("Gabriel Santos", 25.00);

        System.out.println(conta1.toString());
        
        System.out.println(conta2.toString());
      
        conta1.depositar(60.0);
        conta2.depositar(10.0);
        
        conta1.sacar(20.00);
        
    }
}
