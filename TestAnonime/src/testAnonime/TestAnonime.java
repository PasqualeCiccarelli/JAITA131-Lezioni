package testAnonime;

public class TestAnonime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Anonima a =new Anonima();
		a.saluta();
		a.mangia();
		
		Anonima aInglese = new Anonima() {//faccio l'override direttamente nella creazione dell'oggetto
			public void saluta() {
				System.out.println("hallo to everybody");
			}
		};//obbligatorio 
		
		a.saluta();//saluta in italiano
		aInglese.saluta();// saluta in inglese

		Anonima aMAngiaPizza= new Anonima() {
			public void mangia() {
				System.out.println("mangio pizza");
			}
		};
		
		a.mangia();
		aMAngiaPizza.mangia();
		
		
		
		
		
	}

}
