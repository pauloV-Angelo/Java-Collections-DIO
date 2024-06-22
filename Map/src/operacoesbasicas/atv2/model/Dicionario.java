package operacoesbasicas.atv2.model;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
	private Map<String, String> palavras;

	public Dicionario() {
		this.palavras = new HashMap<>();
	}

	public void adicionarPalavra(String palavra, String definicao) {
		palavras.put(palavra, definicao);
	}

	public void removerPalavra(String palavra) {
		if (!palavras.isEmpty()) {
			if (palavras.containsKey(palavra)) {
				palavras.remove(palavra);
			} else {
				System.out.println("Palavra " + palavra + " não encontrada no Map");
			}
		} else {
			System.out.println("Dicionário vazio");
		}
	}

	public void exibirPalavras() {
		if (!palavras.isEmpty()) {
			palavras.forEach((palavra, definicao) -> System.out.println(palavra + " - definição: " + definicao));
		} else {
			System.out.println("Dicionário vazio");
		}
	}
	
	public String pesquisarPorPalavra(String palavra) {
		if(palavras.containsKey(palavra)) {
			return palavras.get(palavra);
		} else {
			System.out.println("Palavra não encontrada");
			return null;
		}
	}

}
