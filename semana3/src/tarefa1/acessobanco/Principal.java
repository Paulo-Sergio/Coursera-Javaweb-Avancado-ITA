package tarefa1.acessobanco;

import java.util.List;

import tarefa1.acessobanco.dao.UsuarioDAO;
import tarefa1.acessobanco.model.UsuarioTeste;

public class Principal {

	public static void main(String[] args) {
		//listarTodos();
		inserirUsuario();
	}

	private static void listarTodos() {
		List<UsuarioTeste> lista = UsuarioDAO.todosUsuarios();
		lista.forEach(System.out::println);
	}
	
	private static void inserirUsuario() {
		UsuarioTeste u = new UsuarioTeste();
		u.setLogin("duda");
		u.setNome("Maria Eduarda");
		u.setEmail("duda@gmail.com");
		
		UsuarioDAO.inserirUsuario(u);
	}
}
