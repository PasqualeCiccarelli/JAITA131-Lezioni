package org.generatio.jpa.entities;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * ORM: object relational mapping mappiamo una classe java ad una tabella sql(mysql)
 */
@Entity //jakarta.persistence
@Table(name = "utenti")//jakarta.persistence - NON OBBLIGATORIA, nome tabella su mysql
//se non mettessimo table che serve solo a dargli il nome hibernate da in auto un nome 
public class Utente {

	@Id //id chiave primaria
	@GeneratedValue(strategy = GenerationType.IDENTITY) //autoincrement voglio che lo gestisca il database
	private long id;
	
	@Column(length = 100, nullable = false) //varchr(100), non nullo
	private String nome;
	
	@Column(length = 150, nullable = false)
	private String cognome;
	
	
	private int eta;
	
	@Column(length = 100, nullable = false, unique = true) //unique vuol dire non ci sono doppioni altrimenti va in errore
	private String email;
	
//	@JsonIgnore //jaclson - indica al conservatore json di non convertire
	@Column(length = 20, nullable = false)
	private String password;
	
	@Column(precision = 8, scale = 2) //8 cifre 2 decimali
	private BigDecimal stipendio;

	public BigDecimal getStipendio() {
		return stipendio;
	}

	public void setStipendio(BigDecimal stipendio) {
		this.stipendio = stipendio;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
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

	public int getEta() {
		return eta;
	}

	public void setEta(int eta) {
		this.eta = eta;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
