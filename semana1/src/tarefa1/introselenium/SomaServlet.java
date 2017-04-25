package tarefa1.introselenium;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/somar")
public class SomaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer p1 = Integer.parseInt(request.getParameter("p1"));
		Integer p2 = Integer.parseInt(request.getParameter("p2"));
		Integer total = p1 + p2;

		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Soma</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>O resultado foi: " + total + "</h1>");
		out.println("</body>");
		out.println("</html>");
	}

}
