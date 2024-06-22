package ordenacao.atv2.utils;

import java.util.Comparator;


//Esta classe não foi pedida na atividade, fiz apenas para exercitar Comparator
public class ComparatorIntegerDescendente implements Comparator<Integer>{

	@Override
	public int compare(Integer numero, Integer outroNumero) {
	//invertendo os parâmetros do compare eu consigo ordenar a lista em ordem decrescente
	return Integer.compare(outroNumero, numero);

}
	
}
