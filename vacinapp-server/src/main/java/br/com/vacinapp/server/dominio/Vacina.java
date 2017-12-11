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
	
	@NotNull
	private Integer numeroDoses;
	
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

	public Integer getNumeroDoses() {
		return numeroDoses;
	}

	public void setNumeroDoses(Integer numeroDoses) {
		this.numeroDoses = numeroDoses;
	}

	public List<Doenca> getDoencas() {
		return doencas;
	}

	public void setDoencas(List<Doenca> doencas) {
		this.doencas = doencas;
	}
	
}
