package Operation;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class register
 */
@WebServlet("/register")
public class register extends HttpServlet {
	private static final long serialVersionUID = 1L;


	/**
	 * @return
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());

		response.setContentType("text/html; charset=UTF-8");
		request.setCharacterEncoding("UTF-8");

		Connection Connect = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");

			Connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/task1?serverTimezone=JST","Kensaku-Tech","Nekshizu21");

			String stID = request.getParameter("ID");
			String stBirthday = request.getParameter("birthday");
			String stAge = request.getParameter("age");

			Integer ID = Integer.parseInt(stID);
			String name = request.getParameter("name");
			java.sql.Date sqlbirthday = java.sql.Date.valueOf(stBirthday);
			Integer age = Integer.parseInt(stAge);

			String sql = "INSERT INTO employee(id,name,birthday,age) VALUES(?,?,?,?)";
			PreparedStatement ps = Connect.prepareStatement(sql);
			ps.setInt(1,ID);
			ps.setString(2,name);
			ps.setDate(3,sqlbirthday);
			ps.setInt(4, age);

			int result = ps.executeUpdate();

			ps.close();


		}catch(SQLException | ClassNotFoundException | NumberFormatException e) {

			e.printStackTrace();

		}finally {
			if(Connect != null) {
				try {
					Connect.close();
				}catch(SQLException e) {
					e.printStackTrace();
				}
			}
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
