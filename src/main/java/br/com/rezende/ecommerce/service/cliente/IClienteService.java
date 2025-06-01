package br.com.rezende.ecommerce.service.cliente;

import java.util.List;

import br.com.rezende.ecommerce.model.Cliente;

public interface IClienteService {
	public Cliente cadastrarNovoCliente( Cliente novo);
	public Cliente alterarCliente(Cliente cliente);
	public Cliente recuperarClientePorId(Integer id);
	public Cliente recuperarClientePorTelefone(String telefone);
	public List<Cliente> recuperarTodos();
}
