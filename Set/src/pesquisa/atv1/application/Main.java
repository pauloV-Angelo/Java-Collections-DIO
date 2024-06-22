package pesquisa.atv1.application;

import pesquisa.atv1.model.AgendaContatos;

public class Main {
	 public static void main(String[] args) {
		    // Criando uma instância da classe AgendaContatos
		    AgendaContatos agendaContatos = new AgendaContatos();

		    // Exibindo os contatos no conjunto (deve estar vazio)
		    agendaContatos.exibirContatos();

		    System.out.println();
		    
		    // Adicionando contatos à agenda
		    agendaContatos.adicionarContato("João", 123456789);
		    agendaContatos.adicionarContato("Maria", 987654321);
		    agendaContatos.adicionarContato("Maria Fernandes", 55555555);
		    agendaContatos.adicionarContato("Ana", 88889999);
		    agendaContatos.adicionarContato("Fernando", 77778888);
		    agendaContatos.adicionarContato("Carolina", 55555555);

		    // Exibindo os contatos na agenda
		    agendaContatos.exibirContatos();
		    
		    System.out.println();

		    // Pesquisando contatos pelo nome
		    System.out.println(agendaContatos.pesquisarPorNome("Maria"));
		    
		    System.out.println();

		    // Atualizando o número de um contato
		    agendaContatos.atualizarNumeroContato("Carolina", 44443333);
		    System.out.println("Contato atualizados");
		    agendaContatos.exibirContatos();
		  }
}
