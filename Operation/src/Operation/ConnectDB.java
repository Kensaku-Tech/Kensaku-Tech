package Operation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Connection Connect = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");

			Connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/task1?serverTimezone=JST","Kensaku-Tech","Nekshizu21");

			if(Connect != null) {
				System.out.println("DB接続が成功しました。");
			}
		}catch(SQLException | ClassNotFoundException e) {
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

}
