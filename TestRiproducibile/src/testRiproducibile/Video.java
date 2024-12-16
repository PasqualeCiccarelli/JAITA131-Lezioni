package testRiproducibile;

public class Video  implements Riproducibile{
	
	private Film[] elncoFilm;

	public Video(Film[] elencoFilm) {
		this.elncoFilm = elencoFilm;
	}

	@Override
	public void paly(Multimedia[] list) {
		// TODO Auto-generated method stub
		System.out.println("Stiamo guardando la lista di film contenente: ");
		for (Multimedia media : list) {
			if (media instanceof Film) {
				Film f = (Film) media;
				System.out.println("titolo: "+f.titolo+" di "+f.getRegista()+ "\ncon "+ f.getVisualizzazioni()+" visualizazzioni, della durata di  "+f.durata+" minuti");
				f.riproduci();
			}
			
		}
		
	}
	
	
	
	

}
