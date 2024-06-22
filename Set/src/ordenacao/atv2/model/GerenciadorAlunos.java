package ordenacao.atv2.model;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import ordenacao.atv2.utils.ComparatorAlunoNota;

public class GerenciadorAlunos {

    private Set<Aluno> alunosDoColegio;

    public GerenciadorAlunos() {
        this.alunosDoColegio = new HashSet<>();
    }

    public void adicionarAluno(String nome, Long matricula, double media) {
        alunosDoColegio.add(new Aluno(nome, matricula, media));
    }

    public void removerAluno(long matricula) {
        alunosDoColegio.removeIf(a -> a.getMatricula().equals(matricula));
    }

    public void exibirAlunosPorNome() {
        Set<Aluno> alunosPorNome = new TreeSet<>(alunosDoColegio);
        alunosPorNome.forEach(System.out::println);
    }

    public void exibirAlunosPorNota() {
        Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorAlunoNota());
        alunosPorNota.addAll(alunosDoColegio);
        alunosPorNota.forEach(System.out::println);
    }

    public void exibirAlunos() {
        alunosDoColegio.forEach(System.out::println);
    }
}
