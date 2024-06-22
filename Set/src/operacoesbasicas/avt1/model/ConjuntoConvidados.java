package operacoesbasicas.avt1.model;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
	private Set<Convidado> convidados;

	public ConjuntoConvidados() {
		this.convidados = new HashSet<>();
	}

	public void adicionarConvidado(String nome, int codigoConvite) {
		convidados.add(new Convidado(nome, codigoConvite));
	}

	public void removerConvidadoPorCodigoConvite(int codigoConvite) {
		convidados.removeIf( c -> c.getCodigoConvite() == codigoConvite);
	}
	
	public int contarConvidados() {
		return convidados.size();
	}
	
	public void exibirConvidados() {
		convidados.stream().forEach(System.out::println);
	}
}