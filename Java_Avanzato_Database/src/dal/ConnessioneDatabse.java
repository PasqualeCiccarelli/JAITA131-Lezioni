package dal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * DAL: Data Access Layer
 * in java e lo strato che si occupa di accedere ai dati di un database,
 * solitamente in questo pakage/layer sono presenti le classi che accedono al db 
 * 
 * DAO: Data Access Object
 * 		una classe che interroga il database e restituisce uno o piu entita
 * 		contiene dei metodi che eseguono le operazione CRUD
 * 		CRUD: Create Read Update Delete
 * 
 * Model: classe java genericva che rappresenta dei dati 
 * 	-DTO: Data Transfer Object classe c he contine dati da trasfertire/inviare
 * 	-Entity: classe che rappresenta i dati di una tabella del database
 * 			(Mappatura delle colonne di una tabella)
 * 
 * Ho bisogno di una classe, che si colleghi al database e che viene usata da tutti gli oggetti DAO
 * connessioneDatabase e un Singleton non Thread Safe
 * Singleton (singoletto design pattern)
 * e un oggetto che viene instanziato una sola volta in memoria
 */
public class ConnessioneDatabse {
	
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
