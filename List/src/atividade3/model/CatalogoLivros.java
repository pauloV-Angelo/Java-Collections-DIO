package atividade3.model;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
	
	private List<Livro> catalogoLivros;

	public CatalogoLivros() {
		this.catalogoLivros = new ArrayList<Livro>();
	}
	
	public void adicionarLivro(String titulo, String autor, int anoPublicacao){
		catalogoLivros.add(new Livro(titulo,autor,anoPublicacao));
	}
	
	public List<Livro> pesquisarPorAutor(String autor) {
		List<Livro> listaAutor = new ArrayList<Livro>();
		for(Livro l : catalogoLivros) {
			if(l.getAutor().equals(autor)) {
				listaAutor.add(l);
			}
		}
		return listaAutor;	
	}
	
	public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
		List<Livro> listaAno = new ArrayList<Livro>();
		for(Livro l : catalogoLivros) {
			if(anoInicial <= l.getAnoPublicacao() && l.getAnoPublicacao()<=anoFinal) {
				listaAno.add(l);
			}
		}
		return listaAno;	
	}
	
	public Livro pesquisarPorTitulo(String titulo) {
		for(Livro l : catalogoLivros) {
			if(l.getTitulo().equals(titulo)) {
				return l;
			}
		}	
		return null;

	}
}
