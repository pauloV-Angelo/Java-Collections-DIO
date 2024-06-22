package operacoesbasicas.atv1.model;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
	Map<String, Integer> contatos;

	public AgendaContatos() {
		contatos = new HashMap<>();
	}

	public void adicionarContato(String nome, Integer telefone) {
		contatos.put(nome, telefone);
	}

	public void removerContato(String nome) {
		contatos.remove(nome);
	}

	public void exibirContatos() {
		contatos.forEach((nome, telefone) -> System.out.println("nome: " + nome + " telefone: " + telefone));
	}

	public Integer pesquisarPorNome(String nome) {
		if (contatos.containsKey(nome)) {
			return contatos.get(nome);
		} else {
			return null;
		}

	}

}
