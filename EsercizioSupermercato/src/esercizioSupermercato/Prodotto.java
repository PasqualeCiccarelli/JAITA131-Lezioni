package esercizioSupermercato;

public class Prodotto {
	/*
	 	Creare una classe supermercato che gestisca la cassa automatica di un
supermercato.
La cassa deve scansionare tutti i prodotti (leggiProdotto) passati dall'utente, fare il
totale del prezzo della spesa e stampare lo scontrino (stampaScontrino) con la data
della spesa e l'elenco dei prodotti comprati.
Il prodotto dovrà avere un codice a barre che identifica il prodotto, una descrizione, e
un prezzo.
Creare dei metodi che permettano di leggere o modificare il codice, la descrizione e il
prezzo dei prodotti.
Creare un metodo che trovi il prodotto che costa di più

	*/
	
	private String codice;
	private String descrizione;
	private double Prezzo;
	
	public Prodotto(String codice, String descrizione, double Prezzo) {
		super();
		this.codice = codice;
		this.descrizione = descrizione;
		Prezzo = Prezzo;
	}
	public String getCodice() {
		return codice;
	}
	public void setCodice(String codice) {
		this.codice = codice;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	public double getPrezzo() {
		return Prezzo;
	}
	public void setPrezzo(double Prezzo) {
		this.Prezzo = Prezzo;
	}
	@Override
	public String toString() {
		return "Profotto [codice=" + codice + ", descrizione=" + descrizione + ", prezzo=" + Prezzo + "]";
	}

	
















}

