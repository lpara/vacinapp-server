package br.com.vacinapp.server.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.vacinapp.server.dominio.Doenca;
import br.com.vacinapp.server.dominio.Vacina;
import br.com.vacinapp.server.repository.DoencasRepository;
import br.com.vacinapp.server.repository.VacinaRepository;

@RestController
@RequestMapping("/doencas")
public class DoencaRestController {
	
	@Autowired
	private DoencasRepository doencaRepo;
	@Autowired
	private VacinaRepository vacinaRepo;
	
	@PostMapping
	public Doenca inserirDoenca(Doenca doenca){
		return doencaRepo.save(doenca);
	}
	
	@GetMapping
	public List<Doenca> buscarDoencas(){
		return doencaRepo.findAll();
	}
	
	@GetMapping("/{idDoenca}")
	public Doenca buscarDoencaPorId(@PathVariable("idDoenca") Long idDoenca){
		return doencaRepo.findOne(idDoenca);
	}
	
	@GetMapping("/nome/{nome}")
	public Doenca buscarDoencaPorNome(@PathVariable("nome") String nome){
		return doencaRepo.findDoencaByNome(nome);
	}
	
	@GetMapping("/vacina/{idDoenca}")
	public Vacina buscarVacinaPorDoenca(@PathVariable("idDoenca") Long idDoenca){
		Doenca doenca = doencaRepo.findOne(idDoenca);
		return vacinaRepo.findOne(doenca.getVacina().getId());
	}

}
