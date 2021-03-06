package br.com.vacinapp.server.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import br.com.vacinapp.server.dominio.Vacina;

@Repository
public class VacinaRepositoryImpl implements VacinaRepositoryCustom {

	@PersistenceContext
	EntityManager entityManager;
	
	public List<Vacina> buscaVacinaPorNomeLike(String nomeVacina){
		
		String sql = "SELECT * FROM public.vacina WHERE nome LIKE ?";
		
		nomeVacina = nomeVacina.toLowerCase();
		nomeVacina = nomeVacina.substring(0, 1).toUpperCase() + nomeVacina.substring(1);
		Query query = entityManager.createNativeQuery(sql);
		query.setParameter(1, nomeVacina + "%");
		
		return query.getResultList();
	}
}
