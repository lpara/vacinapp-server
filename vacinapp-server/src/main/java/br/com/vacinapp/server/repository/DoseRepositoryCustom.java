package br.com.vacinapp.server.repository;

import java.util.List;

import br.com.vacinapp.server.dominio.Dose;

public interface DoseRepositoryCustom {
	
	public List<Dose> buscarDosesPorVacinacao(Long idVacinacao);

}
