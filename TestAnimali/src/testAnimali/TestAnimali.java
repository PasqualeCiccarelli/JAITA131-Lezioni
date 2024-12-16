package testAnimali;

public class TestAnimali {

	public static void main(String[] args) {
		
//		Animale a = new Animale("aa",2); non possiamo farlo perche animale e una classe astratta
		Animale a[] = {
				new Cane("bobby", 10),
				new Gatto("Milu",5),
				new Topo ("Miky",7)
		};
		
		for (Animale animale : a) {
			System.out.println(animale);
		}

	}

}
