package testVeicolo;

public class Macchina extends Veicolo{
	//RICORDA una classe puo estendere solo un altra classe
	int porte;

	public Macchina(String nome, int ruote, int porte) {
		super(nome, ruote);//il super deve essere sempre la prima istruzione
		this.porte = porte;
	}
	
	public String toString() {
		return super.toString() + " porte "+ porte;
	}
	
	@Override
	public void parti() {
		System.out.println("parto con la benzina");
	}
	
	@Override
	public void ferma() {
		System.out.println("mi fermo con il freno a mano");
	}
	

}
