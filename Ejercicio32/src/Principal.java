
import java.util.ArrayList;

public class Principal {
	
	public static void main(String[] args) {
		
		ServicioPublicacion sp = new ServicioPublicacion();
		
		Libro miLibro = new Libro("Cronicas de Narnia", true, 1980);
		Libro miLibro2 = new Libro("Assasin Creed", true, 1985);
		Libro miLibro3 = new Libro("Manos de Amor", false, 1997);
		Revista miRevista = new Revista("TV Grama", false, 1999);
		Revista miRevista2 = new Revista("Cosas", true, 1985);
		Revista miRevista3 = new Revista("Don Balon", true, 1991);
		
		ArrayList<Publicacion> misLibros = new ArrayList<Publicacion>();
		
		misLibros.add(miLibro);
		misLibros.add(miLibro2);
		misLibros.add(miLibro3);
		misLibros.add(miRevista);
		misLibros.add(miRevista2);
		misLibros.add(miRevista3);
		
		System.out.println(sp.cuentaPrestados(misLibros));
		
		System.out.println(sp.publicacionesAnterioresA(misLibros, 1990));
	}
}