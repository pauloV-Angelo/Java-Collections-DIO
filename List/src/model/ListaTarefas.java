package model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class ListaTarefas {
	public static List<Tarefa> listaTarefas = new ArrayList<Tarefa>();
	
	public static void main(String[] args) {
		adicionarTarefa("ir para a academia");
		adicionarTarefa("Estudar Collections");
		adicionarTarefa("Estudar Python");
		adicionarTarefa("Fazer almoço");
		adicionarTarefa("Caminhar com o cachorro");
		//adicionarTarefa("Fazer almoço");
		adicionarTarefa("ir para a academia");
		adicionarTarefa("Estudar Collections");
		adicionarTarefa("Estudar Python");
		adicionarTarefa("ir para a academia");
		adicionarTarefa("Estudar Collections");
		adicionarTarefa("Estudar Python");
		
		listarTarefas();
		
		System.out.println();
		
		removerTarefa("Fazer almoço");
	
		listarTarefas();
	}
	
	

	public static void adicionarTarefa(String descricao) {
		listaTarefas.add(new Tarefa(descricao));
	}
	
//	
//	  public static void removerTarefa(String descricao) {
//	        Iterator<Tarefa> iterator = listaTarefas.iterator();
//	        while (iterator.hasNext()) {
//	            Tarefa tarefa = iterator.next();
//	            if (descricao.equals(tarefa.getDescricao())) {
//	                iterator.remove();
//	            }
//	        }
//	    }
//	
	
	public static void removerTarefa(String descricao) {
		Tarefa tarefa = new Tarefa(descricao);
			if(listaTarefas.contains(tarefa)){
			listaTarefas.remove(descricao);
			}
				
		
	}
	
	public static void listarTarefas() {
	    for (Tarefa t : listaTarefas) {
	        int numeroTarefa = listaTarefas.indexOf(t) + 1;
	        System.out.println("Tarefa " + numeroTarefa + ": " + t.getDescricao());
	    }
	}

}
