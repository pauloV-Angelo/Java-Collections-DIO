package ordenacao.atv2.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//import ordenacao.atv2.utils.ComparatorIntegerDescendente;

public class OrdenacaoNumeros {
	private List<Integer> listaNumeros;
	
	
	public OrdenacaoNumeros() {
		this.listaNumeros = new ArrayList<>();
	}
	
	public void adicionarNumero(int numero) {
		listaNumeros.add(numero);
	}
	
	public void ordenarAscendente() {
		Collections.sort(listaNumeros);
		System.out.println("Lista ordenada em ordem ascendente: ");
		exibirNumeros();
	}
	
	public void ordenarDescendente() {
		
//		Comparator experimental que criei presente no pacote utils
//		ComparatorIntegerDescendente comparator = new ComparatorIntegerDescendente();
//		Collections.sort(listaNumeros, comparator);
		
		
		listaNumeros.sort(Collections.reverseOrder());
		System.out.println("Lista ordenada em ordem descendente: ");
		exibirNumeros();
	}

	public void exibirNumeros() {
		listaNumeros.stream().forEach(i -> System.out.println(i));
	}
}
