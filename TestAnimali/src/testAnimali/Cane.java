package testAnimali;

public class Cane extends Animale{
// e obbligata a fare l'overide di tutti i metodi astratti
	//Quindi se estendo una classe astratta sono costretto a fare l'overide
	//di tutti i suoi metodi astratti.
	
	@Override
	public void parla() {
		System.out.println("bau bau");
	}
	
	public void mangia() {
		System.out.println("mangio le ossa");
	}

	public Cane(String nome, int eta) {
		super(nome, eta);
		
	}
	
	
	
	
	
}
