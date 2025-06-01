package br.com.rezende.ecommerce.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.rezende.ecommerce.model.Cliente;

public interface ClienteDAO extends CrudRepository<Cliente, Integer> {
	
	public Cliente findByTelefone(String telefone);
}
