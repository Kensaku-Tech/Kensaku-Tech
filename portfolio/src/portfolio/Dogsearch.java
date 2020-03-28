package portfolio;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Dogsearch
 */
@WebServlet("/Dogsearch")
public class Dogsearch extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());

		response.setContentType("text/html; charset=UTF-8");
		request.setCharacterEncoding("UTF-8");

		PrintWriter out = response.getWriter();

		Connection connect = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");

			connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/task1?serverTimezone=JST","Kensaku-Tech","Nekshizu21");

			String hair = request.getParameter("hair");
			String size = request.getParameter("size");

			String sql = "SELECT * FROM dogs WHERE hair = ? AND size = ?";
			PreparedStatement ps = connect.prepareStatement(sql);
			ps.setString(1, hair);
			ps.setString(2, size);

			ResultSet result = ps.executeQuery();

			out.print("あなたには");
			while(result.next()){
				String species = result.getString("species");
				String specialty = result.getString("specialty");

				out.print("<p>");
				out.print("<h1>");
				out.print(species);
				out.print("</h1>");
				out.print("性格:" + specialty);
				out.print("</p>");
			}
			out.print("がオススメ！");

			out.print("<p>");
			out.print("参考:「みんなの犬図鑑」 https://www.min-inuzukan.com");
			out.print("</p>");

			result.close();
			ps.close();

		}catch(SQLException | ClassNotFoundException | NumberFormatException e) {
			e.printStackTrace();
		}finally {
			if(connect != null) {
				try {
					connect.close();
				}catch(SQLException e) {
					e.printStackTrace();
				}
			}



		}
	}
}
