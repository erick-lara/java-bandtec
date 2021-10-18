package br.com.bandtec.erick.lara.c2;

public class Veiculo {
    private Integer id;
    private String modelo;
    private Integer quantidadeEstoque;
    private Double valorVenda;

    public Veiculo(Integer id, String modelo) {
        this.id = id;
        this.modelo = modelo;
        this.quantidadeEstoque = 0;
        this.valorVenda = 0.0;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(Integer quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public Double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(Double valorVenda) {
        this.valorVenda = valorVenda;
    }

    @Override
    public String toString() {
        String fraseFormatada = String.format(
                "ID: %d\nModelo: %s\nQuantidade em estoque: %d\nValor tabela: %.2f\n",
                    this.id,
                    this.modelo,
                    this.quantidadeEstoque,
                    this.valorVenda
        );
        
        return fraseFormatada;
    }
    
}
