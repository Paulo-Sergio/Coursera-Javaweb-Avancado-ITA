package tarefa2.lambda;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {

		List<Produto> lista = new ArrayList<Produto>();
		lista.add(new Produto("Tenis", 300));
		lista.add(new Produto("Camiseta", 80));
		lista.add(new Produto("Cinto", 50));

		// lista.forEach(p -> p.darDesconto());
		// lista.forEach(Produto::darDesconto);

		// lista.forEach(p -> System.out.println(p));
		// lista.forEach(System.out::println);

		Carrinho c = new Carrinho(lista);
		c.darDesconto(10, Produto::caro);

		c.getLista().forEach(System.out::println);
	}

}
