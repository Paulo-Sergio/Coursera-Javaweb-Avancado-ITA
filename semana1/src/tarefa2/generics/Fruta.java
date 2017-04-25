package tarefa2.generics;

public class Fruta {

	protected String nome;

	public Fruta(String nome) {
		super();
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Fruta [nome=" + this.nome + "]";
	}
}
