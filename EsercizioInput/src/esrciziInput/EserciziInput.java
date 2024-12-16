package esrciziInput;
import java.util.Scanner; 

public class EserciziInput {

	public static void main(String[] args) {
		//Realizzare un programma che chiede all'utente la 		temperatura in C e la converte iin k 
		// formula k = c + 273.15
		//visualizzare entrambe la temperatura
		
		Scanner input = new Scanner(System.in);
		double conversoreK= 273.15;
		System.out.println("Che temperatura c'e'?");
		double temperaturaC = input.nextDouble();
		input.nextLine();
		
		double temperaturaK = (temperaturaC + conversoreK);
		System.out.println("La temperatura all' esterno e' di: "+ temperaturaK + "K, oppure se preferisci: "+ temperaturaC + "C.");
		

	}

}
