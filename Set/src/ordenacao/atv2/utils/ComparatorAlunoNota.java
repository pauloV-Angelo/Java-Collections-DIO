package ordenacao.atv2.utils;

import java.util.Comparator;
import ordenacao.atv2.model.Aluno;

public class ComparatorAlunoNota implements Comparator<Aluno> {

    @Override
    public int compare(Aluno a1, Aluno a2) {
        return Double.compare(a1.getMedia(), a2.getMedia());
    }
}
