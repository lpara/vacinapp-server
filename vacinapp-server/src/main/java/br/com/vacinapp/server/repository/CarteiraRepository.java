package br.com.vacinapp.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.vacinapp.server.dominio.Carteira;

@Repository
public interface CarteiraRepository extends JpaRepository<Carteira, Long>, CarteiraRepositoryCustom{

}
