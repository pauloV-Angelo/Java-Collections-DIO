package atividade1.application;

import atividade1.model.ListaTarefas;

public class Main {

	public static void main(String[] args) {
		ListaTarefas listaTarefas = new ListaTarefas();
		
		listaTarefas.adicionarTarefa("ir para a academia");
		listaTarefas.adicionarTarefa("Estudar Collections");
		listaTarefas.adicionarTarefa("Estudar Python");
		listaTarefas.adicionarTarefa("Fazer almoço");
		listaTarefas.adicionarTarefa("Caminhar com o cachorro");
		listaTarefas.adicionarTarefa("Fazer almoço");
		
		ListaTarefas listaTarefas2 = new ListaTarefas();
		

		listaTarefas2.adicionarTarefa("ir para a academia 2");
		listaTarefas2.adicionarTarefa("Estudar Collections 2");
		listaTarefas2.adicionarTarefa("Estudar Python 2");
		
		System.out.println("Lista de tarefas 1:");
		
		listaTarefas.obterDescricoesTarefas();
		
		System.out.println();
		
		System.out.println("Lista de tarefas 2:");
		listaTarefas2.obterDescricoesTarefas();
		
		System.out.println();
		
		listaTarefas.removerTarefa("Fazer almoço");
	
		System.out.println("Lista de tarefas 1 após remoção do almoço:");
		listaTarefas.obterDescricoesTarefas();

		
		System.out.println();
		System.out.println("Número de tarefas da lista 2: "+listaTarefas2.obterNumeroTotalTarefas());
	}

}
