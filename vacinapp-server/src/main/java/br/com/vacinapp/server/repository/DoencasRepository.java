package br.com.vacinapp.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.vacinapp.server.dominio.Doenca;
import br.com.vacinapp.server.dominio.Vacina;

@Repository
public interface DoencasRepository extends JpaRepository<Doenca, Long>, DoencasRepositoryCustom {

	public Doenca findDoencaByNome(@Param("nome") String nome);
	
}
