package esercizioDipendenti;

public class Dipendente {
	private String nome;
	private int eta;
	private double stipendio;
	
	public Dipendente() {
		System.out.println("ciao sono un nuovo dipendente");
	}
	
	public Dipendente(String nome, double stipendio) {
		this.nome=nome;
		this.stipendio=stipendio;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getEta() {
		return eta;
	}

	public void setEta(int eta) {
		this.eta = eta;
	}

	public double getStipendio() {
		return stipendio;
	}

	public void setStipendio(double stipendio) {
		this.stipendio = stipendio;
	}

	@Override
	public String toString() {
		return "Dipendente [nome=" + nome + ", eta=" + eta + ", stipendio=" + stipendio + "]";
	}
	
	public double aumento() {
		if(eta >= 50) {
			return this.stipendio + (20/100);
		} else {
			return stipendio;
		}
	}
	
	
	
}
