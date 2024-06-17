package atividade1.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListaTarefas {

	private List<Tarefa> listaTarefas;

	public ListaTarefas() {
		this.listaTarefas = new ArrayList<Tarefa>();
	}

	public void adicionarTarefa(String descricao) {
		listaTarefas.add(new Tarefa(descricao));
	}

	public void removerTarefa(String descricao) {
		Iterator<Tarefa> iterator = listaTarefas.iterator();
		while (iterator.hasNext()) {
			Tarefa tarefa = iterator.next();
			if (descricao.equals(tarefa.getDescricao())) {
				iterator.remove();
			}
		}
	}

	public int obterNumeroTotalTarefas() {
		return listaTarefas.size();
	}

	public void obterDescricoesTarefas() {
		System.out.println(listaTarefas);
	}

}
