package br.com.vacinapp.server.dominio;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class Vacina {

	@Id
	@GeneratedValue
	private Long id;
	
	private String nome;
	
	private Boolean renovavel;
	
	@Transient
	private List<Doenca> doencas;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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
