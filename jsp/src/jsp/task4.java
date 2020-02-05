package jsp;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
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
		FortuneBean fortuneBean = new FortuneBean();
		Date now = fortuneBean.getToday();

		String[]lucks = {"大吉","中吉","小吉","末吉","凶","大凶"};
		Random random = new Random();
		String luck = lucks[random.nextInt(5)];
		fortuneBean.setToday(now);
		fortuneBean.setFortune(luck);
		request.setAttribute("URANAU", fortuneBean);
		request.getRequestDispatcher("/WEB-INF/jsp/fortune_result.jsp").forward(request, response);


	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
