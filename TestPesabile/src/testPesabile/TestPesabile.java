package testPesabile;

public class TestPesabile {

	public static void main(String[] args) {
		
		Pesabile[] p = {new Macchina("fiat",1000),new Studente(70, "mario","Super",50)};
		for (Pesabile pesabile : p) {
			pesabile.pesa();
		}

	}

}