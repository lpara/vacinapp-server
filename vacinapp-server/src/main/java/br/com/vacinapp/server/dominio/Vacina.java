package br.com.vacinapp.server.dominio;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Vacina extends EntidadeGenerica{

	@NotEmpty
	private String nome;
	
	@NotNull
	private Boolean renovavel;
	
	@Transient
	private List<Doenca> doencas;


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Boolean getRenovavel() {
		return renovavel;
	}

	public void setRenovavel(Boolean renovavel) {
		this.renovavel = renovavel;
	}

	public List<Doenca> getDoencas() {
		return doencas;
	}

	public void setDoencas(List<Doenca> doencas) {
		this.doencas = doencas;
	}
	
}
