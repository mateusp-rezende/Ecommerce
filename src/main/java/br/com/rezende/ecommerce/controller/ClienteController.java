package br.com.rezende.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.rezende.ecommerce.model.Cliente;
import br.com.rezende.ecommerce.service.cliente.IClienteService;


@RestController
public class ClienteController {
	
	/*
	 *   /clientes          GET    --recupera tudo
	 *   /clientes/id       GET    --recupera pelo ID
	 *   /clientes          POST   -- inclui novo cliente
	 *   /clientes/id       PUT    -- altera cliente com ID especifico
	 *   /clientes/telefone GET    -- busca pelo telefone
	 * */
	
	@Autowired 
	private IClienteService clienteService;
	
	@GetMapping("/clientes")
	public ResponseEntity<List<Cliente>> getAll(){
		return ResponseEntity.ok(clienteService.recuperarTodos());
	}
	
	@GetMapping("/clientes/{id}")
	public ResponseEntity<Cliente> getById(@PathVariable Integer id){
		Cliente resultado = clienteService.recuperarClientePorId(id);
		if(resultado != null) {
			return ResponseEntity.ok(resultado);
		}
		return ResponseEntity.notFound().build();
	}
	
	@GetMapping("/clientes/telefone")
    public ResponseEntity<Cliente> getByTelefone(@RequestParam(name="valor") String telefone) {
        Cliente resultado = clienteService.recuperarClientePorTelefone(telefone);
        if (resultado != null) {
            return ResponseEntity.ok(resultado);
        }
        return ResponseEntity.notFound().build();
    }
	
	@PostMapping("/clientes")
	public ResponseEntity<Cliente> insertNew(@RequestBody Cliente novo){
		try{
			Cliente resultado = clienteService.cadastrarNovoCliente(novo);
            if(resultado != null) {
            	return ResponseEntity.status(201).body(resultado);
            }
            return ResponseEntity.badRequest().build();
        } 
		catch (Exception ex) {
        	System.out.println("LOG - Erro ao cadastrar -" +ex.getMessage());
    }
        return ResponseEntity.badRequest().build();
		
	}
	
	@PutMapping("/clientes/{id}")
	public ResponseEntity<Cliente> update(@RequestBody Cliente cliente, @PathVariable Integer id){
	
		cliente.setId(id);
		try{
			Cliente resultado = clienteService.alterarCliente(cliente);
            if(resultado != null) {
            	return ResponseEntity.ok(resultado);
            }
            return ResponseEntity.badRequest().build();
        } 
		catch (Exception ex) {
        	System.out.println("LOG - Erro ao atualizar -" +ex.getMessage());
    }
        return ResponseEntity.badRequest().build();
		
	}
	
}
