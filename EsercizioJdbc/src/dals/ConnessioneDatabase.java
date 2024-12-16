package dals;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnessioneDatabase {
	
	private static final String HOST = "jdbc:mysql://localhost:3306/java2024";
	private static final String USER = "app_java";
	private static final String PASSWORD = "java2024!";
	
	private static Connection conn;
	
	public Connection getConnection() {
		
		try {
			if(conn == null){
				conn= DriverManager.getConnection(HOST, USER, PASSWORD);
				System.out.println("nuova connessione");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
		return conn;
	}

	public void closeConnection() {
		if(conn != null) {
			try {
				conn.close();
				conn= null;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}




}
