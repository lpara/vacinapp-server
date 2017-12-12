package br.com.vacinapp.server.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.vacinapp.server.dominio.Usuario;
import br.com.vacinapp.server.repository.UsuarioRepository;

@RestController
@RequestMapping("/usuarios")
public class UsuarioRestController {

	@Autowired
	private UsuarioRepository usuarioRepo;
	
	@PostMapping("/new")
	public Usuario inserirUsuario(@RequestBody Usuario usuario){
		return usuarioRepo.save(usuario);
	}
	
	@GetMapping
	public List<Usuario> buscarUsuarios(){
		return usuarioRepo.findAll();
	}
	
	@GetMapping("/{id}")
	public Usuario buscarUsuarioPorId(Long idUsuario){
		return usuarioRepo.findOne(idUsuario);
	}
	
	@GetMapping("/login/{login}")
	public Usuario buscarUsuarioPorLogin(@PathVariable("login") String login){
		return usuarioRepo.findUsuarioByLogin(login);
	}
}
