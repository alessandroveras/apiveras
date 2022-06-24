package br.edu.infnet.apiveras.apiveras;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.apiveras.apiveras.model.domain.Estabelecimento;
import br.edu.infnet.apiveras.apiveras.model.service.EstabelecimentoService;

@Order(1)
@Component
public class EstabelecimentoLoader implements ApplicationRunner {

	@Autowired
	private EstabelecimentoService estabelecimentoService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		System.out.println("[INFO]:::::::::::::::::::::::::::::: Execucao do loader do estabelecimento");
		Estabelecimento estabelecimento = null;

		try {
			estabelecimento = new Estabelecimento();
			estabelecimento.setCnpj("00.673.757/0001-46");
			estabelecimento.setEdtech(true);
			estabelecimento.setEndereco("Rua Sao José, 90");
			estabelecimento.setLogin("infnet");
			estabelecimento.setNome("Instituto Infnet");
			estabelecimento.setSenha("aakhdfmabjgdk");
			
			estabelecimentoService.incluir(estabelecimento);
			
			System.out.println("Inclusao de estabelecimento realizada com sucesso");

		} catch (Exception e) {
			System.out.println("[ERROR] Inpossivel realziar a inclusão do estabelecimento");
			System.out.println("");
		}

	}

}