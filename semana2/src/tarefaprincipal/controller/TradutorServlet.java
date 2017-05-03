package tarefaprincipal.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tarefaprincipal.model.Tradutor;

@WebServlet("/tradutor")
public class TradutorServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String palavra = req.getParameter("palavra");
		
		String traducao = new Tradutor().recebePalavraRetornaTraducao(palavra);
		req.setAttribute("traducao", traducao);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("traducao.jsp");
		dispatcher.forward(req, resp);
	}
}
