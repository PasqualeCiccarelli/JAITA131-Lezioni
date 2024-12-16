package macchina;

public class Macchina {
	private String marca;
	private String modello;
	private String colore;
	private int targa;
	
	public Macchina(){
		System.out.println("ho creato una macchina");
	}
	
	public Macchina(String marca, String modello, String colore, int targa){
		this.marca=marca;
		this.modello=modello;
		this.colore=colore;
		this.targa=targa;
	}
	public Macchina(String marca, String modello){
		this.marca=marca;
		this.modello=modello;
	}
	//coesi, per far fronte 

	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getModello() {
		return modello;
	}
	
	public void setModello(String modello) {
		this.modello = modello;
	}
	
	public String getColore() {
		return colore;
	}
	
	public void setColore(String colore) {
		this.colore = colore;
	}
	public int getTarga() {
		return targa;
	}
	public void setTarga(int targa) {
		this.targa = targa;
	}
	
	public void verso() {
		System.out.println("bruum bruum");
	}
	
	public boolean multa() {
		if(this.colore.equals("giallo")) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean equals(Object o) {
		if( o instanceof Macchina) {
			return this.modello.equals(((Macchina) o).modello)&& this.marca.equals(((Macchina) o).marca) && this.targa==(((Macchina) o).targa);
			
		}
		return false;
	}
	
	public String toString() {
		return "la macchina e una "+marca+"ed e una "+modello+" di colore "+colore+" ed e targata "+targa;
	}
	
	//la calsse e uno stampino o u modello che definisce come dovra essere l'oggetto che andra a creare infatti ha le cvariabile che rappressenttano lo stato le sue caratteristiche nome cognome eta eccecc. metodi rappresentano i suoi comportamenti tipo mangia parla beve e quantr altro okkei e questo sostanzialmente e quello che ce in una classe ora quello che state facendo voi, non devi scrivere rtutto quello che dico, mi sento presa in giro 
//	chiudi la pagina con il tasto chiudi
	//cos'e il costruttore ? un metodo !! estto! che fa ? crea le code! non proprio
	
}
