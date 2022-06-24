package br.edu.infnet.apiveras.apiveras;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.apiveras.apiveras.model.domain.Usuario;
import br.edu.infnet.apiveras.apiveras.model.service.UsuarioService;

@Order(3)
@Component
public class UsuarioLoader implements ApplicationRunner {
	
	@Autowired
	private UsuarioService usuarioService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("Execucao do loader do Usuario");
		
		Usuario usuario = usuarioService.validar("infnet", "aakhdfmabjgdk");
		
//		usuarioService.excluir(usuario.getId());
		
		System.out.println("Exclusao do usuário " + usuario.getLogin() + " realizada com sucesso.");
	}

}
