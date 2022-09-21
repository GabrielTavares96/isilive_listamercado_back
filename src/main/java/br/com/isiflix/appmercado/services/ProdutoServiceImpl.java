package br.com.isiflix.appmercado.services;

import br.com.isiflix.appmercado.models.Produto;
import br.com.isiflix.appmercado.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProdutoServiceImpl implements IProdutoService{

    @Autowired
    private ProdutoRepository repo;

    @Override
    public Produto criarNovoProduto(Produto prod) {
        // TODO Auto-generated method stub
        return repo.save(prod);
    }

    @Override
    public Produto alterarProduto(Produto prod) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Produto> listarTodos() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Produto> buscarPorPalavraChave(String key) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Produto buscarPorId(Integer id) {
        // TODO Auto-generated method stub
        return null;
    }

}
