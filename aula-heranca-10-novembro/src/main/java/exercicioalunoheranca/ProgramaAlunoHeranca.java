package exercicioalunoheranca;

public class ProgramaAlunoHeranca {
    public static void main(String[] args) {
        Faculdade facul = new Faculdade(
                "Bandtec",
                3
        );

        Aluno al1 = new Aluno(
                1111,
                "Erick Lara",
                9.0,
                8.0
        );

        Aluno al2 = new AlunoPos(
                2222,
                "Graziela",
                10.0,
                9.0,
                9.0
        );

        System.out.println(al1);
        System.out.println(al2);

        facul.matricularAluno(al1);
        facul.matricularAluno(al2);

        facul.exibirAlunosMatriculados();

        System.out.println(facul);
    }
}
