package esercizioProdotti2;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Alimenti extends Prodotto {
	
	LocalDate oggi = LocalDate.now();
	private LocalDate dataScadenza;
	private boolean scontato = false;

	public Alimenti(String codiceBarre, String descrizione, double prezzo, Cliente cliente, LocalDate dataScadenza) {
		super(codiceBarre, descrizione, prezzo, cliente);
		this.dataScadenza = dataScadenza;
	}
	
	@Override
	public void sconto() {
		super.sconto();
		long giorniAllaScadenza = ChronoUnit.DAYS.between(oggi, dataScadenza);
		if (giorniAllaScadenza < 10) {
			this.setPrezzo(this.getPrezzo() * 0.80);
			scontato=true;
		}
		
		
	}

	@Override
	public String toString() {
		if(scontato) {
			return super.toString()+ " \ndata di scadenza del prodoto acquistato: " + dataScadenza+ ", il prodotto e stato scontato del 20%";
		} else {
			return super.toString()+ " \ndata di scadenza del prodoto acquistato: " + dataScadenza + ", il prodotto non ha avuto sconto";
		}
	}
	
}

