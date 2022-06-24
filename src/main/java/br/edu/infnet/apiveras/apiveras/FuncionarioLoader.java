package br.edu.infnet.apiveras.apiveras;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.apiveras.apiveras.model.domain.Estabelecimento;
import br.edu.infnet.apiveras.apiveras.model.domain.Funcionario;
import br.edu.infnet.apiveras.apiveras.model.service.FuncionarioService;
import br.edu.infnet.apiveras.apiveras.model.service.UsuarioService;

@Order(2)
@Component
public class FuncionarioLoader implements ApplicationRunner {
	
	@Autowired
	private FuncionarioService funcionarioService;
	
	@Autowired
	private UsuarioService usuarioService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("[INFO]:::::::::::::::::::::::::::::: Execucao do loader do funcionario");
		
		Funcionario funcionario = null;

		try {
			
//			Estabelecimento estabelecimento = new Estabelecimento();
//			estabelecimento.setId(1);
			
			Estabelecimento estabelecimento = (Estabelecimento) usuarioService.validar("infnet", "aakhdfmabjgdk");
					
			funcionario = new Funcionario();
			funcionario.setCpf("101.772.497-06");
			funcionario.setEmail("alessandro.veras@gmail.com");
			funcionario.setTelefone("(21) 99999-00000");
			funcionario.setLogin("alessandro.veras");
			funcionario.setNome("Alessandro Veras");
			funcionario.setSenha("uujajahyyag");
			funcionario.setEstabelecimento(estabelecimento);
			
			funcionarioService.incluir(funcionario);
			
			System.out.println("Inclusao de funcionario realizada com sucesso");

		} catch (Exception e) {
			System.out.println("[ERROR] Inpossivel realziar a inclusão do funcionario");
			System.out.println("");
		}
		
	}

}
