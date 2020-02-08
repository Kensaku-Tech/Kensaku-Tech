package dataOperation;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class countSession
 */
@WebServlet("/countSession")
public class countSession extends HttpServlet {
	private static final long serialVersionUID = 1L;


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		request.setCharacterEncoding("UTF-8");

		out.print("<h1>");
		out.print("訪問回数テスト(セッション)");
		out.print("</h1>");

		HttpSession visit = request.getSession(false);

		if(visit == null) {
			out.println("<p>初めての訪問です。</p>");
			visit = request.getSession(true);
			visit.setAttribute("visit", "1");

		}else {
			int count = Integer.parseInt(visit.getAttribute("visit").toString());
			count++;
			visit.setAttribute("visit", count);

			out.println("<p>");
			out.println(count);
			out.println("回目の訪問です。</p>");


		}

		out.println("<a href=\"/dataOperation/countSession\">画面を再訪問</a>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
