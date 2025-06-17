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

import br.com.rezende.ecommerce.model.Produto;
import br.com.rezende.ecommerce.model.Variante;
import br.com.rezende.ecommerce.service.variante.IVarianteService;

@RestController
public class VarianteController {
	
	@Autowired
	private IVarianteService service;
	
	@PostMapping("/variantes")
	public ResponseEntity<Variante> adicionar(@RequestBody Variante variante){
		
		Variante v = service.adicionarNova(variante);
		if(v != null) {
			return ResponseEntity.ok(v);
		}
		return ResponseEntity.badRequest().build();
		}
	
	@PutMapping("variantes/{id}")
public ResponseEntity<Variante> alterar(@RequestBody Variante variante, @PathVariable Integer id){
		variante.setId(id);
		Variante v = service.alterarDados(variante);
		if(v != null) {
			return ResponseEntity.ok(v);
		}
		return ResponseEntity.badRequest().build();
		}
	
	@GetMapping("variantes/{id}")
	public ResponseEntity<Variante> recuperarPorId(@RequestBody Variante variante, @PathVariable Integer id){
			variante.setId(id);
			Variante v = service.recuperarPorId(id);
			if(v != null) {
				return ResponseEntity.ok(v);
			}
			return ResponseEntity.badRequest().build();
			}
	

	

@GetMapping("variantes")
public ResponseEntity<List<Variante>> recuperarPorProduto(@RequestParam(name ="idproduto") Integer idproduto){
		Produto p = new Produto();
		p.setId(idproduto);
		
		return ResponseEntity.ok(service.recuperarPorProduto(p));
		
		
		}

}
