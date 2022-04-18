package pt.meuvizinho.appcomercio.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import pt.meuvizinho.appcomercio.domain.Categoria;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResource {

	@RequestMapping(method = RequestMethod.GET)
	public List<Categoria> listar() {

		Categoria cat1 = new Categoria(1, "Prato do dia");
		Categoria cat2 = new Categoria(2, "Prato Entrada");
		Categoria cat3 = new Categoria(3, "Prato Refeição");
		Categoria cat4 = new Categoria(4, "Sobremesa");
		Categoria cat5 = new Categoria(5, "Lanche");
		Categoria cat6 = new Categoria(6, "Bebida");

		List<Categoria> lista = new ArrayList<>();
		lista.add(cat1);
		lista.add(cat2);
		lista.add(cat3);
		lista.add(cat4);
		lista.add(cat5);
		lista.add(cat6);

		return lista;
	}

}
