package exercicioalunoheranca;

public class AlunoPos extends Aluno{
    private Double notaMonografia;

    public AlunoPos(
            Integer ra,
            String nome,
            Double notaContinuada,
            Double notaSemestral,
            Double notaMonografia
    ) {
        super(ra, nome, notaContinuada, notaSemestral);
        this.notaMonografia = notaMonografia;
    }

    public Double calcularMedia(){
        return (super.notaContinuada + super.notaSemestral + notaContinuada) / 3;
    }

    @Override
    public String toString() {
        return String.format(
                "%s%nNota da Monografia - %.2f%n",
                super.toString(),
                this.notaMonografia
        );
    }
}
