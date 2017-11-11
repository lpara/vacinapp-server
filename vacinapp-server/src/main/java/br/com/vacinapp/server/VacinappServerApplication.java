package br.com.vacinapp.server;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import br.com.vacinapp.server.dominio.Pessoa;
import br.com.vacinapp.server.dominio.Usuario;
import br.com.vacinapp.server.dominio.Vacina;
import br.com.vacinapp.server.repository.PessoaRepository;
import br.com.vacinapp.server.repository.UsuarioRepository;
import br.com.vacinapp.server.repository.VacinaRepository;

@SpringBootApplication
public class VacinappServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(VacinappServerApplication.class, args);
	}

	 //Somente para testar se a massa está sendo inserida no banco
	
	@Bean
	public InitializingBean bean(UsuarioRepository usuarioRepo){	
		return () -> {
		//PessoaRepository pessoaRepo
		//VacinaRepository vacinaRepo
		//UsuarioRepository usuarioRepo
		List<Vacina> vacinas = new ArrayList<Vacina>();
		
		int conjuntoInsercao = 3;
		
		switch (conjuntoInsercao) {
		case 1:
			//Carregando Vacinas
			Vacina vacinaUm = new Vacina();
			vacinaUm.setNome("Antitetânica");
			vacinaUm.setRenovavel(true);
			vacinas.add(vacinaUm);
			
			Vacina vacinaDois = new Vacina();
			vacinaDois.setNome("Febre Amarela");
			vacinaDois.setRenovavel(false);
			vacinas.add(vacinaDois);
			
			Vacina vacinaTres = new Vacina();
			vacinaTres.setNome("Tríplice Viral");
			vacinaTres.setRenovavel(false);
			vacinas.add(vacinaTres);
			
			//vacinaRepo.save(vacinas);
			break;
			
		case 2:
			Pessoa pessoaUm = new Pessoa();
			pessoaUm.setNome("LP");
			pessoaUm.setDataNascimento(new Date());
			//pessoaRepo.save(pessoaUm);
			break;
			
		case 3:
			Usuario usuarioUm = new Usuario();
			usuarioUm.setLogin("lpara2");
			usuarioUm.setSenha("teste");
			Pessoa p = new Pessoa();
			p.setId(1L);
			usuarioUm.setPessoa(p);
			usuarioRepo.save(usuarioUm);
			
			break;

		default:
			break;
		}
		
		
		//Carregando Pessoa
		
		};	
		
	}
	
}
