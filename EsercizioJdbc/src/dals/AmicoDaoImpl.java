package dals;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import models.entity.AmicoEntity;

public class AmicoDaoImpl implements AmicoDao{
	
	

	@Override
	public List<AmicoEntity> getAllAmici() {
		
		ConnessioneDatabase db = new ConnessioneDatabase();
		Connection conn = db.getConnection();
		
		List<AmicoEntity> amici = new ArrayList<AmicoEntity>();
		
		String query = "Select * from amici";
		
		try{
			
			PreparedStatement ps = conn.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				int id = rs.getInt("id");
				String nome = rs.getString("nome");
				String cognome = rs.getString("cognome");
				String email = rs.getString("email");
				
				AmicoEntity amico = new AmicoEntity(id, nome, cognome, email);
				amici.add(amico);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.closeConnection();
		}
		
		return amici;
	}

	@Override
	public AmicoEntity getAmicoById(int id) {
		
		ConnessioneDatabase db = new ConnessioneDatabase();
		Connection conn = db.getConnection();
		
		AmicoEntity amico = new AmicoEntity();
		
		String query = "Select * from amici where id = ?";
		
		try {
			
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setInt(1, id);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				amico.setId(rs.getInt("id"));
				amico.setNome(rs.getString("nome"));
				amico.setCognome(rs.getString("cognome"));
				amico.setEmail(rs.getNString("email"));
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.closeConnection();
		}

		return amico;
	}
	
	@Override
	public int addAmico(AmicoEntity amico) {
		
		ConnessioneDatabase db = new ConnessioneDatabase();
		Connection conn = db.getConnection();
		
		String query = "Insert into amici(id,nome,cognome,email) values(?,?,?,?)";
		
		int boh =0;
		
		try {
			
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setInt(1, amico.getId());
			ps.setString(2, amico.getNome());
			ps.setString(3, amico.getCognome());
			ps.setString(4, amico.getEmail());
			
			boh =  ps.executeUpdate();
			
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			db.closeConnection();
		}
		
		return boh;
	}

	
	
	
	@Override
	public int updateAmico(AmicoEntity amico) {
		
		ConnessioneDatabase db = new ConnessioneDatabase();
		Connection conn = db.getConnection();
		
		String query = "update amici set nome = ?, cognome = ?, email =? where id =?";
		
		int boh = 0;
		
		try {
			
			PreparedStatement ps = conn.prepareStatement(query);
			
			ps.setString(1, amico.getNome());
			ps.setString(2, amico.getCognome());
			ps.setString(3, amico.getEmail());
			ps.setInt(4, amico.getId());
			
			boh =  ps.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.closeConnection();
		}
		
		return boh;
	}

	@Override
	public int delateAmico(int id) {
		
		ConnessioneDatabase db = new ConnessioneDatabase();
		Connection conn = db.getConnection();
		
		String query = "Delete from amici where id = ?";
		
		int boh = 0;
		
		try {
			
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setInt(1, id);
			
			boh = ps.executeUpdate();
	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.closeConnection();
		}

		return boh;
	}

}
