package ordenacao.atv1.model;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import ordenacao.atv1.utils.ComparatorPorPreco;

public class CadastroProdutos {

	private Set<Produto> setProdutos;
	
	
	
	public CadastroProdutos() {
	this.setProdutos = new HashSet<>();
	}


	public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
		setProdutos.add(new Produto(cod, nome, preco, quantidade));
	}
	
	public void exibirProdutosPorNome() {
		Set<Produto> sortedPorNome = new TreeSet<>(setProdutos);
		sortedPorNome.stream().forEach(System.out::println);
	}
	
	public void exibirProdutosPorPreco() {
		Set<Produto> sortedPorPreco = new TreeSet<>(new ComparatorPorPreco());
		sortedPorPreco.addAll(setProdutos);
		sortedPorPreco.stream().forEach(System.out::println);
	}
	
	public void produtoSet(){
		setProdutos.stream().forEach(System.out::println);
	}
}
