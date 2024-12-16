package testRiproducibile2;

import java.util.Arrays;

public class TestRiproducibile2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Canzone c1 = new Canzone("DanDaDAn", 146, "Otonoke");
        Canzone c2 = new Canzone("Bling-Bang-Bang-Born", 252, "Creepy Nuts");
        
        Film f1 = new Film("Steins;Gate: The Movie - Load Region of Déjà Vu", 90, "Kanji Wakabayashi", 7896);
        Film f2 = new Film("Interstellar", 169, "Christopher Nolan", 789600);
        
        Riproducibile[] riproducibili = {
                new Audio(Arrays.asList(c1, c2)),
                new Video(Arrays.asList(f1, f2))
            };
        
        for (Riproducibile riproducibile : riproducibili) {
            riproducibile.play();
            System.out.println();
        }

	}

}
