package br.com.vacinapp.server.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import br.com.vacinapp.server.dominio.Doenca;
import br.com.vacinapp.server.dominio.Vacina;

@Repository
public class DoencasRepositoryImpl implements DoencasRepositoryCustom{

	@PersistenceContext
	EntityManager entityManager;
	
	public List<Doenca> buscarDoencasPorNomeLike(String nomeDoenca){
	
		String sql = "SELECT * FROM public.doenca WHERE nome LIKE ?";
		
		nomeDoenca = nomeDoenca.toLowerCase();
		nomeDoenca = nomeDoenca.substring(0,1).toUpperCase() + nomeDoenca.substring(1);
		Query query = entityManager.createNativeQuery(sql);
		query.setParameter(1, nomeDoenca + "%");
		
		return query.getResultList();
	}
	
}
