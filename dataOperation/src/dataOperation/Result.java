package dataOperation;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Result
 */
@WebServlet("/Result")
public class Result extends HttpServlet {
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

		String name = request.getParameter("name");
		String gender = request.getParameter("button");
		String asks = request.getParameter("asks");
		String asking = request.getParameter("askingarea");

		out.print("<p>");
		out.print("以下の内容でお問い合わせしました。");
		out.print("</p>");

		out.print("<p>");
		out.print("</p>");

		out.print("<p>");
		out.print("名前:" + name + "様");
		out.print("</p>");

		out.print("<p>");
		out.print("性別:" + gender);
		out.print("</p>");

		out.print("<p>");
		out.print("お問い合わせ種類:" + asks);
		out.print("</p>");

		out.print("<p>");
		out.print("お問い合わせ内容:" + asking);
		out.print("</p>");


		//課題2
		//1.doGET
		//2.doPOST
		//3.doGET
		//4.DoPOST

	}

}
