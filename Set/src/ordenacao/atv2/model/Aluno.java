package ordenacao.atv2.model;

import java.util.Objects;

public class Aluno implements Comparable<Aluno> {
    private String nome;
    private Long matricula;
    private double media;

    public Aluno(String nome, Long matricula, double media) {
        this.nome = nome;
        this.matricula = matricula;
        this.media = media;
    }

    public String getNome() {
        return nome;
    }

    public Long getMatricula() {
        return matricula;
    }

    public double getMedia() {
        return media;
    }

    @Override
    public int hashCode() {
        return Objects.hash(matricula);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Aluno other = (Aluno) obj;
        return Objects.equals(matricula, other.matricula);
    }

    @Override
    public String toString() {
        return "{nome: " + nome + ", matrícula: " + matricula + ", média: " + media + "}";
    }

    @Override
    public int compareTo(Aluno a) {
        return nome.compareToIgnoreCase(a.getNome());
    }
}
