package tarefa1.mvc.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tarefa1.mvc.model.Oraculo;

@WebServlet("/oraculoController")
public class OraculoController extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String produto = req.getParameter("produto");
		
		Oraculo oraculo = new Oraculo();
		List<String> produtos = oraculo.melhoresProdutos(produto);
		req.setAttribute("produtos", produtos);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("resposta.jsp");
		dispatcher.forward(req, resp);
	}
}
