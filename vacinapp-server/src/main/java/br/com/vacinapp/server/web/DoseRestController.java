package br.com.vacinapp.server.web;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.vacinapp.server.dominio.Dose;
import br.com.vacinapp.server.repository.DoseRepository;

@RestController
@RequestMapping("/doses")
public class DoseRestController {

	@Autowired
	private DoseRepository doseRepo;
	
	@PostMapping("/new")
	public Dose inserirDose(Dose dose){
		return doseRepo.save(dose);
	}
	
	@PostMapping("/new/many")
	public List<Dose> inserirDosesBatch(List<Dose> doses){
		return doseRepo.save(doses);
	}
	
	@GetMapping
	public List<Dose> buscarDoses(){
		return doseRepo.findAll();
	}
	
	@GetMapping("/{id}")
	public Dose buscarDosePorId(@PathParam("id") Long idDose){
		return doseRepo.findOne(idDose);
	}
	
	@GetMapping("/vacinacao/{id}")
	public List<Dose> buscarDosesPelaVacinacao(Long idVacinacao){
		return doseRepo.buscarDosesPorVacinacao(idVacinacao);
	}
}
