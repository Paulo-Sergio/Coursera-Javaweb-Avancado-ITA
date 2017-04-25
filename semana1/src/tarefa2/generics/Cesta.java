package tarefa2.generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

public class Cesta<E> {

	private List<E> lista = new ArrayList<>();

	public void adiciona(E elemento) {
		this.lista.add(elemento);
	}

	public E retira() {
		Random r = new Random(System.currentTimeMillis());
		return this.lista.remove(r.nextInt(this.lista.size()));
	}

	public boolean temItens() {
		return !this.lista.isEmpty();
	}

	public void adicionaTodos(Collection<? extends E> elementos) {
		for (E elemento : elementos) {
			this.adiciona(elemento);
		}
	}
}
