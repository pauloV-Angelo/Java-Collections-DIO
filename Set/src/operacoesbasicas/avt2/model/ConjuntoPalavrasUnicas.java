package operacoesbasicas.avt2.model;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
	private Set<String> palavras;

	public ConjuntoPalavrasUnicas() {
		this.palavras = new HashSet<>();
	}

	@Override
	public int hashCode() {
		return Objects.hash(palavras);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ConjuntoPalavrasUnicas other = (ConjuntoPalavrasUnicas) obj;
		return Objects.equals(palavras, other.palavras);
	}
	
	public void adicionarPalavra(String palavra) {
		palavras.add(palavra);
	}
	
	public void removerPalavra(String palavra) {
		if(palavras.contains(palavra)) {
			palavras.remove(palavra);
		}else {
			System.out.println("Palavra " + palavra + " não existe no grupo");
		}
		}
	
	public boolean verificarPalavra(String palavra) {
		if(palavras.contains(palavra)) {
			return true;
		} else {
			return false;
		}
	}
	
	public void exibirPalavrasUnicas() {
		palavras.stream().forEach(System.out::println);
	}
	
	

}
