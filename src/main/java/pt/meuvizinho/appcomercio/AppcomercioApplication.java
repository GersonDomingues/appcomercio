package pt.meuvizinho.appcomercio;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import pt.meuvizinho.appcomercio.domain.Categoria;
import pt.meuvizinho.appcomercio.repositories.CategoriaRepository;

@SpringBootApplication
public class AppcomercioApplication implements CommandLineRunner {
	
	@Autowired
	private CategoriaRepository categoriaRepository;

	public static void main(String[] args) {
		SpringApplication.run(AppcomercioApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Categoria cat1 = new Categoria(1, "Prato do dia");
		Categoria cat2 = new Categoria(2, "Prato Entrada");
		Categoria cat3 = new Categoria(3, "Prato Refeição");
		Categoria cat4 = new Categoria(4, "Sobremesa");
		Categoria cat5 = new Categoria(5, "Lanche");
		Categoria cat6 = new Categoria(6, "Bebida");

		categoriaRepository.saveAll(Arrays.asList(cat1, cat2, cat3, cat4, cat5, cat6)); 
		
	}

}
