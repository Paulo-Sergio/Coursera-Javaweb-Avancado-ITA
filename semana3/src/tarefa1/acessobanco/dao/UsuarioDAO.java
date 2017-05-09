package tarefa1.acessobanco.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import tarefa1.acessobanco.model.UsuarioTeste;

public class UsuarioDAO {

	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static List<UsuarioTeste> todosUsuarios() {
		List<UsuarioTeste> todos = new ArrayList<UsuarioTeste>();

		try (Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/coursera_usuarios", "root", "")) {

			String sql = "SELECT * FROM usuario_teste";
			PreparedStatement stmt = c.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				UsuarioTeste u = new UsuarioTeste();
				u.setLogin(rs.getString("login"));
				u.setNome(rs.getString("nome"));
				u.setEmail(rs.getString("email"));

				todos.add(u);
			}

		} catch (SQLException e) {
			throw new RuntimeException("Não foi possivel executar o acesso", e);
		}

		return todos;
	}

	public static void inserirUsuario(UsuarioTeste u) {
		try (Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/coursera_usuarios", "root", "")) {

			String sql = "INSERT INTO usuario_teste () VALUES (?,?,?)";
			PreparedStatement stmt = c.prepareStatement(sql);
			stmt.setString(1, u.getLogin());
			stmt.setString(2, u.getNome());
			stmt.setString(3, u.getEmail());
			
			stmt.executeUpdate();

		} catch (SQLException e) {
			throw new RuntimeException("Não foi possivel executar o acesso", e);
		}
	}
}
