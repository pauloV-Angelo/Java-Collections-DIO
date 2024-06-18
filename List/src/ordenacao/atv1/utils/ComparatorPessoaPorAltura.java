package ordenacao.atv1.utils;

import java.util.Comparator;

import ordenacao.atv1.model.Pessoa;

public class ComparatorPessoaPorAltura implements Comparator<Pessoa>{

	@Override
	public int compare(Pessoa pessoa, Pessoa outraPessoa) {
		return Double.compare(pessoa.getAltura(), outraPessoa.getAltura());
	}
 
}
