
import java.util.ArrayList;

	public class ServicioPublicacion {
	
		public ServicioPublicacion() {
	}
	
		public int cuentaPrestados(ArrayList<Publicacion> publicaciones) {
			int contador = 0;
				for (Publicacion pub: publicaciones) {
					if (pub.esPrestado()) {
				contador++;
			}
		}
				
		return contador;
	}
	
		public int publicacionesAnterioresA(ArrayList<Publicacion> publicaciones, int anio) {
			int contador = 0;
				for (Publicacion pub: publicaciones) {
					if (pub.getAnioPublicacion() < anio) {
				contador++;
			}
		}
				
		return contador;
	}
}
