package br.edu.infnet.apiveras.apiveras.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.infnet.apiveras.apiveras.model.domain.Estabelecimento;
import br.edu.infnet.apiveras.apiveras.model.service.EstabelecimentoService;

@RestController
@RequestMapping(value = "/api/estabelecimento")
public class EstabelecimentoController {
	
	@Autowired
	private EstabelecimentoService estabelecimentoService;
	
	@PostMapping(value = "/incluir")
	public void incluir(@RequestBody Estabelecimento estabelecimento) {
		
		estabelecimentoService.incluir(estabelecimento);
		
	}

}
