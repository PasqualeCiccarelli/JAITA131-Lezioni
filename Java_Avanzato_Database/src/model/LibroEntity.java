package model;

import java.math.BigDecimal;

//in questo model trovo le stesse proprieta della tabella libro sul database
//libroEntity e (quasi) un java bean: deve avere costruttore vuoto e getters e setters
//Database Frist: noi creiamo le nostre entita in base alle nostre tabelle precedenti
public class LibroEntity {
	
	private int id;
	private String titolo;
	private BigDecimal prezzo;
	private short pagine;
	private int id_editore;
	
	public LibroEntity() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public BigDecimal getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(BigDecimal prezzo) {
		this.prezzo = prezzo;
	}

	public short getPagine() {
		return pagine;
	}

	public void setPagine(short pagine) {
		this.pagine = pagine;
	}

	public int getId_editore() {
		return id_editore;
	}

	public void setId_editore(int id_editore) {
		this.id_editore = id_editore;
	}

	@Override
	public String toString() {
		return "LibroEntity [id=" + id + ", titolo=" + titolo + ", prezzo=" + prezzo + ", pagine=" + pagine
				+ ", id_editore=" + id_editore + "]";
	}



	
	

}
