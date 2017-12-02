package br.com.vacinapp.server.dominio;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Usuario extends EntidadeGenerica{
	
	@NotEmpty
	@Column(unique = true)
	private String login;
	
	@NotEmpty
	private String senha;
	
	@OneToOne//(cascade = CascadeType.ALL, orphanRemoval = true)
	@NotNull
	private Pessoa pessoa;

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

}
