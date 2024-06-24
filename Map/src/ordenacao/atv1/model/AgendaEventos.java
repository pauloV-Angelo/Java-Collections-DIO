package ordenacao.atv1.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
	private Map<LocalDate, Evento> agenda;

	public AgendaEventos() {
		this.agenda = new HashMap<>();
	}

	public void adicionarEvento(LocalDate data, String nome, String atracao) {
		agenda.put(data, new Evento(nome, atracao));
	}

	public void exibirAgenda() {
		Map<LocalDate, Evento> agendaOrdenada = new TreeMap<>(agenda);
		agendaOrdenada.forEach((data, evento) -> System.out.println("Evento: " + evento.getNome() + "Atração: "
				+ evento.getAtracao() + " na data: " + data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))));
	}

	public void obterProximoEvento() {
		LocalDate hoje = LocalDate.now();
		Map<LocalDate, Evento> agendaOrdenada = new TreeMap<>(agenda);
		for (Map.Entry<LocalDate, Evento> entry : agendaOrdenada.entrySet()) {
			if (entry.getKey().isEqual(hoje) || entry.getKey().isAfter(hoje)) {
				System.out.println("O próximo evento será: " + entry.getValue() + " na data de "
						+ entry.getKey().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
				break;
			}
		}
	}
}
