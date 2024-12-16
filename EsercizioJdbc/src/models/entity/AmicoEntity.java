package models.entity;

public class AmicoEntity {
	
	private int id;
	private String nome;
	private String cognome;
	private String email;
	
	
	public AmicoEntity() {
		
	}
	
	


	public AmicoEntity(int id, String nome, String cognome, String email) {
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
		this.email = email;
	}




	public AmicoEntity(String nome, String cognome, String email) {
		this.nome = nome;
		this.cognome = cognome;
		this.email = email;
	}




	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCognome() {
		return cognome;
	}


	public void setCognome(String cognome) {
		this.cognome = cognome;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	@Override
	public String toString() {
		return "AmicoEntity [id=" + id + ", nome=" + nome + ", cognome=" + cognome + ", email=" + email + "]";
	}
	
	

}
