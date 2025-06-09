package br.com.rezende.ecommerce.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.com.rezende.ecommerce.model.Categoria;

public interface CategoriaDAO extends CrudRepository<Categoria, Integer> {
	public List<Categoria> findAllByOrderByNomeAsc();
}
