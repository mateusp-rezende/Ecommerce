package br.com.rezende.ecommerce.service.variante;

import java.util.List;

import br.com.rezende.ecommerce.model.Produto;
import br.com.rezende.ecommerce.model.Variante;

public interface IVarianteService {
	public Variante adicionarNova(Variante nova);
	public Variante alterarDados(Variante variante);
	public List<Variante> recuperarPorProduto(Produto produto);
	public Variante recuperarPorId(Integer id);
}
