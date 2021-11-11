package exercicioalunoheranca;

import java.util.ArrayList;
import java.util.List;

public class Faculdade {
    private String nome;
    private Integer vagas;
    private List<Aluno> alunos;

    public Faculdade(String nome, Integer vagas) {
        this.nome = nome;
        this.vagas = vagas;
        this.alunos = new ArrayList<>();
    }

    public void matricularAluno(Aluno aluno){
        if(alunos.size() < vagas ){
            alunos.add(aluno);
        } else {
            System.out.println("A faculdade está sem vagas no momento <:(");
        }

    }

    public void exibirAlunosMatriculados(){
        if(alunos.isEmpty()){
            System.out.println("A Faculdade " + this.nome + " não possui Alunos cadastrados.");
        } else {
            for(Aluno aluno : alunos){
                System.out.println(aluno);
            }
        }
    }

    public void exibirAlunoPos(){
        if(alunos.isEmpty()){
            System.out.println("A Faculdade " + this.nome + " não possui Alunos cadastrados.");
        } else {
            for(Aluno aluno : alunos){
                if(aluno instanceof AlunoPos)
                    System.out.println(aluno);
            }
        }
    }

    @Override
    public String toString() {
        return String.format(
                "Nome da Faculdade - %s%nTotal de vagas - %d%nVagas disponíveis - %d%nAlunos Registrados - %n%s",
                this.nome,
                this.vagas,
                this.vagas - alunos.size(),
                this.alunos
        );
    }
}
