package desafioHeranca;

public class ComissaoApp {
    public static void main(String[] args) {

        VendedorComissao teste1 = new VendedorComissao(
                1,
                "Vampeta",
                2000.00,
                0.25
        );

        VendedorComissao teste2 = new VendedorComissaoMaisFixo(
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

        System.out.printf(
                "Total a ser pago: R$%.2f%n",
                dept.calcularTotalSalario()
        );

        dept.exibeFixo();
    }
}
