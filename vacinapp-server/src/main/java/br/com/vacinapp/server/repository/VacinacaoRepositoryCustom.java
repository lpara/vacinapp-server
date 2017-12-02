package br.com.vacinapp.server.repository;

import java.util.List;

import br.com.vacinapp.server.dominio.Vacinacao;

public interface VacinacaoRepositoryCustom {
	
	public List<Vacinacao> buscarVacinacoesPorCarteira(Long idCarteira);

}
