package tarefafinal.teste;

import static org.junit.Assert.assertEquals;

import java.sql.SQLException;
import java.util.List;

import org.dbunit.Assertion;
import org.dbunit.JdbcDatabaseTester;
import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.ITable;
import org.dbunit.util.fileloader.FlatXmlDataFileLoader;
import org.junit.Before;
import org.junit.Test;

import tarefafinal.dao.UsuarioDAO;
import tarefafinal.model.Usuario;

public class TesteUsuarioDAO {

	JdbcDatabaseTester jdt;

	@Before
	public void setUp() throws Exception {
		this.jdt = new JdbcDatabaseTester("com.mysql.jdbc.Driver", "jdbc:mysql://localhost:3306/coursera_usuarios",
				"root", "");
		FlatXmlDataFileLoader loader = new FlatXmlDataFileLoader();
		this.jdt.setDataSet(loader.load("/tarefafinal/teste/inicio.xml"));
		this.jdt.onSetup();
	}

	@Test
	public void testeRanking() {
		List<Usuario> lista = new UsuarioDAO().ranking();
		assertEquals(2, lista.size());
		assertEquals("joao", lista.get(0).getLogin());
	}

	@Test
	public void testeRecuperar() {
		Usuario u = new UsuarioDAO().recuperar("teste");
		assertEquals("sobre@testando.com.br", u.getEmail());
	}

	@Test
	public void testeAdicionarPontos() throws SQLException, Exception {
		new UsuarioDAO().adicionarPontos("joao", 5);
		Usuario u = new UsuarioDAO().recuperar("joao");
		assertEquals(15, (int) u.getPontos());
	}

	@Test
	public void testeInserir() throws SQLException, Exception {
		Usuario u = new Usuario();
		u.setLogin("duda");
		u.setEmail("duda@gmail.com");
		u.setNome("Maria Eduarda");
		u.setSenha("duda123");
		u.setPontos(15);

		new UsuarioDAO().inserir(u);

		IDataSet currentDataSet = this.jdt.getConnection().createDataSet();
		ITable currentTable = currentDataSet.getTable("USUARIO");
		FlatXmlDataFileLoader loader = new FlatXmlDataFileLoader();
		IDataSet expectedDataSet = loader.load("/tarefafinal/teste/verifica.xml");
		ITable expectedTable = expectedDataSet.getTable("USUARIO");
		Assertion.assertEquals(expectedTable, currentTable);
	}
}
