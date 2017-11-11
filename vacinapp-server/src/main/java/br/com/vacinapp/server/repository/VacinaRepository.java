package br.com.vacinapp.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.vacinapp.server.dominio.Vacina;

@Repository
public interface VacinaRepository extends JpaRepository<Vacina, Long> {

}
