package pt.meuvizinho.appcomercio.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pt.meuvizinho.appcomercio.domain.Categoria;
import pt.meuvizinho.appcomercio.repositories.CategoriaRepository;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repo;

	public Categoria find(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElse(null);
	}

	public List<Categoria> findAll() {
		return repo.findAll();
	}

}