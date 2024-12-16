package testPredatore;

public class TestPredatore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Preda[] prede = {new Coniglio(), new Pesce()};
		Predatore[] predatori = {new Avvolotoio(), new Pesce()};
		
		for (Predatore predatore : predatori) {
			predatore.caccia();
		}
		for (Preda preda : prede) {
			preda.scappa();
		}
		
		i[] tutto = {new Coniglio(),new Avvolotoio(),new Pesce()};

	}

}
