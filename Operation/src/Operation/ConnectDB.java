package Operation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Connection connect = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");

			connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/task1?serverTimezone=JST","Kensaku-Tech","Nekshizu21");

			if(connect != null) {
				System.out.println("DB接続が成功しました。");
			}
		}catch(SQLException | ClassNotFoundException e) {
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
