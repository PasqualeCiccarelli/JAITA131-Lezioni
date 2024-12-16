package macchina;

public class TestMacchina {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Macchina macchina = new Macchina("fiat", "panda", "giallo", 345);
		Macchina macchina2 = new Macchina("fiat", "panda");
		macchina2.setColore("fmflf");
		macchina2.setTarga(345);
		
		System.out.println(macchina.equals(macchina2));
		System.out.println("hai per caso preso una multa?");
		if (macchina.multa()) {
			System.out.println("la tua multa e di 10 milioni di euro");
		} else {
			System.out.println("la tua multa e solo di 9 milioni ");
		}
				

	}

}
