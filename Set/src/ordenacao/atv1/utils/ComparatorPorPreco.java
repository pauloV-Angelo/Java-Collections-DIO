package ordenacao.atv1.utils;

import java.util.Comparator;

import ordenacao.atv1.model.Produto;

public class ComparatorPorPreco implements Comparator<Produto>{

	@Override
	public int compare(Produto p1, Produto p2) {
		
		return Double.compare(p1.getPreco(), p2.getPreco());
	}

}
