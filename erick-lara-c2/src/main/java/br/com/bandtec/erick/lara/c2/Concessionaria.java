package br.com.bandtec.erick.lara.c2;

public class Concessionaria {
    private String nome;
    private Integer quantidadeVeiculosVendidos;
    private Integer quantidadeDescontosAplicados;

    public Concessionaria(String nome) {
        this.nome = nome;
        this.quantidadeVeiculosVendidos = 0;
        this.quantidadeDescontosAplicados = 0;
    }
    
    public void realizarVenda(Veiculo veiculo, Double valorVenda){
        
        Integer veiculoEmEstoque = veiculo.getQuantidadeEstoque();
        
        if(veiculoEmEstoque > 0 && valorVenda > 0){
            
            veiculo.setValorVenda(valorVenda);
            veiculo.setQuantidadeEstoque(veiculoEmEstoque - 1);
            
            this.quantidadeVeiculosVendidos += 1;
            System.out.println("Realizando venda sem desconto:");
            System.out.println(veiculo.toString());
            
        } else {
            System.out.println("Operação inválida\n");
        }
    }
    
    public void realizarVenda(
            Veiculo veiculo, 
            Double valorVenda, 
            Double valorBonus
    ){
        
        Integer veiculoEmEstoque = veiculo.getQuantidadeEstoque();
        Double porcentagemDesconto = valorBonus / 100;
        Double totalDesconto = valorVenda - valorVenda * porcentagemDesconto;
        
        if(veiculoEmEstoque > 0 && valorVenda > 0 && valorBonus > 0){
            veiculo.setValorVenda(totalDesconto);
            
            veiculo.setQuantidadeEstoque(veiculoEmEstoque - 1);
            this.quantidadeVeiculosVendidos += 1;
            this.quantidadeDescontosAplicados += 1;
            
            System.out.println("Realizando venda com desconto:");
            System.out.println(veiculo.toString());
            System.out.println("------------------------------\n");
            System.out.printf("Valor da venda: R$ %.2f\nValor do desconto: %.0f %% -> R$ %.2f\n",
                        valorVenda,
                        valorBonus,
                        valorVenda * porcentagemDesconto
                    );      
            System.out.println("------------------------------\n");
            System.out.printf("Valor final: %.2f\n",
                    veiculo.getValorVenda()
            );
        } else {
            System.out.println("Operação inválida\n");
        }
    }
    
    public void cadastrarEstoque(Veiculo veiculo, Integer quantidadeEstoque){
        
        Integer veiculoEmEstoque = veiculo.getQuantidadeEstoque();
        veiculo.setQuantidadeEstoque(veiculoEmEstoque + quantidadeEstoque);
        
        System.out.printf("O estoque do carro %s foi alterado\n",
                veiculo.getModelo()
        );
    }

    @Override
    public String toString() {
        String fraseFormatada = String.format("Concessionária: %s\n"
                + "Quantidade de vendas: %d\n"
                + "Descontos aplicados: %d\n", 
                this.nome,
                this.quantidadeVeiculosVendidos,
                this.quantidadeDescontosAplicados
        );
        
        return fraseFormatada;
    }
    
    
}
