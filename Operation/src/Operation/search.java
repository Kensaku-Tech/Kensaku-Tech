package Operation;

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
 * Servlet implementation class search
 */
@WebServlet("/search")
public class search extends HttpServlet {
	private static final long serialVersionUID = 1L;


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());

		response.setContentType("text/html; charset=UTF-8");
		request.setCharacterEncoding("UTF-8");

		PrintWriter out = response.getWriter();

		Connection connect = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");

			connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/task1?serverTimezone=JST","Kensaku-Tech","Nekshizu21");

			String findname = request.getParameter("findname");

			String sql = "SELECT * FROM employee WHERE name LIKE ?";
			PreparedStatement ps = connect.prepareStatement(sql);

			ps.setString(1,"%"+ findname + "%");

			ResultSet result = ps.executeQuery();

			out.print("検索結果");
			while(result.next()) {
				String ID = result.getString("id");
				out.println("<p>");
				out.println("ID:" + ID);
				out.println("</p>");
				String name = result.getString("name");
				out.println("<p>");
				out.println("名前:" + name);
				out.println("</p>");
				String birthday = result.getString("birthday");
				out.println("<p>");
				out.println("生年月日:" + birthday);
				out.println("</p>");
				String age = result.getString("age");
				out.println("<p>");
				out.println("年齢:" + age);
				out.println("</p>");
			}

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
