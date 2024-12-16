package testAnimali;

//la classe astratta e una classe non completamente definita
//NON posso creare oggetti da una classe astratta. NO NEW
//nasce per essere estesa
public abstract class Animale {
	private String nome;
	private int eta;
	
	public Animale(String nome, int eta) {		
		this.nome = nome;
		this.eta = eta;
	}
	
	// se un metodo e abstract, tutt la classe diventa astratta quindi devo metterla anche nella classe
	//un metodo astratto non ha corpo.
	public abstract void parla();
	
	@Override
	public String toString() {
		return "Animale [nome=" + nome + ", eta=" + eta + "]";
	}

	public abstract void mangia();

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
	
	
	
	

}
