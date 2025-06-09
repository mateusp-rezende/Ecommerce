package br.com.rezende.ecommerce.service.categoria;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.rezende.ecommerce.dao.CategoriaDAO;
import br.com.rezende.ecommerce.model.Categoria;

@Component
public class ICategoriaServiceImpl implements ICategoriaService {
	@Autowired
	private CategoriaDAO dao;
	@Override
	public Categoria criarNova(Categoria nova) {
		
		return  dao.save(nova);
	}

	@Override
	public Categoria alterar(Categoria categoria) {
		// TODO Auto-generated method stub
		return  dao.save(categoria);
	}

	@Override
	public List<Categoria> listarTudo() {
		// TODO Auto-generated method stub
		return dao.findAllByOrderByNomeAsc();
	}
	@Override
	public void apagarCategoria(Integer id) {
		
		 dao.deleteById(id);
	}


	
}
