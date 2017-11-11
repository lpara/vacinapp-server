package br.com.vacinapp.server.dominio;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Doenca extends EntidadeGenerica {
	
	@NotEmpty
	private String nome;
	
	@ManyToOne
	@JoinColumn(name = "id_vacina")
	private Vacina vacina;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Vacina getVacina() {
		return vacina;
	}

	public void setVacina(Vacina vacina) {
		this.vacina = vacina;
	}
}
