

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Fruits
 */
@WebServlet("/Fruits")
public class Fruits extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter printWriter = response.getWriter(); //classe que gera variavel responsavel por escrever tags html na pagina
		response.setContentType("text/html");
		
		String[] values = request.getParameterValues("frutas");
		printWriter.println("Fruits that you have selected:");
		
		for(int i=0; i < values.length; i++) {
			printWriter.println("<li>"+values[i]+"</li>");
		}
		
		printWriter.close();
	}

}
