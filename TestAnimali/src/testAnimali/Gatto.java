package testAnimali;

public class Gatto extends Animale{

	public Gatto(String nome, int eta) {
		super(nome, eta);
	}
	
	@Override
	public void mangia() {
		System.out.println("mangia il topo");	
	}
	
	@Override
	public void parla() {
		System.out.println("Miao Miao");	
	}
}
