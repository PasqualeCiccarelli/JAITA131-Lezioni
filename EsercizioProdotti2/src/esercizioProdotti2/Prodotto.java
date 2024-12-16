package esercizioProdotti2;

public class Prodotto {
	
//	Il gestore di un negozio associa a tutti i suoi Prodotti un codice a barre univoco,
//	una descrizione del prodotto e il suo prezzo.
//	Realizzare una classe Prodotto con le opportune variabili d'istanza elencate precedentemente,
//	e in più una variabile di tipo cliente(Riferimento alla classe cliente(Estensione di persona),
//	identificato dal nome e dall'età (da persona), e dal numero tessera) e i vari metodi get, set e toString.
//	Aggiungere alla classe Prodotto un metodo applicaSconto che modifichi il prezzo del prodotto
//	diminuendolo del 5% solo se il cliente ha più di 60 anni.
//
//	Il gestore del negozio vuole fare una distinzione tra i prodotti Alimentari e quelli Non Alimentari.
//	Ai prodotti alimentari viene infatti associata una data di scadenza,
//	mentre a quelli non alimentari il materiale principale di cui sono fatti(carta, vetro, plastica..).
//	Realizzare le sottoclassi Alimentari e NonAlimentari estendendo opportunamente la classe Prodotto.
//
//	Modificare le due sottoclassi specializzando il metodo applicaSconto in modo che nel caso
//	dei prodotti alimentari venga applicato uno sconto ulteriore del 20% se la data di scadenza 
//	è a meno di 10 giorni dalla data attuale, mentre nel caso dei prodotti nonAlimentari venga
//	applicato uno sconto del 10%  se il prodotto è composto da materiale riciclabile.
//	Creare un elenco di prodotti Alimentari e non Alimentari, stamparne l'elenco visualizzando
//	le informazioni dei clienti, e tutte le caratteristiche e il prezzo dei prodotti pagati dagli utenti.
	
	private String codiceBarre;
	private String descrizione;
	private double prezzo;
	private Cliente cliente;
	private boolean scontoEta = false;
	
	public Prodotto(String codiceBarre, String descrizione, double prezzo, Cliente cliente) {
		this.codiceBarre = codiceBarre;
		this.descrizione = descrizione;
		this.prezzo = prezzo;
		this.cliente = cliente;
	}

	public String getCodiceBarre() {
		return codiceBarre;
	}

	public void setCodiceBarre(String codiceBarre) {
		this.codiceBarre = codiceBarre;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	//javadoc
	/**
	 * metodo che applica lo sconto per i clienti con piu di 60 aani
	 * ritorna void
	 */
	public void sconto() {
		if(cliente.getEta() > 60) {
			prezzo -= prezzo*0.05;
			scontoEta = true;
			
		}
	}

	@Override
	public String toString() {
		if(scontoEta) {
			return "Prodotto: codice a barre=" + codiceBarre + ", \ndescrizione=" + descrizione + ", prezzo=" + prezzo
				+ ", \ncliente=" + cliente + ",\nil cliente ha diritto allo sconto del 5%";
		} else {
			return "Prodotto: codice a barre=" + codiceBarre + ", \ndescrizione=" + descrizione + ", prezzo=" + prezzo
					+ ", \ncliente=" + cliente+ ",\nil cliente non ha diritto allo sconto";
		}
	}
}
	
	
	
	


