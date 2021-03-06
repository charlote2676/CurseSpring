package br.com.mmdo.projeto_mvc;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import br.com.mmdo.projeto_mvc.domain.Categoria;
import br.com.mmdo.projeto_mvc.domain.Produto;
import br.com.mmdo.projeto_mvc.repositories.CategoriaRepository;
import br.com.mmdo.projeto_mvc.repositories.ProdutoRepository;

@Component
public class MyRunner implements CommandLineRunner{
	
	@Autowired
    private CategoriaRepository repository;
	
	@Autowired
	private ProdutoRepository produtoRepository;

	@Override
	public void run(String... args) throws Exception {
		
		Categoria  cat1 = new Categoria(null, "Informatica");
		Categoria  cat2 = new Categoria(null, "Escritotio");
		
		Produto  p1 = new Produto(null,"Computador",2000.00);
		Produto  p2 = new Produto(null,"Impressora",800.00);
		Produto  p3 = new Produto(null,"Mouse",80.00);
		
		cat1.getProdutos().addAll(Arrays.asList(p1,p2,p3));
		cat2.getProdutos().addAll(Arrays.asList(p2));
		
		p1.getCategorias().addAll(Arrays.asList(cat1));
		p2.getCategorias().addAll(Arrays.asList(cat1,cat2));
		p3.getCategorias().addAll(Arrays.asList(cat1));
		
		repository.saveAll(Arrays.asList(cat1,cat2));
		produtoRepository.saveAll(Arrays.asList(p1,p2,p3));

	
	}
	
	 

}
