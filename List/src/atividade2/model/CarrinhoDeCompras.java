package atividade2.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CarrinhoDeCompras {
	
	private List<Item> listaItens;

	public CarrinhoDeCompras() {
		this.listaItens = new ArrayList<Item>();
	}
	
	public void adicionarItem(String nome, double preco, int quantidade) {
		listaItens.add(new Item(nome,preco,quantidade));
	}
	
	public void removerItem(String nome) {
		Iterator<Item> iterator = listaItens.iterator();
		while(iterator.hasNext()) {
			Item item = iterator.next();
			if(item.getNome().equals(nome)) {
				iterator.remove();
			}
		}
		
	}
	
	public double calcularValorTotal() {
		double soma = 0;
		for(Item i : listaItens) {
			soma += ( i.getPreco() * i.getQuantidade() );
		}
		return soma;
	}
	
	public void exibirItens() {
		System.out.println(listaItens);
	}

}
