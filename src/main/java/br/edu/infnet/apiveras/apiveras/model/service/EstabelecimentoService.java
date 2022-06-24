package br.edu.infnet.apiveras.apiveras.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.apiveras.apiveras.model.domain.Estabelecimento;
import br.edu.infnet.apiveras.apiveras.model.repository.EstabelecimentoRepository;

@Service
public class EstabelecimentoService {
	
	@Autowired
	private EstabelecimentoRepository estabelecimentoReposiroty;

	public void incluir(Estabelecimento estabelecimento) {
		
		estabelecimentoReposiroty.save(estabelecimento);

	}

}
