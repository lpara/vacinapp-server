package br.com.vacinapp.server.dominio;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Dose extends EntidadeGenerica{
	
	@NotNull
	Integer numeracao;
	
	@NotNull
	Date dataVacinacao;
	
	@ManyToOne
	@JoinColumn(name ="id_vacinacao")
	Vacinacao vacinacao;

	public Integer getNumeracao() {
		return numeracao;
	}

	public void setNumeracao(Integer numeracao) {
		this.numeracao = numeracao;
	}

	public Date getDataVacinacao() {
		return dataVacinacao;
	}

	public void setDataVacinacao(Date dataVacinacao) {
		this.dataVacinacao = dataVacinacao;
	}

	public Vacinacao getVacinacao() {
		return vacinacao;
	}

	public void setVacinacao(Vacinacao vacinacao) {
		this.vacinacao = vacinacao;
	}
	

}
