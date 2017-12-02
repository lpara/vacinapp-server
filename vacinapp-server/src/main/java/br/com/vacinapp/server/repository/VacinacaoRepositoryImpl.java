package br.com.vacinapp.server.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import br.com.vacinapp.server.dominio.Vacinacao;

@Repository
public class VacinacaoRepositoryImpl implements VacinacaoRepositoryCustom{

	@PersistenceContext
	EntityManager entityManager;
	
	public List<Vacinacao> buscarVacinacoesPorCarteira(Long idCarteira){
		
		String sql = "SELECT * FROM public.vacinacao WHERE carteira_id = ?";
		
		Query query = entityManager.createNativeQuery(sql);
		query.setParameter(1, idCarteira);
		
		return query.getResultList();
	}
}
