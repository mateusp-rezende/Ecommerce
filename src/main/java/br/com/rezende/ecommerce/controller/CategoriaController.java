package br.com.rezende.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.rezende.ecommerce.model.Categoria;
import br.com.rezende.ecommerce.service.categoria.ICategoriaService;

@RestController
public class CategoriaController {
	/*
	 *   /categorias         GET    --recupera tudo
	 *   /categorias/id       GET    --recupera pelo ID
	 *   /categorias          POST   -- inclui novo cliente
	 *   /categorias/id       PUT    -- altera categoria com ID especifico
	 *   
	 * */
	@Autowired
	private ICategoriaService service;
	
	@GetMapping("/categorias")
	public ResponseEntity<List<Categoria>>  recuperarTodas(){
		return ResponseEntity.ok(service.listarTudo()); 
	}
	@PostMapping("/categorias")
	public ResponseEntity<Categoria>  adicionarNova(@RequestBody Categoria nova){
		Categoria resultado = service.criarNova(nova);
		if(resultado != null) {
			return ResponseEntity.status(201).body(resultado);
		}
		return ResponseEntity.badRequest().build();
	}
	
	@PutMapping("/categorias/{id}")
	public ResponseEntity<Categoria>  alterarCategoria(@RequestBody Categoria categoria, @PathVariable  Integer id){
		categoria.setId(id);
		Categoria resultado = service.alterar(categoria);
		if(resultado != null) {
			return ResponseEntity.status(201).body(resultado);
		}
		return ResponseEntity.badRequest().build();
	}
	@DeleteMapping("/categorias/{id}")
	public ResponseEntity<?> removerCategoria(@PathVariable Integer id){
		service.apagarCategoria(id);
		return ResponseEntity.ok("REMOVIDO");
	}
	
}
