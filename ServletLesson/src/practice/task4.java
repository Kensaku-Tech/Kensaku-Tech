package practice;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class task4
 */
@WebServlet("/task4")
public class task4 extends HttpServlet {
	private static final long serialVersionUID = 1L;



	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html; charset=UTF-8");

		PrintWriter out = response.getWriter();

		String[]lucks = {"大吉","中吉","小吉","末吉","凶","大凶"};
		Random random = new Random();

		HtmlTemplate temp = new HtmlTemplate();
		temp.header(request, response);

		out.println("<p>↓占い結果↓</p>");

		String luck = lucks[random.nextInt(5)];

		out.print("<h1>");
		out.print(luck);
		out.print("</h1>");

		temp.footer(request,response);


	}

}
