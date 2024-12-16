package frigorifero;

import java.util.ArrayList;
import java.util.Arrays;

public class Frigorifero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cibo[] arrCibi = new Cibo[3];
//		
//		Cibo cibo1 = new Cibo("pizza");
//		Cibo cibo2 = new Cibo("hamburger");
//		Cibo cibo3 = new Cibo("hot dog");
//		
//		arrCibi[0] = cibo1;
//		arrCibi[1] = cibo2;
//		arrCibi[2] = cibo2;
//		
//		System.out.println("nel frigorifero ci sono i deguenti cibi");
//		for (Cibo cibo : arrCibi) {
//			System.out.println(cibo);
//		}
		
		//modo alternativo per scriverlo usando gli oggetti anonimi 
		Cibo[] dispensa = {new Cibo("pizza"), new Cibo("hamburger"),new Cibo("hot dog")};
		for (Cibo cibo : arrCibi) {
			System.out.println(cibo);
		}
		
		//ho trasformato l'array in un array list
		ArrayList<Cibo> lista = new ArrayList<Cibo>(Arrays.asList(dispensa));
		//ho aggiunto un nuovo oggetto anonimo alla lista
		lista.add(new Cibo("pasta"));
		//callback per stampare 
		lista.forEach(cibo->System.out.println(cibo));
		//domanda a trabbocchetto differnsza tra array e arraylist primo fisso secondo dinamico
		//override overload overide sovrascrive, overload ne crea un altro ma con un altra firma 
		
		
		
		
		
		

	}

}
