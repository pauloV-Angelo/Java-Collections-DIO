package pesquisa.atv1.model;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

	private Map<Long, Produto> estoque;

	public EstoqueProdutos() {
		this.estoque = new HashMap<>();
	}

	public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
		estoque.put(cod, new Produto(nome, quantidade, preco));
	}

	public void exibirProdutos() {
		if (estoque.isEmpty()) {
			System.out.println("Estoque vazio");
		} else {
			estoque.forEach((cod, produto) -> System.out.println("Código: " + cod + " - Produto: " + produto));
		}
	}

	public double calcularValorTotalEstoque() {
		return estoque.values().stream().mapToDouble(p -> p.getQuantidade() * p.getPreco()).sum();
	}

	public Produto obterProdutoMaisCaro() {
		return estoque.values().stream().max((p1, p2) -> Double.compare(p1.getPreco(), p2.getPreco())).orElse(null);
	}

	public Produto obterProdutoMaisBarato() {
		return estoque.values().stream().min((p1, p2) -> Double.compare(p1.getPreco(), p2.getPreco())).orElse(null);
	}

	public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
		return estoque.values().stream().max(
				(p1, p2) -> Double.compare((p1.getPreco() * p1.getQuantidade()), (p2.getPreco() * p2.getQuantidade())))
				.orElse(null);
	}
}
