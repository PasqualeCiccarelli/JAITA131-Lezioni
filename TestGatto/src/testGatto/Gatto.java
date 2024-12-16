package testGatto;

public class Gatto {

	public String nome;
	public int eta;
	public String razza;
	
	public void miagola() {
		System.out.println("miao miao");
	}
	
	public void mangia(String cibo) {
		System.out.println("sto mangiando "+cibo);
	}
	
	public void faiLeFusa() {
		System.out.println("prrr prrrrr");
	}
	
	public boolean isAnziano(){
		return eta>10;
	}
	
	public String toString() {
		return "il gatto si chiama "+nome+" ha "+"anni ed e' di razza "+razza;
	}
	
	public boolean equals(Object o) {
		if(o instanceof Gatto) {
			return razza.equals(((Gatto)o).razza);
		}
		return false;
	}
	
}
