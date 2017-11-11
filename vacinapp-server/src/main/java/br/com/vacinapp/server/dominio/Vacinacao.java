package br.com.vacinapp.server.dominio;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
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
	
	@NotNull
	private Date dataVacinacao;
	
	private Date dataRenovacao;

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

	public Date getDataVacinacao() {
		return dataVacinacao;
	}

	public void setDataVacinacao(Date dataVacinacao) {
		this.dataVacinacao = dataVacinacao;
	}

	public Date getDataRenovacao() {
		return dataRenovacao;
	}

	public void setDataRenovacao(Date dataRenovacao) {
		this.dataRenovacao = dataRenovacao;
	}

}
