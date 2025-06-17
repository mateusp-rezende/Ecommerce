package br.com.rezende.ecommerce.service.produto;

import java.util.List;

import br.com.rezende.ecommerce.model.Categoria;
import br.com.rezende.ecommerce.model.Produto;

public interface IProdutoService {
	public Produto cadastrarNovo(Produto novo);
	public Produto alterarProduto(Produto produto);
	public Produto BuscarPeloId(Integer id);
	public List<Produto> recuperarTodos();
	
	public List<Produto> BuscarPorCategoria(Categoria categoria);
	public List<Produto> recuperarPorPalavraChave(String palavraChave);
	
}
