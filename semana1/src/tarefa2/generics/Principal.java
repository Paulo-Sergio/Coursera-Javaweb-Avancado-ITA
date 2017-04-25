package tarefa2.generics;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		
		Cesta<Fruta> cesta = new Cesta<>();
		cesta.adiciona(new Fruta("Maça"));
		cesta.adiciona(new Fruta("Banana"));
		cesta.adiciona(new Fruta("Mamão"));
		cesta.adiciona(new Fruta("Pera"));
		cesta.adiciona(new Fruta("Uva"));
		cesta.adiciona(new FrutaVermelha("Morango"));
		
		List<FrutaVermelha> vermelhas = new ArrayList<>();
		vermelhas.add(new FrutaVermelha("Amora"));
		vermelhas.add(new FrutaVermelha("Cereja"));
		
		cesta.adicionaTodos(vermelhas);
		
		while (cesta.temItens()) {
			System.out.println(cesta.retira());
		}
	}
}
