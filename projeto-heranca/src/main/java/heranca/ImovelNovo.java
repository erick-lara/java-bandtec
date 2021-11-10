package heranca;

public class ImovelNovo extends Imovel{

    public ImovelNovo(Double preco, String endereco) {
        super(preco, endereco);
    }

    public Double getPrecoVenda(){
        Double acrescimo = super.getPrecoVenda() * 0.10;
        return super.getPrecoVenda() + acrescimo;
    }

    @Override
    public String toString() {
        return String.format(
                "Imovel Novo%n-Preço: %.2f%n-Endereço: %s%n",
                this.getPrecoVenda(),
                super.endereco
        );
    }
}
