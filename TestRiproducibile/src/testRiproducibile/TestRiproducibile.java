package testRiproducibile;

public class TestRiproducibile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Creare un'interfaccia chiamata "Riproducibile" che definisce un metodo astratto "play()" ,
//		che accetta in input un array di oggetti della classe astratta "multimedia".
//		La classe astratta "multimedia" ha i seguenti attributi: titolo, durata e il metodo astratto "riproduci".
//		Successivamente, creare due classi : "Audio" e "Video" che implementano l'interfaccia "Riproducibile. 
//		La classe "Audio" implementa il metodo "play()", che prende in input un elenco di canzoni,
//		sottoclasse di multimedia, e ne
//		stampa le caratteristiche: titolo, durata, autore e chiama il metodo riproduci che fa partire la canzone.
//		La classe "Video" implementa il metodo "play()" che prende in input un elenco di film,
//		sottoclasse di multimedia, e ne stampa le caratteristiche: titolo, durata, 
//		numeroVisualizzazioni e chiama il metodo riproduci che fa partire il video.
//		Infine, creare nel main un array di oggetti riproducibili, e chiamare il metodo "play()" su ognuno di essi.
//		Da creare:
//			-Interfaccia Riproducibile
//			-Classe astratta Multimedia
//			-Classe Canzone che estende Multimedia
//			-Classe Film che estende Multimedia
//			-Classe Audio che implementa Riproducibile, e con il metodo Play()  esegue un insieme di Canzoni
//			-Classe Video che implementa Riproducibile, e con il metodo Play() esegue un insieme di Film
//			-Classe TestRiproducibile che crea una Playlist di elementi multimediali(Film e Canzoni)
		
		Canzone c1 = new Canzone("DanDaDAn", 146, "Otonoke");
		Canzone c2 = new Canzone("Bling-Bang-Bang-Born", 252, "Creepy Nuts");
		
		Film f1 = new Film("Steins;Gate: The Movie - Load Region of Déjà Vu", 90, "Kanji Wakabayashi" , 7896 );
		Film f2 = new Film("Interstellar", 169, "Christopher Nolan" , 789600 );
		
		Multimedia[] playlist = {c1, c2, f1, f2};
		
		Audio playlistAudio = new Audio(new Canzone[] {c1, c2});		
		Video playlistVideo = new Video(new Film[] {f1, f2});
		
		Riproducibile[] riproducibili = {playlistAudio, playlistVideo};
		
		for (Riproducibile riproducibile : riproducibili) {
			riproducibile.paly(playlist);
			System.out.println();
		}
		
		

	}

}
