package dataOperation;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CountCookie
 */
@WebServlet("/CountCookie")
public class CountCookie extends HttpServlet {
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
		out.print("訪問回数テスト(クッキー)");
		out.print("</h1>");

		Cookie[]visit = request.getCookies();
		Cookie cookie = null;

		if(visit != null) {

			for(int i = 0; i < visit.length; i++) {
				if(visit[i].getName().equals("visit")) {

					cookie = visit[i];
				}
			}
		}

		if(cookie != null) {
			int visited = Integer.parseInt(cookie.getValue());

			out.println("<p>");
			out.println(visited);
			out.println("回目の訪問です。</p>");

			visited++;
			cookie.setValue(Integer.toString(visited));
			cookie.setMaxAge(300);
			response.addCookie(cookie);

		}else {
			out.println("<p>初めての訪問です。</p>");

			cookie = new Cookie("visit","1");
			cookie.setMaxAge(300);
			response.addCookie(cookie);
		}

		out.println("<a href=\"/dataOperation/CountCookie\">画面を再訪問</a>");
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
