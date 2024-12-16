package esercizioTelefono;

public class Telefono {
//	Creare una classe che rappresenti un telefono cellulare.
//	Il cellulare deve avere queste caratteristiche:
//	marca,
//	modello,
//	credito,
//	numeroChiamate,
//	PREZZO_AL_MINUTO: Una costante.(Esempio 0.20€).
//	La classe deve avere dei metodi che permettano di:
//	Effettuare chiamate per un tot di minuti,
//	Visualizzare il credito residuo,
//	Ricaricare il credito,
//	Verificare se il credito è esaurito
//	Visualizzare il numero delle chiamate effettuate
//	Ogni chiamata effettuata deve incrementare il contatore delle chiamate, e scalare il
//	credito in base alla durata in minuti della chiamata.
//	(Esempio: parlo 2 minuti: 2*0,20€= 0,4€ costo della chiamata da scalare dal credito)
	
	private String marca;
	private String modello;
	private double credito;
	private static int numeroChiamate;
	private final double PREZZO_AL_MINUTO = 0.20;
	
	public Telefono(String marca, String modello, double credito) {
		this.marca = marca;
		this.modello = modello;
		this.credito = credito;
	}
	
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
	
	public double getCredito() {
		return credito;
	}
	
	public void setCredito(double credito) {
		this.credito = credito;
	}
	
	public int getNumeroChiamate() {
		return numeroChiamate;
	}
	
	public double getPREZZO_AL_MINUTO() {
		return PREZZO_AL_MINUTO;
	}
	
	public void chiamata(int minuti) {
		double costoChiamata = minuti*PREZZO_AL_MINUTO;
		if(costoChiamata <= this.credito) {
			System.out.println("pront sij tu?");
			this.credito -= costoChiamata;
			numeroChiamate++;
		} else {
			System.out.println("sei povero");
		}
	}
	
	public void creditoResiduo() {
		if(this.credito == 0) {
			System.out.println("Sei povero infatti non hai un eruto ma hai"+this.credito+" euro"); 
		} else {
			System.out.println("hai "+this.credito+" euro");
		}
	}
	
	public double ricaricaCredito(int ricarica) {
		this.credito+= ricarica;
		System.out.print("ora il tuo credito e' ");
		return this.credito;
	}
	
	public int mostraNumeroChiamate() {
		return numeroChiamate;
	}
}
