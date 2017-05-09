package tarefafinal;

import java.util.List;

import tarefafinal.dao.UsuarioDAO;
import tarefafinal.model.Usuario;

public class Principal {

	public static void main(String[] args) {
		// adicionarPontos();
		listarRanking();
		// inserir();
		// recuperar();
	}

	private static void listarRanking() {
		List<Usuario> ranking = new UsuarioDAO().ranking();
		ranking.forEach(System.out::println);
	}

	private static void inserir() {
		Usuario u = new Usuario();
		u.setLogin("paulo");
		u.setEmail("franca@hotmail.com");
		u.setNome("Paulo França");
		u.setSenha("123");
		u.setPontos(25);

		new UsuarioDAO().inserir(u);
	}

	private static void adicionarPontos() {
		new UsuarioDAO().adicionarPontos("duda", 5);
	}

	private static void recuperar() {
		Usuario usuario = new UsuarioDAO().recuperar("duda");
		System.out.println(usuario);
	}
}
