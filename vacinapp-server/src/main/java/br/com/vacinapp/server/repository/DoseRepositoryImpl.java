package br.com.vacinapp.server.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import br.com.vacinapp.server.dominio.Dose;

@Repository
public class DoseRepositoryImpl implements DoseRepositoryCustom{

	@PersistenceContext
	EntityManager entityManager;
	
	public List<Dose> buscarDosesPorVacinacao(Long idVacinacao){
		
		String sql = "SELECT * FROM public.dose WHERE id_vacinacao = ?";
		
		Query query = entityManager.createNativeQuery(sql);
		query.setParameter(1, idVacinacao);
		
		return query.getResultList();
	}
}
