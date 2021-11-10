package desafioHeranca;

public class VendedorComissaoMaisFixo extends VendedorComissao{
    private Double salarioFixo;

    public VendedorComissaoMaisFixo(Integer codigo, String nome, Double vendas, Double taxa, Double salarioFixo) {
        super(codigo, nome, vendas, taxa);
        this.salarioFixo = salarioFixo;
    }

    public Double calcularSalario(){
        return super.calcularSalario() + salarioFixo;
    }

    @Override
    public String toString() {
        return String.format(
                "%sSalário Fixo - %.2f%n",
                super.toString(),
                this.salarioFixo
        );
    }
}
