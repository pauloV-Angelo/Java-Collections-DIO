package pesquisa.atv1.model;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class AgendaContatos {
	private Set<Contato> grupoContatos;

	public AgendaContatos() {
		
		this.grupoContatos = new HashSet<>();
	}
	
	public void adicionarContato(String nome, int numero) {
		grupoContatos.add(new Contato(nome, numero));
	}
	
	
	public void exibirContatos() {
		if(!grupoContatos.isEmpty())
			grupoContatos.stream().forEach(System.out::println);
		else
			System.out.println("a Lista de contatos está vazia");
	}
	
	public Set<Contato> pesquisarPorNome(String nome){
		return  grupoContatos.stream().filter(c -> c.getNome().startsWith(nome)).collect(Collectors.toSet());
	}
	
	public void atualizarNumeroContato(String nome, int novoNumero) {
		grupoContatos.stream().filter(c-> c.getNome().equalsIgnoreCase(nome)).forEach(c -> c.setNumero(novoNumero));
	}
	}

