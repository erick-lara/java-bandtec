package exercicioalunoheranca;

public class Aluno {
    protected Integer ra;
    protected String nome;
    protected Double notaContinuada;
    protected Double notaSemestral;

    public Aluno(Integer ra, String nome, Double notaContinuada, Double notaSemestral) {
        this.ra = ra;
        this.nome = nome;
        this.notaContinuada = notaContinuada;
        this.notaSemestral = notaSemestral;
    }

    public Double calcularMedia(){
        return (this.notaContinuada * 0.4) + (this.notaSemestral * 0.6);
    }

    @Override
    public String toString() {
        return String.format(
                "%nNome - %s%nRA - %d%nMédia do Semestre - %.2f%nNota A.C. - %.2f%nNota Semestral - %.2f%n",
                this.nome,
                this.ra,
                calcularMedia(),
                this.notaContinuada,
                this.notaSemestral
        );
    }
}
