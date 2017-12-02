package br.com.vacinapp.server.repository;

import java.util.List;

import org.springframework.data.repository.query.Param;

import br.com.vacinapp.server.dominio.Doenca;
import br.com.vacinapp.server.dominio.Vacina;

public interface DoencasRepositoryCustom {
	
	public List<Doenca> buscarDoencasPorNomeLike(String nomeDoenca);

}
