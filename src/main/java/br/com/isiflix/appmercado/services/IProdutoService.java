package br.com.isiflix.appmercado.services;

import br.com.isiflix.appmercado.models.Produto;

import java.util.List;


public interface IProdutoService {
    public Produto criarNovoProduto(Produto prod);

    public Produto alterarProduto(Produto prod);

    public List<Produto> listarTodos();

    public List<Produto> buscarPorPalavraChave(String key);

    public Produto buscarPorId(Integer id);

}
