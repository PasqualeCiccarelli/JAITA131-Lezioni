package frigorifero;

public class Cibo {
	
	String nome;
	
	public Cibo(String nome) {
		this.nome= nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Cibo [nome=" + nome + "]";
	}
	
	
	
	

}