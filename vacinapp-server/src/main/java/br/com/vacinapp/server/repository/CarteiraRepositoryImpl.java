package br.com.vacinapp.server.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import br.com.vacinapp.server.dominio.Carteira;

@Repository
public class CarteiraRepositoryImpl implements CarteiraRepositoryCustom{

	@PersistenceContext
	EntityManager entityManager;
	
	public Carteira buscarCarteiraPorPessoa(Long idPessoa){
		
		String sql = "SELECT * FROM public.carteira WHERE dono_carteira_id = ?";
		
		Query query = entityManager.createNativeQuery(sql);
		query.setParameter(1, idPessoa);
		
		return (Carteira) query.getSingleResult();
	}
}
