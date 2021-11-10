package heranca;

public class Imovel {
    protected Double preco;
    protected String endereco;

    public Imovel(Double preco, String endereco) {
        this.preco = preco;
        this.endereco = endereco;
    }

    public Double getPrecoVenda() {
        return preco;
    }

}
