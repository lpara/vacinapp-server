package br.com.vacinapp.server.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.vacinapp.server.dominio.Vacina;
import br.com.vacinapp.server.repository.VacinaRepository;

@RestController
@RequestMapping("/vacinas")
public class VacinaRestController {

	@Autowired
	private VacinaRepository vacinaRepo;
	
	@PostMapping("/new")
	public Vacina inserirVacina(@RequestBody Vacina vacina){
		return vacinaRepo.save(vacina);
	}
	
	@GetMapping
	public List<Vacina> buscarVacinas(){
		return vacinaRepo.findAll();
	}
	
	@GetMapping("/{idVacina}")
	public Vacina buscarVacinaPorId(@PathVariable("idVacina") Long idVacina){
		return vacinaRepo.findOne(idVacina);
	}
	
	@GetMapping("/nome/{nome}")
	public Vacina buscarVacinaPorNome(@PathVariable("nome") String nomeVacina){
		return vacinaRepo.findVacinaByNome(nomeVacina);
	}
	
	@GetMapping("/nome/like/{nome}")
	public List<Vacina> buscarVacinasPorNome(@PathVariable("nome") String nomeVacinaLike){
		return vacinaRepo.buscaVacinaPorNomeLike(nomeVacinaLike);
	}
}
