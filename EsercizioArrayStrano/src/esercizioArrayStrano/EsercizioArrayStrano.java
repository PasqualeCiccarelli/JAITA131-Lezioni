package esercizioArrayStrano;
import java.util.Scanner;
public class EsercizioArrayStrano {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int[][] numeri5 = new int[2][5];

        int contatoreComuni = 0;
        int sommaComuni = 0;

        // Array di boolean per segnare i numeri già contati nei gruppi
        boolean[] giaContati1 = new boolean[5]; // Per il primo gruppo
        boolean[] giaContati2 = new boolean[5]; // Per il secondo gruppo

        System.out.println("Inserisci 5 numeri per il primo gruppo:");
        // Inserimento primo gruppo
        for (int i = 0; i < 5; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            numeri5[0][i] = s.nextInt();
        }

        System.out.println("Inserisci 5 numeri per il secondo gruppo:");
        // Inserimento secondo gruppo
        for (int i = 0; i < 5; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            numeri5[1][i] = s.nextInt();
        }

        // Trova i numeri comuni tra il primo e il secondo gruppo
        for (int i = 0; i < 5; i++) {
            // Se il numero non è già stato contato nel primo array
            if (!giaContati1[i]) {
                for (int j = 0; j < 5; j++) {
                    // Se il numero è uguale nel secondo array e non è già stato contato
                    if (numeri5[0][i] == numeri5[1][j] && !giaContati2[j]) {
                        contatoreComuni++;        // Aumenta il conteggio dei numeri comuni
                        sommaComuni += numeri5[0][i]; // Aggiungi il numero alla somma
                        giaContati1[i] = true;    // Segna il numero come già contato nel primo array
                        giaContati2[j] = true;    // Segna il numero come già contato nel secondo array
                        break;                    // Esci dal ciclo interno appena trovato il numero comune
                    }
                }
            }
        }

        // Risultato
        System.out.println("Numeri comuni: " + contatoreComuni);
        System.out.println("Somma dei numeri comuni: " + sommaComuni);

        s.close();
    }
}

	


