package pt.meuvizinho.appcomercio.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import pt.meuvizinho.appcomercio.domain.Produto;
import pt.meuvizinho.appcomercio.services.ProdutoService;

@CrossOrigin
@RestController
@RequestMapping(value = "/produtos")
public class ProdutoResource {

	@Autowired
	private ProdutoService service;

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Produto> find(@PathVariable Integer id) {

		Produto obj = service.find(id);
		return ResponseEntity.ok(obj);
	}

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Produto>> findALL() {
		List<Produto> lista = service.findAll();

		return ResponseEntity.ok(lista);
	}
}