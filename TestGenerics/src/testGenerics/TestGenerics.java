package testGenerics;

public class TestGenerics {

	public static void main(String[] args) {
		
		Integer[] numeri = {1,2,3,4};
		String[] parole= {"caio","miao","paolo"};
		Boolean[] veroFalso = {true,true,false,true,false,false};
		Double[] virgole = {1.56,3.14,4.4,2.2};
		
		stampa(numeri);
		stampa(parole);
		stampa(veroFalso);
		stampa(virgole);
		
		Esempio e = new Esempio(10, "ciao");
		System.out.println(e);
		
		ClasseGenerica<Integer, Integer>oggettoInteri = new ClasseGenerica<Integer, Integer>(1, 9);
		System.out.println(oggettoInteri);
		
		ClasseGenerica<Double, Double> oggettoDouble = new ClasseGenerica<Double, Double>(1.6 , 3.14);
		
		ClasseGenerica<Double, String> oggettoMisto = new ClasseGenerica<Double, String>(1.6 , "Giuseppe");
		
		ClasseGenerica misto = new ClasseGenerica("#", 99);//non parametrizzato

	}//fine main
	
	public static<T> void stampa(T[] i) {//la t rappresenta tutti i tipi 
		for (T valore : i) {
			System.out.println(valore);
		}
	}
	
	
	//se volessimo fare un metodo per ogni tipo dio dato o lo facciamo singolarmente e scriviamo tanti metodi oppure come sopra
//	static void stampa(Integer[] i) {
//		for (Integer interi : i) {
//			System.out.println(interi);
//		}
//	}
//	
//	static void stampa(String[] i) {
//		for (String stringa : i) {
//			System.out.println(stringa);
//		}
//	}
//	static void stampa(Boolean[] i) {
//		for (Boolean booleano : i) {
//			System.out.println(booleano);
//		}
//	}
//	static void stampa(Double[] i) {
//		for (Double virgola : i) {
//			System.out.println(virgola);
//		}
//	}

}
