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

import br.com.rezende.ecommerce.service.produto.IProdutoService;
import br.com.rezende.ecommerce.model.Categoria;
import br.com.rezende.ecommerce.model.Produto;
@RestController
public class ProdutoController {
	
	@Autowired
	private IProdutoService service;
	
	@GetMapping("/produtos")
	public ResponseEntity<List<Produto>> recuperarTodos(){
		return ResponseEntity.ok(service.recuperarTodos());
	}
	
	@GetMapping("/produtos/{id}")
	public ResponseEntity<Produto> recuperarPeloId(@PathVariable Integer id){
		
		Produto resultado = service.BuscarPeloId(id);
		
		if(resultado != null) {
			return ResponseEntity.ok(resultado);
		}
		return ResponseEntity.notFound().build();
	}
	
	@PostMapping("/produtos")
	public ResponseEntity<Produto> incluirNovo(@RequestBody Produto novo){
		
		Produto resultado = service.cadastrarNovo(novo);
		
		if(resultado != null) {
			return ResponseEntity.status(201).body(resultado);
		}
		return ResponseEntity.badRequest().build();
	}
	
	@PutMapping("/produtos/{id}")
	public ResponseEntity<Produto> alterarProduto(@RequestBody Produto novo, @PathVariable Integer id){
		novo.setId(id);
		Produto resultado = service.alterarProduto(novo);
		
		if(resultado != null) {
			return ResponseEntity.status(201).body(resultado);
		}
		return ResponseEntity.badRequest().build();
	}
	
	@GetMapping("/produtos/buscar")
	public ResponseEntity<List<Produto>> recuperarPorPalavraChave(@RequestParam(name ="key") String key){
		
		List<Produto> lista = service.recuperarPorPalavraChave(key);
		if(lista.size() > 0 ) {
			return ResponseEntity.ok(lista);
		}
		
		return ResponseEntity.notFound().build();
		
	}
	
	@GetMapping("/produtos/categoria/{id}")
public ResponseEntity<List<Produto>> recuperarPorCategoria(@PathVariable Integer id){
		
		Categoria categoria = new Categoria();
		categoria.setId(id);
		
		return ResponseEntity.ok(service.BuscarPorCategoria(categoria));
		
	}
}
