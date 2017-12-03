package br.com.vacinapp.server.dominio;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;


@Entity
public class Vacinacao extends EntidadeGenerica{
	
	@OneToOne
	@NotNull
	private Vacina vacina;
	
	@OneToOne
	@NotNull
	private Carteira carteira;
	
	private String lote;
	
	private Date dataRenovacao;
	
	@Transient
	private List<Dose> doses;

	public Vacina getVacina() {
		return vacina;
	}

	public void setVacina(Vacina vacina) {
		this.vacina = vacina;
	}

	public Carteira getCarteira() {
		return carteira;
	}

	public void setCarteira(Carteira carteira) {
		this.carteira = carteira;
	}

	public String getLote() {
		return lote;
	}

	public void setLote(String lote) {
		this.lote = lote;
	}

	public Date getDataRenovacao() {
		return dataRenovacao;
	}

	public void setDataRenovacao(Date dataRenovacao) {
		this.dataRenovacao = dataRenovacao;
	}

	public List<Dose> getDoses() {
		return doses;
	}

	public void setDoses(List<Dose> doses) {
		this.doses = doses;
	}

}
