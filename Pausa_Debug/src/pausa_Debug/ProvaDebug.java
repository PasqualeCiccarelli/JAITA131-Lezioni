package pausa_Debug;

public class ProvaDebug {

	public static void main(String[] args) {

		for (int i = 0; i<10;i++) {
			//primo modo di debuggare(stampo a console la i 
			//System.out.printl("i"+i);
			for (int j = 0; j<5;j++) {
				int somma = j+i;
				
				stampa(somma);
				System.out.println("j+i = "+ somma);
			}
		
		}

	}
	private static void stampa(int pippo) {
		pippo++;
		System.out.println("somma++ = "+ pippo);
	}

}
