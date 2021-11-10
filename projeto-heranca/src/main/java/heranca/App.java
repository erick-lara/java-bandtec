package heranca;

public class App {
    public static void main(String[] args) {
        ImovelUsado teste1 = new ImovelUsado(200.00, "teste alameda");
        ImovelNovo teste2 = new ImovelNovo(400.00, "teste rua");

        System.out.println(teste1);
        System.out.println(teste2);

    }
}
