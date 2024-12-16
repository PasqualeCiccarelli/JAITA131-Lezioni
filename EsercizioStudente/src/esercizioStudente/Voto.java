package esercizioStudente;

public class Voto {
		
		private String materia;
		private double voto;
		
		public Voto(String materia, double voto) {
			this.materia = materia;
			this.voto = voto;
		}

		public String getMateria() {
			return materia;
		}

		public void setMateria(String materia) {
			this.materia = materia;
		}

		public double getVoto() {
			return voto;
		}

		public void setVoto(double voto) {
			this.voto = voto;
		}

		@Override
		public String toString() {
			return "Voto di " + materia + "e ugale a " + voto;
		}
		
}
