package ordenacao.atv1.application;

import ordenacao.atv1.model.OrdenacaoPessoas;

public class Main {

	 public static void main(String[] args) {
		  // Criando uma instância da classe OrdenacaoPessoas
		    OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();

		    // Adicionando pessoas à lista
		    ordenacaoPessoas.adicionarPessoa("Alice", 20, 1.56);
		    ordenacaoPessoas.adicionarPessoa("Bob", 30, 1.80);
		    ordenacaoPessoas.adicionarPessoa("Charlie", 25, 1.70);
		    ordenacaoPessoas.adicionarPessoa("David", 17, 1.58);

		    System.out.println("Lista de pessoas sem nenhum tipo de ordenação");
		    // Exibindo a lista de pessoas adicionadas
		    ordenacaoPessoas.pessoaList();
		    System.out.println();
		    System.out.println("Lista de pessoas ordenadas por idade:");
		    // Ordenando e exibindo por idade
		    ordenacaoPessoas.ordenarPorIdade();
		    System.out.println();
		    System.out.println("Lista de pessoas ordenadas por altura:");
		    // Ordenando e exibindo por altura
		    ordenacaoPessoas.ordenarPorAltura();
		  }

}
