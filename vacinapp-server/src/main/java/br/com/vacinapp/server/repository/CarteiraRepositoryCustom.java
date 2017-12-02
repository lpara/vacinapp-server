package br.com.vacinapp.server.repository;

import br.com.vacinapp.server.dominio.Carteira;

public interface CarteiraRepositoryCustom {
	
	public Carteira buscarCarteiraPorPessoa(Long idPessoa);

}
