package br.com.mmdo.projeto_mvc;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import br.com.mmdo.projeto_mvc.domain.Categoria;
import br.com.mmdo.projeto_mvc.repositories.CategoriaRepository;

@Component
public class MyRunner implements CommandLineRunner{
	
	@Autowired
    private CategoriaRepository repository;

	@Override
	public void run(String... args) throws Exception {
		
		Categoria  cat1 = new Categoria(null, "Informatica");
		Categoria  cat2 = new  Categoria(null, "Escritotio");
		
		repository.saveAll(Arrays.asList(cat1,cat2));

	
	}
	
	 

}
