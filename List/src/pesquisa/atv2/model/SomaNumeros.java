package pesquisa.atv2.model;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
private List<Integer> listaInteiros;

public SomaNumeros() {
	this.listaInteiros = new ArrayList<>();
}
	
public void adicionarNumero(int numero) {
	listaInteiros.add(numero);
}
public int calcularSoma() {
	return listaInteiros.stream().mapToInt(i -> i.intValue()).sum();
}

public int encontrarMaiorNumero() {
	return listaInteiros.stream().mapToInt(i -> i.intValue()).max().orElseThrow(() -> new IllegalStateException("A lista está vazia"));
	
}
	
public int encontrarMenorNumero() {
	return listaInteiros.stream().mapToInt(i -> i.intValue()).min().orElseThrow(() -> new IllegalStateException("A lista está vazia"));
}

public void exibirNumeros() {
	listaInteiros.stream().forEach(i -> System.out.println(i));
}
	
}
