package br.com.rezende.ecommerce.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.com.rezende.ecommerce.model.Produto;
import br.com.rezende.ecommerce.model.Variante;

public interface VarianteDAO extends CrudRepository<Variante, Integer> {
	
	public List<Variante> findByProduto(Produto produto);
}
