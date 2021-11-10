package desafioHeranca;

import java.util.ArrayList;
import java.util.List;

public class Departamento {
    private String nomeDepartamento;
    private List<VendedorComissao> vendedores;

    public Departamento(String nomeDepartamento) {
        this.nomeDepartamento = nomeDepartamento;
        this.vendedores = new ArrayList<>();
    }

    public void adicionarVendedor(VendedorComissao vendedor){
        vendedores.add(vendedor);
    }

    public void exibirTodos(){
        for(VendedorComissao vendedor : vendedores){
            System.out.println(vendedor);
        }
    }

    public Double calcularTotalSalario(){
        Double totalSalario = 0.0;
        for(VendedorComissao vendedor: vendedores){
            totalSalario += vendedor.calcularSalario();
        }
        return totalSalario;
    }
}
