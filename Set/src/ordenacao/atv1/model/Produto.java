package ordenacao.atv1.model;

import java.util.Objects;

public class Produto implements Comparable<Produto> {
	private long cod;
	private String nome;
	private double preco;
	private int quantidade;
	
	public Produto(long cod, String nome, double preco, int quantidade) {
		this.cod = cod;
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public long getCod() {
		return cod;
	}

	public String getNome() {
		return nome;
	}

	public double getPreco() {
		return preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cod);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return cod == other.cod;
	}

	@Override
	public int compareTo(Produto p) {
		return nome.compareToIgnoreCase(p.getNome());
	}
	
	@Override
    public String toString() {
        return "Produto{" +
               "cod=" + cod +
               ", nome='" + nome + '\'' +
               ", preco=" + preco +
               ", quantidade=" + quantidade +
               '}';
    }
	
}
