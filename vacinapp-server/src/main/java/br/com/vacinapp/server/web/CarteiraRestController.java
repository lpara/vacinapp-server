package br.com.vacinapp.server.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.vacinapp.server.dominio.Carteira;
import br.com.vacinapp.server.repository.CarteiraRepository;

@RestController
@RequestMapping("/carteiras")
public class CarteiraRestController {

	@Autowired
	private CarteiraRepository carteiraRepo;
	
	@PostMapping("/new")
	public Carteira inserirCarteira(Carteira carteira){
		return carteiraRepo.save(carteira);
	}
	
	@GetMapping
	public List<Carteira> listarCarteiras(){
		return carteiraRepo.findAll();
	}
	
	@GetMapping("/{id}")
	public Carteira buscarCarteiraPorId(@PathVariable("id") Long idCarteira){
		return carteiraRepo.findOne(idCarteira);
	}
	
	@GetMapping("/pessoa/{id}")
	public Carteira buscarCarteiraPelaPessoa(@PathVariable("id") Long idPessoa){
		return carteiraRepo.buscarCarteiraPorPessoa(idPessoa);
	}
}
