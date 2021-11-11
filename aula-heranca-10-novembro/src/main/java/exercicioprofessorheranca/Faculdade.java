package exercicioprofessorheranca;

import java.util.ArrayList;
import java.util.List;

public class Faculdade {
    private String nome;
    private Integer vagas;
    private List<Professor> professores;

    public Faculdade(String nome, Integer vagas) {
        this.nome = nome;
        this.vagas = vagas;
        this.professores = new ArrayList<>();
    }

    public void contratarProfessor(Professor professor){
        if(professores.size() < vagas){
            professores.add(professor);
        } else {
            System.out.println("Desculpe, não há mais vagas disponiveis");
        }
    }

    public void exibirProfessores(){
        for(Professor prof : professores)
            System.out.println(prof);
    }

    public void exibirCoordenadores(){
        for(Professor prof: professores){
            if(prof instanceof Coordenador)
                System.out.println(prof);
        }
    }
}
