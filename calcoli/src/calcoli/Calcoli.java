package calcoli;

public class Calcoli {

	public static void main(String[] args) {
		int base=25;
		int altezza=40;
		int area=base*altezza;
		int perimetro=((base*2)+(altezza*2));
		
		System.out.println("la base e' di " + base + " cm");
		System.out.println("l' altezza ee' di " + altezza + " cm");
		System.out.println("l'aria e' di " + area + " cm^2");
		System.out.println("il perimetro e' di " + perimetro + "cm");
		
		final double PIGRECO=3.14;
		int raggio=10;
		double area2=(raggio*raggio*PIGRECO);
		double perimetro2=(2*PIGRECO*raggio);
		
		System.out.println(raggio);
		System.out.println(PIGRECO);
		System.out.println("il perimetro e' di " + perimetro2 + "cm");
		System.out.println("l'aria e' di " + area2 + " cm^2");
		
		//\n serve per mettere a capo

	}
	

}
