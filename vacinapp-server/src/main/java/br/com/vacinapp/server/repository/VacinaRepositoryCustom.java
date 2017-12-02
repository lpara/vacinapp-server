package br.com.vacinapp.server.repository;

import java.util.List;

import br.com.vacinapp.server.dominio.Vacina;

public interface VacinaRepositoryCustom {
	
	public List<Vacina> buscaVacinaPorNomeLike(String nomeVacina);

}
