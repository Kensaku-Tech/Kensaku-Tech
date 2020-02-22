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
 * Servlet implementation class UpdateEmployee
 */
@WebServlet("/UpdateEmployee")
public class UpdateEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);

		response.setContentType("text/html; charset=UTF-8");
		request.setCharacterEncoding("UTF-8");

		Connection connect = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");

			connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/task1?serverTimezone=JST","Kensaku-Tech","Nekshizu21");

			String stID = request.getParameter("ID");
			Integer ID = Integer.parseInt(stID);

			String updatedName = request.getParameter("updatedName");

			String sql = "UPDATE employee SET name = ? WHERE id = ?";
			PreparedStatement ps = connect.prepareStatement(sql);
			ps.setString(1,updatedName);
			ps.setInt(2, ID);

			int result = ps.executeUpdate();

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
