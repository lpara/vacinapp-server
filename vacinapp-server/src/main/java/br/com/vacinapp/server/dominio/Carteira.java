package br.com.vacinapp.server.dominio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Carteira {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "gerenciador_carteira")
	private Usuario gerenciadorCarteira;
	
	@OneToOne
	private Pessoa donoCarteira;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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
