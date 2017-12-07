package br.com.vacinapp.server.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.vacinapp.server.dominio.Vacinacao;
import br.com.vacinapp.server.repository.DoseRepository;
import br.com.vacinapp.server.repository.VacinacaoRepository;

@RestController
@RequestMapping("/vacinacoes")
public class VacinacaoRestController {

	@Autowired
	private VacinacaoRepository vacinacaoRepo;
	@Autowired
	private DoseRepository doseRepo;
	
	@PostMapping("/new")
	public Vacinacao inserirVacinacao(Vacinacao vacinacao){		
		Vacinacao vacinacaoAux = vacinacaoRepo.save(vacinacao);
		
		if(vacinacao.getDoses() != null && vacinacao.getDoses().size() > 0){
			int index = 0;
			while(index < vacinacao.getDoses().size()){
				vacinacao.getDoses().get(index).setVacinacao(vacinacaoAux);
				index++;
			}
			
			doseRepo.save(vacinacao.getDoses());			
		}
		return vacinacaoAux;
	}
	
	@GetMapping
	public List<Vacinacao> listarVacinacoes(){
		return vacinacaoRepo.findAll();
	}
	
	@GetMapping("/{id}")
	public Vacinacao buscarVacinacaoPorId(Long idVacinacao){
		return vacinacaoRepo.findOne(idVacinacao);
	}
	
	@GetMapping("/carteira/{id}")
	public List<Vacinacao> buscarVacinacoesPelaCarteira(@PathVariable("id") Long idCarteira){
		return vacinacaoRepo.buscarVacinacoesPorCarteira(idCarteira);
	}
}
