package br.com.bandtec.erick.lara.c2;

public class TesteConcessionaria {
    public static void main(String[] args) {
        Veiculo veic1 = new Veiculo(1, "Monza");
        Veiculo veic2 = new Veiculo(2, "Fusion");
        
        Concessionaria conc = new Concessionaria("Carros 2");
        
        System.out.println("Exiba as informações dos Veiculos.\n");
        
        System.out.println(veic1.toString());
        System.out.println(veic2.toString());
        
        System.out.println("Realize a venda do primeiro veículo.\n");
        conc.realizarVenda(veic1, 1500.0);
        
        System.out.println("Cadastre estoque para os dois veiculos\n");
        conc.cadastrarEstoque(veic1, 5);
        conc.cadastrarEstoque(veic2, 10);
        
        System.out.println("Realize a venda do primeiro veiculo\n");
        conc.realizarVenda(veic1, 2450.0);
        
        System.out.println("Realize a venda do segundo veiculo com desconto\n");
        conc.realizarVenda(veic2, 1000.0, 20.0);
        
        System.out.println("Exiba novamente as informações dos veiculos.\n");
        System.out.println(veic1.toString());
        System.out.println(veic2.toString());
        
        System.out.println("Exiba as informações da concessionaria\n");
        System.out.println(conc.toString());
    }
}

