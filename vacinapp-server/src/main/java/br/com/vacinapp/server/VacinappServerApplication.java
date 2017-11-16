package br.com.vacinapp.server;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import br.com.vacinapp.server.dominio.Doenca;
import br.com.vacinapp.server.dominio.Pessoa;
import br.com.vacinapp.server.dominio.Usuario;
import br.com.vacinapp.server.dominio.Vacina;
import br.com.vacinapp.server.repository.DoencasRepository;
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
	public InitializingBean beanVacina(VacinaRepository vacinaRepo){	
		return () -> {
			List<Vacina> vacinas = new ArrayList<Vacina>();
			
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
			
			vacinaRepo.save(vacinas);		
		};	
	}
	
	@Bean
	public InitializingBean beanPessoa (PessoaRepository pessoaRepo){	
		return () -> {
			List<Pessoa> pessoas = new ArrayList<Pessoa>();
			
			Pessoa pessoaUm = new Pessoa();
			pessoaUm.setNome("LP");
			pessoaUm.setDataNascimento(new Date());
			pessoas.add(pessoaUm);
			
			Pessoa pessoaDois = new Pessoa();
			pessoaDois.setNome("RenaPoli");
			pessoaDois.setDataNascimento(new Date());
			pessoas.add(pessoaDois);
			
			
			pessoaRepo.save(pessoas);
		};
	}
	
	
	@Bean
	public InitializingBean beanUsuario (UsuarioRepository usuarioRepo){	
		return () -> {
			List<Usuario> usuarios = new ArrayList<Usuario>();
			
			Usuario usuarioUm = new Usuario();
			usuarioUm.setLogin("lpara");
			usuarioUm.setSenha("teste");
			Pessoa p = new Pessoa();
			p.setId(1L);
			usuarioUm.setPessoa(p);
			usuarios.add(usuarioUm);
			
			Usuario usuarioDois = new Usuario();
			usuarioDois.setLogin("rena");
			usuarioDois.setSenha("teste");
			Pessoa p2 = new Pessoa();
			p2.setId(2L);
			usuarioDois.setPessoa(p2);
			usuarios.add(usuarioDois);
			
			usuarioRepo.save(usuarios);
		};
	}

	@Bean
	public InitializingBean beanDoenca (DoencasRepository doencaRepo){	
		return () -> {
			List<Doenca> doencas = new ArrayList<Doenca>();
			
			Doenca doencaUm = new Doenca();
			doencaUm.setNome("Tetano");
			Vacina vacinaNovaUm = new Vacina();
			vacinaNovaUm.setId(1L);
			doencaUm.setVacina(vacinaNovaUm);
			doencas.add(doencaUm);
			
			Doenca doencaDois = new Doenca();
			doencaDois.setNome("Febre Amarela");
			Vacina vacinaNovaDois = new Vacina();
			vacinaNovaDois.setId(2L);
			doencaDois.setVacina(vacinaNovaDois);
			doencas.add(doencaDois);
			
			Doenca doencaTres = new Doenca();
			doencaTres.setNome("Sarampo");
			Vacina vacinaNovaTres = new Vacina();
			vacinaNovaTres.setId(3L);
			doencaTres.setVacina(vacinaNovaTres);
			doencas.add(doencaTres);
			
			Doenca doencaQuatro = new Doenca();
			doencaQuatro.setNome("Caxumba");
			doencaQuatro.setVacina(vacinaNovaTres);
			doencas.add(doencaQuatro);
			
			Doenca doencaCinco = new Doenca();
			doencaCinco.setNome("Rubéola");
			doencaCinco.setVacina(vacinaNovaTres);
			doencas.add(doencaCinco);
			
			doencaRepo.save(doencas);
		};
	}
}
