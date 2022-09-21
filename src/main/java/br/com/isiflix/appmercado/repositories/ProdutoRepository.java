package br.com.isiflix.appmercado.repositories;

import br.com.isiflix.appmercado.models.Produto;
import org.springframework.data.repository.CrudRepository;

public interface ProdutoRepository extends CrudRepository<Produto, Integer> {

}