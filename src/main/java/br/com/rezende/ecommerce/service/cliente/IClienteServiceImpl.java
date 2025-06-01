package br.com.rezende.ecommerce.service.cliente;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.rezende.ecommerce.dao.ClienteDAO;
import br.com.rezende.ecommerce.model.Cliente;

@Component
public class IClienteServiceImpl implements IClienteService {
	
	@Autowired // Anotacao do Spring que injeta dependencias automaticamente.
	private ClienteDAO clienteDao;//interface de acesso aos dados
	
	@Override
	public Cliente cadastrarNovoCliente(Cliente novo) {
		// TODO Auto-generated method stub
		return clienteDao.save(novo);
	}

	@Override
	public Cliente alterarCliente(Cliente cliente) {
		// TODO Auto-generated method stub
		return clienteDao.save(cliente);
	}

	@Override
	public Cliente recuperarClientePorId(Integer id) {
		// TODO Auto-generated method stub
		return clienteDao.findById(id).orElse(null);
	}

	@Override
	public Cliente recuperarClientePorTelefone(String telefone) {
		// TODO Auto-generated method stub
		return clienteDao.findByTelefone(telefone);
	}

	@Override
	public List<Cliente> recuperarTodos() {
		// Pega todos os clientes do banco e converte para List<Cliente>
		return (List<Cliente>)clienteDao.findAll();
	}

}
