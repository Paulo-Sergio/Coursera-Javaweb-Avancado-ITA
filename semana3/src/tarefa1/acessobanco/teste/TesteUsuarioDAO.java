package tarefa1.acessobanco.teste;

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

import tarefa1.acessobanco.dao.UsuarioDAO;
import tarefa1.acessobanco.model.UsuarioTeste;

public class TesteUsuarioDAO {

	JdbcDatabaseTester jdt;

	@Before
	public void setUp() throws Exception {
		this.jdt = new JdbcDatabaseTester("com.mysql.jdbc.Driver", "jdbc:mysql://localhost:3306/coursera_usuarios",
				"root", "");
		FlatXmlDataFileLoader loader = new FlatXmlDataFileLoader();
		this.jdt.setDataSet(loader.load("/tarefa1/acessobanco/teste/inicio.xml"));
		this.jdt.onSetup();
	}

	@Test
	public void recuperaTodos() {
		List<UsuarioTeste> lista = UsuarioDAO.todosUsuarios();
		assertEquals(2, lista.size());
		assertEquals("joao", lista.get(0).getLogin());
	}
	
	@Test
	public void insereNovo() throws SQLException, Exception {
		UsuarioTeste u = new UsuarioTeste();
		u.setLogin("duda");
		u.setNome("Maria Eduarda");
		u.setEmail("duda@gmail.com");
		
		UsuarioDAO.inserirUsuario(u);
		
		IDataSet currentDataSet = this.jdt.getConnection().createDataSet();
		ITable currentTable = currentDataSet.getTable("USUARIO_TESTE");
		FlatXmlDataFileLoader loader = new FlatXmlDataFileLoader();
		IDataSet expectedDataSet = loader.load("/tarefa1/acessobanco/teste/verifica.xml");
		ITable expectedTable = expectedDataSet.getTable("USUARIO_TESTE");
		Assertion.assertEquals(expectedTable, currentTable);
	}

}
