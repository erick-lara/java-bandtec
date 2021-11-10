package heranca;

public class ImovelUsado extends Imovel{

    public ImovelUsado(Double preco, String endereco) {
        super(preco, endereco);
    }

    public Double getPrecoVenda() {
        Double desconto = super.getPrecoVenda() * 0.10;
        return super.getPrecoVenda() - desconto;
    }

    @Override
    public String toString() {
        return String.format(
                "Imovel Usado%n-Preço: %.2f%n-Endereço: %s%n",
                this.getPrecoVenda(),
                super.endereco
        );
    }
}
