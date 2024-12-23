import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ContoCorrente {
	
	private final String numeroConto;
	private final String titolare;
	private double saldo;
	private final List<Movimento> movimenti;
	
	public ContoCorrente(String numeroConto, String titolare, double saldoIniziale) {
		if(saldoIniziale < 0) {
			throw new IllegalArgumentException("Il saldo iniziale non può essere negativo.");
		}
		this.numeroConto = numeroConto;
		this.titolare = titolare;
		this.saldo = saldo;
		this.movimenti = new ArrayList<Movimento>();
	}
	
	public void deposito(double importo) {
		if(importo <= 0) {
			throw new IllegalArgumentException("Il saldo iniziale non può essere negativo.");
		}
		
		saldo += importo;
	
		aggiungiMovimento(TipoOperazione.DEPOSITO, importo);
		
	}
	
	public void prelievo(double importo) {
		if (importo <= 0) {
			 throw new IllegalArgumentException("L'importo del prelievo deve essere positivo.");
		}
		if (importo > saldo) {
			throw new IllegalArgumentException("Sei troppo povero.");
		}
		
		saldo -= importo;
		
        aggiungiMovimento(TipoOperazione.PRELIEVO, importo);
	}

	public List<Movimento> getMovimenti() {
		return new ArrayList(movimenti);
	}

	public double getSaldo() {
		return saldo;
	}

	private void aggiungiMovimento(TipoOperazione tipo, double importo) {
		Movimento movimento = new Movimento(LocalDateTime.now(), tipo, importo, saldo);
		movimenti.add(movimento);
		
	}
	
	
}
