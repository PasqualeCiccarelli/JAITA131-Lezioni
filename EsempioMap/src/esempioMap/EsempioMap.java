package esempioMap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.TreeMap;

public class EsempioMap {

	public static void main(String[] args) {
		// un insieme di elementi identificati da una chiave e valore
		// le chiavi sono inivoche, non ammettono duplicati
		//le chiavi devono essere dello stesso tipo
		//anche in questo caso esistono le hashMap e le TreeMap e funzionano allo stesso modo dei Set
		
		HashMap<String, String> paesi = new HashMap<String, String>();
		
		//per aggiungere valori non si usa add ma put
		//il primo elemento in parentesi si chiama chiave il secondo si chiama valore 
		paesi.put("USA", "Washington");
		paesi.put("Norvegia", "Oslo");
		paesi.put("Russia", "Mosca");
		paesi.put("Cina", "Pechino");
		
		//inserisce solo se non esiste gia la chiave 
		paesi.putIfAbsent("USA", "xxx");
		//normalmente avrebbe sovrascritto ma con questo metodo non lo fa perche inserisce valori solo se e' vuoto
		
		paesi.putIfAbsent("Italia", "Roma");
		
		System.out.println(paesi);
		
		//Tramite la chiave trovo il valore 
		System.out.println(paesi.get("Russia"));//Da come risultato Mosca
		
		System.out.println(paesi.containsKey("Inghilterra"));
		//se la trova ti da come risultato true se lo trova false se non o trova
		System.out.println(paesi.containsValue("Pechino"));
		
		//modo per visualizzare solo le chiavi
		for (String chiave : paesi.keySet()) {
			System.out.println(chiave);
		}
		
		//posso fare lo stesso per i valori
		for (String valore : paesi.values()) {
			System.out.println(valore);
		}
		
		// stampo chiave e valore
		for (String chiave : paesi.keySet()) {
			System.out.println("chiave "+chiave+ " valore "+paesi.get(chiave));
		}
		
		paesi.forEach((chiave,valore)->System.out.println(chiave+ " "+valore));
		
		paesi.remove("USA");
		System.out.println(paesi);
		
		
		
		HashMap<String, Integer> montagne = new HashMap<String, Integer>();
		
		montagne.put("Everest", 8848);
		montagne.put("K2", 8630);
		montagne.put("Nanga Parbat", 8200);
		
		montagne.forEach((chiave,valore)->System.out.println(chiave+" e alto "+valore+" metri"));
		
		HashMap<String, String[]> autori = new HashMap();
		
		//libri degli autori
		String[] x = {"a","b","c"};//autore 1
		String[] y = {"d","e","f"};//autore 2
		String[] z = {"g","h","i"};//autore 3
		
		autori.put("autore1",x);
		autori.put("autore2",y);
		autori.put("autore3",z);
		
		for (String autore : autori.keySet()) {
			System.out.println("Autore "+autore+". Libri "+Arrays.toString(autori.get(autore)));
		}
		
		TreeMap<String, Double> frutti = new TreeMap<String, Double>();
		frutti.put("mela",1.50);
		frutti.put("uva",2.00);
		frutti.put("banana",3.00);
		frutti.put("kiwi",2.50);
		
		System.out.println(frutti);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
