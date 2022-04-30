package pt.meuvizinho.appcomercio;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import pt.meuvizinho.appcomercio.domain.Categoria;
import pt.meuvizinho.appcomercio.domain.Produto;
import pt.meuvizinho.appcomercio.repositories.CategoriaRepository;
import pt.meuvizinho.appcomercio.repositories.ProdutoRepository;

@SpringBootApplication
public class AppcomercioApplication implements CommandLineRunner {

	@Autowired
	private CategoriaRepository categoriaRepository;

	@Autowired
	private ProdutoRepository produtoRepository;

	public static void main(String[] args) {
		SpringApplication.run(AppcomercioApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Categoria cat1 = new Categoria(null, "Prato do dia");
		Categoria cat2 = new Categoria(null, "Prato Entrada");
		Categoria cat3 = new Categoria(null, "Prato Refeição");
		Categoria cat4 = new Categoria(null, "Sobremesa");
		Categoria cat5 = new Categoria(null, "Lanche");
		Categoria cat6 = new Categoria(null, "Bebida");

		Produto p1 = new Produto(null, "Grissini", "grissinos italianos", 2.65);
		Produto p2 = new Produto(null, "Bruschetta al aglio", "Pão de alho", 2.65);
		Produto p3 = new Produto(null, "Antipasto misto", "presunto, salame, espargos e fiambre", 2.65);
		Produto p4 = new Produto(null, "Cicio", "Disco de massa de pizza com azeite e oregãos", 2.65);
		Produto p5 = new Produto(null, "Mozzarella e pommodoro", "Mozzarella, alho, tomate, manjericão fresco e azeite", 2.65);

		Produto p6 = new Produto(null, "Pizza Marguerita", "Molho de tomate, mozzarella e oregãos", 4.55);
		Produto p7 = new Produto(null, "Canelloni di Carne", "Canelloni com recheio de frango e porco picada", 7.85);
		Produto p8 = new Produto(null, "Canelloni di Spinaci", "Canelloni com recheio de requeijão e espinafres", 7.85);
		Produto p9 = new Produto(null, "Lasagna Verde", "Lasanha de massa de espinafres com recheio de carne picada", 7.85);
		Produto p10 = new Produto(null, "Lasagna di Carne", "Lasanha com recheio de carne picada", 7.85);

		Produto p11 = new Produto(null, "Bolo de Chocolate", "Bolo de Chocolate (produção da casa)", 3.55);
		Produto p12 = new Produto(null, "Tiramissu", "Tiramissu (produção da casa)", 5.75);
		Produto p13 = new Produto(null, "Delícia de Maça", "Delícia de Maça (produção da casa)", 6.45);
		Produto p14 = new Produto(null, "Mousse de Chocolate", "Mousse de Chocolate (produção da casa)", 5.75);
		Produto p15 = new Produto(null, "Crepe com Gelado", "Crepe com duas bolas de gelado", 8.35);

		Produto p16 = new Produto(null, "Sandes", "Sandes", 2.50);
		Produto p17 = new Produto(null, "Sandes Mista", "Pão, fiambre e queijo", 2.50);
		Produto p18 = new Produto(null, "Pastel de nata", "Pastel de nata", 2.50);
		Produto p19 = new Produto(null, "Bola de Berlim", "Bola de Berlim", 2.50);
		Produto p20 = new Produto(null, "Mil folhas", "Massa folhada recheada com um creme de confeiteiro", 2.50);

		Produto p21 = new Produto(null, "Água Mineral 500ml", "Água Mineral 500ml", 1.75);
		Produto p22 = new Produto(null, "Suco de Laranja", "Sumo de Laranja", 4.25);
		Produto p23 = new Produto(null, "Limonada", "Sumo de limão", 4.25);
		Produto p24 = new Produto(null, "Taça de Vinho", "Taça de Vinho (vinho da casa)", 4.45);
		Produto p25 = new Produto(null, "Vinho Tinto Periquita 1/2", "Vinho Tinto Periquita 1/2 região do Alentejo", 3.35);

		cat1.getProdutos().addAll(Arrays.asList(p2, p6, p11));
		cat2.getProdutos().addAll(Arrays.asList(p1, p2, p3, p4, p5));
		cat3.getProdutos().addAll(Arrays.asList(p6, p7, p8, p9, p10));
		cat4.getProdutos().addAll(Arrays.asList(p11, p12, p13, p14, p15));
		cat5.getProdutos().addAll(Arrays.asList(p16, p17, p18, p19, p20));
		cat6.getProdutos().addAll(Arrays.asList(p21, p22, p23, p24, p25));

		p1.getCategorias().addAll(Arrays.asList(cat2));
		p2.getCategorias().addAll(Arrays.asList(cat1, cat2));
		p3.getCategorias().addAll(Arrays.asList(cat2));
		p4.getCategorias().addAll(Arrays.asList(cat2));
		p5.getCategorias().addAll(Arrays.asList(cat2));
		p6.getCategorias().addAll(Arrays.asList(cat1, cat3));
		p7.getCategorias().addAll(Arrays.asList(cat3));
		p8.getCategorias().addAll(Arrays.asList(cat3));
		p9.getCategorias().addAll(Arrays.asList(cat3));
		p10.getCategorias().addAll(Arrays.asList(cat3));
		p11.getCategorias().addAll(Arrays.asList(cat1, cat4));
		p12.getCategorias().addAll(Arrays.asList(cat4));
		p13.getCategorias().addAll(Arrays.asList(cat4));
		p14.getCategorias().addAll(Arrays.asList(cat4));
		p15.getCategorias().addAll(Arrays.asList(cat4));
		p16.getCategorias().addAll(Arrays.asList(cat5));
		p17.getCategorias().addAll(Arrays.asList(cat5));
		p18.getCategorias().addAll(Arrays.asList(cat5));
		p19.getCategorias().addAll(Arrays.asList(cat5));
		p20.getCategorias().addAll(Arrays.asList(cat5));
		p21.getCategorias().addAll(Arrays.asList(cat6));
		p22.getCategorias().addAll(Arrays.asList(cat6));
		p23.getCategorias().addAll(Arrays.asList(cat6));
		p24.getCategorias().addAll(Arrays.asList(cat6));
		p25.getCategorias().addAll(Arrays.asList(cat6));

		categoriaRepository.saveAll(Arrays.asList(cat1, cat2, cat3, cat4, cat5, cat6));
		produtoRepository.saveAll(Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16,
				p17, p18, p19, p20, p21, p22, p23, p24, p25));

	}

}
