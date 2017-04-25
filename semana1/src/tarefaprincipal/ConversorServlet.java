package tarefaprincipal;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/converter")
public class ConversorServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Integer valor = Integer.parseInt(req.getParameter("valor"));
		String opcao = req.getParameter("opcao");

		double resultado;
		String grau;

		if (opcao.equals("fahrenheit")) {
			// Celsius para Fahrenheit
			resultado = ((valor * 9) / 5) + 32;
			grau = "Fahrenheit";
		} else {
			resultado = ((valor - 32) * 5) / 9;
			grau = "Celsius";
		}

		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		out.println("<h2>Resultado da convesão foi: " + resultado + "º " + grau + "</h2>");
	}
}
