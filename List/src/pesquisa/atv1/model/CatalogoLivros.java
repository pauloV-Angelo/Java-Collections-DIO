package pesquisa.atv1.model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CatalogoLivros {
	
	private List<Livro> catalogoLivros;

	public CatalogoLivros() {
		this.catalogoLivros = new ArrayList<>();
	}
	
	public void adicionarLivro(String titulo, String autor, int anoPublicacao){
		catalogoLivros.add(new Livro(titulo,autor,anoPublicacao));
	}
	
	public List<Livro> pesquisarPorAutor(String autor) {
		List<Livro> livrosDoAutor = catalogoLivros.stream().filter(l -> l.getAutor().equals(autor)).collect(Collectors.toList());
		return livrosDoAutor;	
	}
	
	public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
		List<Livro> livrosPorAno = catalogoLivros.stream().filter(l -> l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao()<=anoFinal).collect(Collectors.toList());
		return livrosPorAno;	
	}
	
	public Livro pesquisarPorTitulo(String titulo) {
		return catalogoLivros.stream().filter(l -> l.getTitulo().equalsIgnoreCase(titulo)).findFirst().orElse(null);
	}
}
