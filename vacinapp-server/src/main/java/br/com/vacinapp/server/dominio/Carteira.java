package br.com.vacinapp.server.dominio;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;



@Entity
public class Carteira extends EntidadeGenerica{
	
	@ManyToOne
	@JoinColumn(name = "gerenciador_carteira")
	@NotNull
	private Usuario gerenciadorCarteira;
	
	@OneToOne
	@NotNull
	private Pessoa donoCarteira;

	public Usuario getGerenciadorCarteira() {
		return gerenciadorCarteira;
	}

	public void setGerenciadorCarteira(Usuario gerenciadorCarteira) {
		this.gerenciadorCarteira = gerenciadorCarteira;
	}

	public Pessoa getDonoCarteira() {
		return donoCarteira;
	}

	public void setDonoCarteira(Pessoa donoCarteira) {
		this.donoCarteira = donoCarteira;
	}
	
	
}
