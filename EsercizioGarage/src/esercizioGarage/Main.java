package esercizioGarage;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Macchine m1 = new Macchine("Ford", "Fiesta");
		Macchine m2 = new Macchine("Fiat", "Panda");
		Macchine m3 = new Macchine("Ferrari", "SonoPoveroNonConoscoLeFerari");
		Macchine m4 = new Macchine("BAT", "Mobile");
		Macchine m5 = new Macchine("Pamela", "Milanese");
		Garage garage = new Garage();
		
		System.out.println("che macchina vuoi parcheggiare? Ford Fiesta");
		garage.parcheggiaMacchinaBene(m1);
		System.out.println("che macchina vuoi parcheggiare? Fiat Panda");
		garage.parcheggiaMacchinaBene(m2);
		System.out.println("che macchina vuoi parcheggiare? Ferrari SonoPoveroNonConoscoLeFerari");
		garage.parcheggiaMacchinaBene(m3);
		System.out.println("che macchina vuoi parcheggiare? Bat Mobile");
		garage.parcheggiaMacchinaBene(m4);
		System.out.println("che macchina vuoi parcheggiare? Pamela Milanese");
		garage.parcheggiaMacchinaBene(m5);
		
		System.out.println(garage.getGarage());
		
		
		
		
		

	}

}
