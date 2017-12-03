package br.com.vacinapp.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.vacinapp.server.dominio.Dose;

@Repository
public interface DoseRepository extends JpaRepository<Dose,Long>, DoseRepositoryCustom {

}
