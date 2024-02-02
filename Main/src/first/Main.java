package first;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

	public static Connection getConnection() {

		try {
			Class.forName("");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Connection connection = null;
		try {
			connection = DriverManager.getConnection("", "", "");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return connection;

	}

}
