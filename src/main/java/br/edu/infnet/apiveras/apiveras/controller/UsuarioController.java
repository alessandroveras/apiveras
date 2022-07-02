package br.edu.infnet.apiveras.apiveras.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.edu.infnet.apiveras.apiveras.model.domain.Usuario;
import br.edu.infnet.apiveras.apiveras.model.service.UsuarioService;

@RestController
@RequestMapping("/api/usuario")
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;

	@PostMapping(value = "/validar")
	public Usuario validar(@RequestParam String login, @RequestParam String senha) {
		return usuarioService.validar(login, senha);
	}

	@GetMapping(value = "/listar")
	public List<Usuario> obterLista() {
		return usuarioService.obterLista();
	}

	@DeleteMapping(value = "/{id}/excluir")
	public void excluir(@PathVariable Integer id) {
		usuarioService.excluir(id);
	}

}
