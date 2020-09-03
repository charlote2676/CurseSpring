package br.com.mmdo.projeto_mvc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.mmdo.projeto_mvc.domain.Categoria;
import br.com.mmdo.projeto_mvc.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {
		
		Optional<Categoria> objeto = repo.findById(id);
		
		return objeto.orElse(null);
		
	}

}
