package esercizioStudente;

import java.util.ArrayList;

public class TestRegistro {

	public static void main(String[] args) {
		
		ArrayList<Studente> studenti = new ArrayList<Studente>();
		
		Studente s1 = new Studente("Mario", "Super", 21);
		Studente s2 = new Studente("Kurisu", "Makise", 20);
		Studente s3 = new Studente("Goku", "SuperSayan", 19);
		
		s1.ottieniVoto("Italiano", 8.5);
        s1.ottieniVoto("Matematica", 4.0);
        s1.ottieniVoto("Inglese", 7.0);
        s1.ottieniVoto("CombattimentoControFreezer", 1.0);
        s1.ottieniVoto("SaltareSopraIGooba", 10.0);
        s1.ottieniVoto("InventareMacchinaDelTempo", 1.0);
        
        s2.ottieniVoto("Italiano", 5.5);
        s2.ottieniVoto("Matematica", 9.0);
        s2.ottieniVoto("Inglese", 9.0);
        s2.ottieniVoto("CombattimentoControFreezer", 1.0);
        s2.ottieniVoto("SaltareSopraIGooba", 1.0);
        s2.ottieniVoto("InventareMacchinaDelTempo", 10.0);
        
        s3.ottieniVoto("Italiano", 5.0);
        s3.ottieniVoto("Matematica", 2.0);
        s3.ottieniVoto("Inglese", 5.0);
        s3.ottieniVoto("CombattimentoControFreezer", 10.0);
        s3.ottieniVoto("SaltareSopraIGooba", 1.0);
        s3.ottieniVoto("InventareMacchinaDelTempo", 1.0);
        
        studenti.add(s1);
        studenti.add(s2);
        studenti.add(s3);
        
        System.out.println("Studenti promossi: ");
        for (Studente studente : studenti) {
			if(studente.promosso()) {
				System.out.println(studente+ " media: "+ studente.calcoloMedia());
			}
		}
        
        System.out.println("Studenti bocciati: ");
        for (Studente studente : studenti) {
			if(!studente.promosso()) {
				System.out.println(studente+ " media: "+ studente.calcoloMedia());
			}
		}

	}

}
