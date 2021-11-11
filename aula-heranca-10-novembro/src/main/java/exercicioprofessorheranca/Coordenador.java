package exercicioprofessorheranca;

public class Coordenador extends Professor{

    private Integer qtdHorasCoord;
    private Double valorHoraCoord;
    private String curso;

    public Coordenador(
            Integer codigo,
            String nome,
            Integer qtdHoras,
            Double valorHora,
            Integer qtdHorasCoord,
            Double valorHoraCoord,
            String curso
    ) {
        super(codigo, nome, qtdHoras, valorHora);
        this.qtdHorasCoord = qtdHorasCoord;
        this.valorHoraCoord = valorHoraCoord;
        this.curso = curso;
    }

    public Double calcularSalario(){
        return super.calcularSalario() + ((this.valorHoraCoord * this.qtdHorasCoord) * 4.5) ;
    }

    @Override
    public String toString() {
        return String.format(
                "%s%nCurso - %s%nHoras de Coordenação - %d%nValor das horas de Coordenação - %.2f%n",
                super.toString(),
                this.curso,
                this.qtdHorasCoord,
                this.valorHoraCoord
        );
    }
}
