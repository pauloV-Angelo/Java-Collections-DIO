package pesquisa.atv2.model;

import java.util.Objects;

public class Tarefa {
	
	private String descricao;
	private boolean check = false;
	
	public Tarefa(String descricao) {
		this.descricao = descricao;
	}

	public boolean isCheck() {
		return check;
	}

	public void setCheck(boolean check) {
		this.check = check;
	}

	public String getDescricao() {
		return descricao;
	}

	@Override
	public int hashCode() {
		return Objects.hash(descricao);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tarefa other = (Tarefa) obj;
		return Objects.equals(descricao, other.descricao);
	}
	
	@Override
    public String toString() {
        return "Tarefa{" +
                "descricao='" + descricao + '\'' +
                ", check=" + check +
                '}';
    }
	
}
