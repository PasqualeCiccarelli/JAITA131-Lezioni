package testPersona;

public class Persona {
	
	//modificatori di accesso
	//public visibile ovunque
	//non metto nulla visibile solo ne package
	//private visibile solo nel file
	
	//TRE PRINCIPI BASE LINGUAGGIO AD OGGETTI
	//1) INCAPSULAMENTO
	
	//calsse = atrtributi+metodi
	
	//attributi -> come e fatta 
	public String nome;
	public String cognome;
	public int eta;
	public boolean maggiorenne;
	
	//metiamo due attributi nasccosti
	private char sesso;
	private double peso;
	private int valore;
	//get per ritornare li informazioni sulle variabili
	//set per assegnare valori alle variabili
	
	public char getSesso() {
		return sesso;
	}
	
	public double getPeso() {
		return peso;
	}
	
	public void setSesso() {
		this.sesso=sesso;
	}
	public void setPeso() {
		this.peso=peso;
	}
	
	public void setValore() {
		this.valore = valore; 
	}

	//metodi -> cosa puo fare
	public void mangia(String cibo) {
		System.out.println("sto mangiando "+cibo);
	}

	
	public void mangia(String pranzo, String cena) {
		System.out.println("sto mangiando "+pranzo+" a cena mangio "+cena );
	}
	
	public void dorme() {
		System.out.println("zzzzzzzzzzzzzzzzzzz");
	}
	
	public boolean isMaggiorenne() {
		return eta>=18;
	}
	
	public void stampaInfo() {
		System.out.println("la persona si chiama "+nome+" "+cognome+" ha "+ eta+" anni"+" maggiorenne? "+isMaggiorenne());
	}
	
	//ridefinire il metodo toString() di object per fargli stamapare quello che vogliamo
	@Override //->annotazione indica che il metodo esisteva gia prima e noi l'abbiamo cambiato
	public String toString() {
		//non deve stampare piu l'indirizzo di memoria ma quello che vogliamo noi
		return "la persona si chiama "+nome+" "+cognome+" ha "+ eta+" anni"+" maggiorenne? "+isMaggiorenne();
	}
	
	public boolean equals(Object o) {
		if( o instanceof Persona) {
			return nome.equals(((Persona) o).nome)&& cognome.equals(((Persona) o).cognome);
		}
		return false;
	}
	
	//metodo costruttore ha il compito di cosrtruie l'oggetto
	//viene eseguito quando si fa il NEW()
	//normalmente e nascosto ma posso renderlo esplicito
	//il costruttore e un METODO (come tutti gli altri) che ha lo STESSO NME DELLA CLASSE
	//MA NON RITORNA NIENTE NEANCHE VOID\
	
	public Persona() { //costruttore di default
		System.out.println("sono stato chiamato e creo l'oggetto persona");
	}
	
	//essendo un metodo faccio l'overload del costruttore
	//overload del costruttore
	public Persona(String nome, String cognome, int eta) {
		this.nome = nome;
		this.cognome=cognome;
		this.eta=eta;
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
