
import java.time.LocalDateTime;

public class Movimento {
	
	private final LocalDateTime dataOperzione;
	private final TipoOperazione tipo;
	private final double importo;
	private final double saldoRisultante;
	
	public Movimento(LocalDateTime dataOperzione, TipoOperazione tipo, double importo, double saldoRisultante) {
		this.dataOperzione = dataOperzione;
		this.tipo = tipo;
		this.importo = importo;
		this.saldoRisultante = saldoRisultante;
	}

	@Override
	public String toString() {
		return "Movimento [dataOperzione=" + dataOperzione + ", tipo=" + tipo + ", importo=" + importo
				+ ", saldoRisultante=" + saldoRisultante + "]";
	}
	
	
}
