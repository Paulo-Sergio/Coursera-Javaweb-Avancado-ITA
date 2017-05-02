package tarefa2.lambda;

public class Produto {

	private String nome;
	private int valor;

	public Produto(String nome, int valor) {
		this.nome = nome;
		this.valor = valor;
	}

	public void darDesconto() {
		valor = valor * 90 / 100;
	}

	public boolean caro() {
		return this.valor > 200;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", valor=" + valor + "]";
	}

}
