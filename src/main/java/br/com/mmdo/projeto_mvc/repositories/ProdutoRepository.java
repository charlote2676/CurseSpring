package br.com.mmdo.projeto_mvc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.mmdo.projeto_mvc.domain.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto,Integer> {

}
