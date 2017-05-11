package tarefafinal.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tarefafinal.dao.TopicoDAO;
import tarefafinal.model.Topico;
import tarefafinal.model.Usuario;

@WebServlet("/criarTopico")
public class TopicoCriarServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Usuario usuario = (Usuario) req.getSession().getAttribute("usuarioLogado");
		if (usuario == null) {
			resp.sendRedirect("login");
		} else {
			req.getRequestDispatcher("topicos-criar.jsp").forward(req, resp);
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String titulo = req.getParameter("titulo");
		String conteudo = req.getParameter("conteudo");

		Topico t = new Topico();
		t.setTitulo(titulo);
		t.setConteudo(conteudo);
		t.setUsuario((Usuario) req.getSession().getAttribute("usuarioLogado"));

		TopicoDAO topicoDAO = new TopicoDAO();
		topicoDAO.inserirTopico(t);
		
		resp.sendRedirect("topicos");
	}
}
