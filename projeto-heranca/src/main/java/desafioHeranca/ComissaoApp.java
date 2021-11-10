package desafioHeranca;

public class ComissaoApp {
    public static void main(String[] args) {

        VendedorComissao teste1 = new VendedorComissao(
                1,
                "Vampeta",
                2000.00,
                0.25
        );

        VendedorComissaoMaisFixo teste2 = new VendedorComissaoMaisFixo(
                2,
                "Kleber",
                5000.00,
                0.5,
                1500.00
        );

        VendedorComissao teste3 = new VendedorComissao(
                3,
                "Carlos",
                12000.00,
                0.5
        );

        Departamento dept = new Departamento("Departamento do balaco baco");

        dept.adicionarVendedor(teste1);
        dept.adicionarVendedor(teste2);
        dept.adicionarVendedor(teste3);

        dept.exibirTodos();

        System.out.println(dept.calcularTotalSalario());
    }
}
