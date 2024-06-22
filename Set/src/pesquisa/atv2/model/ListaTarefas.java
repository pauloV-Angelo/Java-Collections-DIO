package pesquisa.atv2.model;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class ListaTarefas {
private Set<Tarefa> listaTarefas;

public ListaTarefas() {
	this.listaTarefas = new HashSet<>();
}
public void adicionarTarefa(String descricao) {
	listaTarefas.add(new Tarefa(descricao));
}

public void removerTarefa(String descricao) {
	listaTarefas.removeIf(t -> t.getDescricao().equalsIgnoreCase(descricao));
}

public void exibirTarefas() {
	listaTarefas.stream().forEach(System.out::println);
}

public int contarTarefas() {
	return listaTarefas.size();
}

public Set<Tarefa> obterTarefasConcluidas(){
	Set<Tarefa> setConcluido = listaTarefas.stream().filter(t->t.isCheck() == true).collect(Collectors.toSet());
	return setConcluido;
}

public Set<Tarefa> obterTarefasPendentes(){
	Set<Tarefa> setPendente = listaTarefas.stream().filter(t->t.isCheck() == false).collect(Collectors.toSet());
	return setPendente;
}

public void marcarTarefaConcluida(String descricao) {
	listaTarefas.stream().filter(t-> t.getDescricao().equalsIgnoreCase(descricao)).forEach(t->t.setCheck(true));
}

public void marcarTarefaPendente(String descricao) {
	listaTarefas.stream().filter(t-> t.getDescricao().equalsIgnoreCase(descricao)).forEach(t->t.setCheck(false));
}

public void limparListaTarefas() {
	listaTarefas.clear();
}

}
