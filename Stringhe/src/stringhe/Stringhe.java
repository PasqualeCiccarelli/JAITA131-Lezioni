package stringhe;

public class Stringhe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String parola ="ciao";
		String parola2 =" a tutti"; 
		String parola3 = parola + parola2;
		
		int lunghezza = parola3.length();
		
		System.out.println("La stringa " + parola3 + "e' lunga " + lunghezza);
	
		boolean iniziaCon = parola3.startsWith("Ciao");
		boolean finisceCon = parola3.endsWith("tutti");
		
		System.out.println(iniziaCon + " " + finisceCon);
		
		int posTutti=parola3.indexOf("tutto");
		System.out.println(posTutti); // -1 se non la trova, altrrimenti torna la posizione
		
		char t=parola3.charAt(7);
		System.out.println("il carattere alla posizione 7 e' la: "+t);
		
		String str="ciao a tutti";
		char priamLettera= str.charAt(0);
		System.out.println(priamLettera);
		
		int lung = str.length();
		System.out.println(lung);
		char ultima = str.charAt(lung-1);
		System.out.println(ultima);
		
		String stringa1= "Ciao";
		String stringa2= "ciao";
		//boolean uguali = stringa1==stringa2; essendo classi e non tipi primitivi non posso fare un confronto di questo tipo
		//per fare un confronto di stringhe vidogna fare in questo modo 
		boolean uguali = stringa1.equals(stringa2);
		System.out.println(uguali);
		
		boolean ugualiNocase=stringa1.equalsIgnoreCase(stringa2);//in questo caso faccioil conronto delle stringhe ma ignorando maiuscole e minuscole 
		System.out.println(ugualiNocase);
		
		boolean vuotoOno=stringa1.isEmpty();
		System.out.println(vuotoOno);
		
		String str2 = "ciao a tutti";
		String tutti = str2.substring(7,12); // gli estremi superiori non sono compresi
		//questo metodo taglia la stringa dalla posizione 7 alla 11
		System.out.println(tutti);
		String ciao = str2.substring(0,4);
		
		int posTutti2=str2.indexOf("tutti");
		
		int secondaT = str2.indexOf("t",posTutti2+1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	}

}
