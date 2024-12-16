package esempioArray;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class EsempioArray {

	public static void main(String[] args) {
		int x=10;
		//le parentesi [] indicano che e' un array
		//i valori devono essere tutti dello stesso tipo
		//in questo caso essendo int possiamo mettere solo int ed e' obbligatorio specificare subito quanti elementio contiene 
		//la grandezza degli array e' fissa non puo' amunetare ne diminuire
		int[] unArray = new int[10];
		//primo elemento dell'array
		unArray[0]=1;
		//secondo elemento array
		unArray[1]=2;
		//terzo elemento
		unArray[2]=3;
		//se non specificato gli altri elementi numerici valgono 0
		//per array booleani il valore predefinito e' = false
		//per array di stringhe il valore predefinito e' = a stringa vuorta ""
		
		System.out.println(unArray[8]);
		System.out.println(unArray[1]);
		
		String[] noteMusicali = new String[7];
		
		noteMusicali[0]="do";
		noteMusicali[1]="re";
		noteMusicali[2]="mi";
		noteMusicali[3]="fa";
		noteMusicali[4]="sol";
		noteMusicali[5]="la";
		noteMusicali[6]="si";
		
		int lunghezza = noteMusicali.length;//questa e' una proprieta' quindi non si usano le parentesi
		System.out.println(lunghezza);
		
		int parola = "ciao".length();//questo e' un metodo delle stringhe quindi si mettono le parentesi
		
		// sintassi alternativa
		String[] colori = {"bianco","nero","giallo","blu"};
		//qui stiamo dichiarando sempre un array ma invece di creare la dimensione e poi lo riempiamo lo creiamo gia con gli elementi denbtro quindi la grandezza e' implicita
		
		int lung = colori.length;
		System.out.println(colori[lung-2]);
		//------------------------------------\\
		for(int i = 0;i<colori.length;i++) {
			System.out.println(i +" " + colori[i]);
		}
		
		//sintassi alternativa dove non uso l'indice
		//parti dall'array colori e ogni valore lo metti nella variabile temporanea colore 
		for (String colore:colori) {
			System.out.println(colore);
		}
		//le parentesi  quadre possono essere messe sia dopo il valore sia dopo il nome 
		int arr[] = new int[5];
		for(int i = 0; i <arr.length;i++) {
			arr[i]=i;
		}
		
		//stampo con indice
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		//stampo con l'altro ciclo
		//questo for si chiama ciclo forEach
		for (int i : arr) {
			System.out.println(i);
		}
		
		////////////////////////////////////////////
		
		String giorni[] = {"lunedi","martedi","mercoledi","giovedi","venerdi","sabato","domenica"};
		
		for(int i= 0;i<giorni.length;i++) {
			if(giorni[i].equals("venerdi") || giorni[i].equals("sabato")){
				System.out.println(giorni[i] + " weekend");
			} else if(giorni[i].equals("domenica")) {
				System.out.println(giorni[i]+ " relax");
			}else {
				System.out.println(giorni[i]+ " lavoro");
			}
		}
			
		
		for(String giorno:giorni) {
			if(giorno.equals("venerdi") || giorno.equals("sabato")){
				System.out.println(giorno + " weekend");
			} else if(giorno.equals("domenica")) {
				System.out.println(giorno+ " relax");
			}else {
				System.out.println(giorno+ " lavoro");
			}
		}
		
		//-------------------------------------\\
		String animali[] = {"cane","gatto","topo","criceto","pesce","tricheco"};
		String piuLunga = animali[0];
		for (String animale : animali) {
			if(animale.length()>piuLunga.length()) {
				piuLunga = animale;
			}
		}
		System.out.println("La piu lunga e': " +piuLunga);
		
		//------------------------------\\
		
		//ricordo che le stringhe non sono array
		String parola2 ="ciao";
		//System.out.println(parola2[0]);
		//non posso farlo per prendere la prima lettera perche la stringa non e un array
		char arrayCaratteri[] = parola2.toCharArray();
		//questo metodo posso trasformare una stringa in array di lettere quindi di char
		for (char lettere : arrayCaratteri) {
			System.out.println(lettere);
		}
		
		//creiamo un array a partire da una stringa
		String str="ciao a tutti";
		String[] arrDiStringhe= str.split(" ");
		//array di tre elementi 1 ciao 2 a 3 tutti
		for (String pezzi : arrDiStringhe) {
			System.out.println(pezzi);
		}
		
		
		//la calsse Array mi permette di visualizzare il contenuto dell'array
		int[] numeri= {4,2,1,3};
		System.out.println(Arrays.toString(numeri));
		
		
		int[] arrCasuali = new int[10];
		Random r = new Random();
		
		for (int i = 0; i < arrCasuali.length; i++) {
			arrCasuali[i] = r.nextInt(101);
		}//un ciclo for per riempire l'array con caratteri casuali che vanno da 0 a 100
		
		for (int valore : arrCasuali) {
			System.out.println(valore);
		}
		
		//----------------------------------------\\
		
		Scanner s =new Scanner(System.in);
		System.out.println("Quanti numeri vuoi avere?");
		int quanti = s.nextInt(); //numero di elementi nell'array
		
		int[] valori = new int[quanti];
		
		for (int i = 0; i < valori.length; i++) {
			System.out.println("Inserisci elemento alla posizione "+i);
			valori[i]=s.nextInt();
			//questo for server ad inserire i valori scelti dall'utente nell'array
		}
		
		System.out.println("Gli elementi dell'array sono:" );
		for (int elemento : valori) {
			System.out.println(elemento);
		}
		
		//selectio sort
		//confrontare ogni valore con il successivo
		//se piu piccolo lo sposta e lo mette prima 
		
		for (int i = 0; i < valori.length; i++) {//ogni valore
			for (int j = 0; j < valori.length; j++) {//lo confronta con tutti i valori
				if (valori[i]<valori[j]) {
					int temp = valori[i];
					valori[i]=valori[j];
					valori[j]=temp;
				}
			}
		} 
		
		System.out.println("l'array ordinato e': ");
		System.out.println(Arrays.toString(valori));
		
		//-------------------------------------\\
		
		//array multidimensionali
		
		int[][] arrMulti= {
				{1,2,3},//elemento posizione 0
				{4,5,6}//elemento posizione 1
		};		
		
		System.out.println(arrMulti[0][1]);//2 
		System.out.println(arrMulti[1][2]);//6
		
		
		//stesso esempio con altra sintassi
		int[][] multiplo = new int[2][3];
		multiplo[0][0]=1;
		multiplo[0][1]=2;
		multiplo[0][2]=3;
		multiplo[1][0]=4;
		multiplo[1][1]=5;
		multiplo[1][2]=6;
		
		for(int[] righe:multiplo) {
			for(int valore:righe) {
				System.out.println(valore);
			}
		}
		
		System.out.println(Arrays.deepToString(arrMulti));
		
		
		//------------------------------------------\\
		int[] xy=new int[10];
		xy[0]=99;
		xy[1]=1;
		xy[2]=75;
		
		for (int i = 0; i < xy.length; i++) {
			System.out.println(xy[i]);
		}
		
		for (int valore : xy) {
			System.out.println(valore);
		}
		
		String[] frutti = {"banane","arance","limoni","lamponi"};
		String[] verdure= {"carote","piselli","pomodori","insalata"};
		
		String[][] vegetali = {frutti, verdure};
		
		for (String[] riga2 : vegetali){
			
			for (String elemento : riga2 ) {
			
				System.out.println(elemento);
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
