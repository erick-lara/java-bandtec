package desafioHeranca;

public class VendedorComissao {
    protected Integer codigo;
    protected String nome;
    protected Double vendas;
    protected Double taxa;

    public VendedorComissao(Integer codigo, String nome, Double vendas, Double taxa) {
        this.codigo = codigo;
        this.nome = nome;
        this.vendas = vendas;
        this.taxa = taxa;
    }

    public Double calcularSalario(){
        return vendas * taxa;
    }

    @Override
    public String toString() {
        return String.format(
                "Código - %d%nNome - %s%nVendas - %.2f%nTaxa - %.2f%nSalário - %.2f%n",
                this.codigo,
                this.nome,
                this.vendas,
                this.taxa,
                this.calcularSalario()
        );
    }
}
