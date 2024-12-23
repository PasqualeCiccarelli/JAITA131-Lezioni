package dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.LibroEntity;

/**
 * DAO: perche esegue CRUD sulla tabella Autore
 * IMPL: Implementation- dovrebbe impolementare un'interfaccia che imponga alla classe
 * i metodi necessari al deo(crud)
 */
public class LibroDaoImpl implements LibroDao{
	

	@Override
	public List<LibroEntity> getAll() {
		// TODO Auto-genera
		//prendo la connessione dal singleton
		ConnessioneDatabse db = new ConnessioneDatabse();
		Connection conn = db.getConnection();
		
		List<LibroEntity> libri = new ArrayList<LibroEntity>();
		
		try {
			//preparo la query da eseguire
			PreparedStatement ps = conn.prepareStatement(SELECT_ALL);
			
			//eseguire la query
//			ps.execute();//non usare 
			ResultSet rs = ps.executeQuery();//per le SELECT
//			ps.executeUpdate();//per Insert, Update, Delete
			
			//next mi dice se c'e una riga e si sposta alla riga successiva 
			//se false non ci sono piu righe
			while(rs.next()) {
				LibroEntity libro = new LibroEntity();
				settaValoriLibro(libro, rs);
				
				libri.add(libro);
			}
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return libri;
	}

	@Override
	public LibroEntity getLibroById(int id) {
		ConnessioneDatabse db = new ConnessioneDatabse();
		Connection conn = db.getConnection();
		
		LibroEntity libro = new LibroEntity();
		
		try {
			PreparedStatement ps = conn.prepareStatement("Select * from libro where id = ?");
			
			//ATTENZIONE!!
			//questo e l'unici caso al mondo dove la posizione non e Zero Based
			//ma parte da 1 mannaggia!!
			ps.setInt(1, id);
			//ps.setString(2,"titolo")
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				settaValoriLibro(libro, rs);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		//OCCHIO!
		return libro;
	}

	//abbiamo bisogno di restituire il libro?
	//no perche passiamo per riferiemento
	private void settaValoriLibro(LibroEntity libro, ResultSet rs) throws SQLException {
		libro.setId(rs.getInt("id"));
		libro.setTitolo(rs.getString("titolo"));
		libro.setPrezzo(rs.getBigDecimal("prezzo"));
		libro.setPagine(rs.getShort("pagine"));
		libro.setId_editore(rs.getInt("id_editore"));
	}

	@Override
	public int updateLibro(LibroEntity libro) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteLibroById(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	public void readLibro() {
		ConnessioneDatabse db = new ConnessioneDatabse();
		Connection conn = db.getConnection();
		
		String query = "Select * from libro";
		try {
			 PreparedStatement ps = conn.prepareStatement(query);
			 ResultSet rs = ps.executeQuery();
			 
			 while(rs.next()) {
				 String titolo = rs.getString("titolo");
				 System.out.println(titolo);
			 }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public int addLibro(LibroEntity libro) {
		// TODO Auto-generated method stub
		ConnessioneDatabse db = new ConnessioneDatabse();
		Connection conn = db.getConnection();
		
		conn.prepareStatement("Select * ");
		return 0;
	}

	
}

/*
 
 */
