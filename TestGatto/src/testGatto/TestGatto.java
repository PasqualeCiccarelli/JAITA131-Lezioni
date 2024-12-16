package testGatto;

public class TestGatto {

	public static void main(String[] args) {
		
		int x=10;
		Gatto g = new Gatto();
		
		g.nome ="fuffi";
		g.eta =7;
		g.razza="persiano";
		
		g.miagola();
		g.mangia("le crocchette");
		g.faiLeFusa();
		
		System.out.println("e anziano? "+g.isAnziano());

		System.out.println(g.toString());
	
	
	Gatto g2 = new Gatto();
	 g2.nome ="milu";
	 g2.eta = 12;
	 g2.razza = "siamese";
	 
	 System.out.println(g2);
	 System.out.println("e anziano? "+g2.isAnziano());
	
	 System.out.println(g.equals(g2));
	 
	 
	 
	 
	 
	}
}
