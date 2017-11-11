package br.com.vacinapp.server.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.vacinapp.server.dominio.Vacina;
import br.com.vacinapp.server.repository.VacinaRepository;


@RestController
@RequestMapping(value = "/vacina", produces = MediaType.APPLICATION_JSON_VALUE)
public class VacinaController {

	@Autowired
	protected VacinaRepository vacinaRepo;
	
	@PostMapping
	public Vacina salvar(@RequestBody Vacina vacina){
		return vacinaRepo.save(vacina);
	}
}
