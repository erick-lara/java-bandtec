package exercicioprofessorheranca;

public class App {
    public static void main(String[] args) {
        Professor prof1 = new Professor(
                111,
                "Leonardo",
                20,
                50.0
        );

        Professor prof3 = new Professor(
                222,
                "Roger",
                20,
                50.0
        );

        Professor prof2 = new Coordenador(
                222,
                "Gerson",
                20,
                100.0,
                20,
                120.0,
                "ADS"
        );

        Faculdade facul = new Faculdade(
                "BandTec",
                2
        );

        System.out.println(prof1);
        System.out.println(prof2);

        facul.contratarProfessor(prof1);
        facul.contratarProfessor(prof2);
        facul.contratarProfessor(prof3);

        facul.exibirProfessores();
    }
}
