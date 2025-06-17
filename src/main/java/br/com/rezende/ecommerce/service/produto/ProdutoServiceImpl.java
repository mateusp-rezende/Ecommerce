package br.com.rezende.ecommerce.service.produto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.rezende.ecommerce.dao.ProdutoDAO;
import br.com.rezende.ecommerce.model.Categoria;
import br.com.rezende.ecommerce.model.Produto;

@Component
public class ProdutoServiceImpl implements IProdutoService {
	
	@Autowired
	private ProdutoDAO dao;
	@Override
	public Produto cadastrarNovo(Produto novo) {
		// TODO Auto-generated method stub
		return dao.save(novo);
	}

	@Override
	public Produto alterarProduto(Produto produto) {
		// TODO Auto-generated method stub
		return dao.save(produto);
	}

	@Override
	public List<Produto> recuperarTodos() {
		// TODO Auto-generated method stub
		return dao.findByOrderByNomeAsc();
	}

	@Override
	public List<Produto> recuperarPorPalavraChave(String palavraChave) {
		// TODO Auto-generated method stub
		return dao.findByNomeContaining(palavraChave);
	}

	@Override
	public Produto BuscarPeloId(Integer id) {
		// TODO Auto-generated method stub
		return dao.findById(id).orElse(null);
	}

	@Override
	public List<Produto> BuscarPorCategoria(Categoria categoria) {
		// TODO Auto-generated method stub
		return dao.findByCategoriasContaining(categoria);
	}

}
