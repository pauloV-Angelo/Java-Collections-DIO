package ordenacao.atv1.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import ordenacao.atv1.utils.ComparatorPessoaPorAltura;

public class OrdenacaoPessoas {
	
	private List<Pessoa> listaPessoas;

	public OrdenacaoPessoas() {
		super();
		this.listaPessoas = new ArrayList<>();
	}
	
	public void adicionarPessoa(String nome, int idade, double altura) {
		listaPessoas.add(new Pessoa(nome,idade,altura));
	}
	
	public void ordenarPorIdade() {
		Collections.sort(listaPessoas);
		System.out.println(listaPessoas);
	}

	public void ordenarPorAltura() {
		ComparatorPessoaPorAltura comparator = new ComparatorPessoaPorAltura();
		Collections.sort(listaPessoas, comparator);
		System.out.println(listaPessoas);
	}
	
	public void pessoaList() {
		listaPessoas.stream().forEach(p -> System.out.println(p));
	}
	

}
