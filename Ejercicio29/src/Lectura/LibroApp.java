package Lectura;

public class LibroApp {


	public static void main(String[] args) {

		
		Libro l1 = new Libro ("Planeta", "ecuaciones", "larson", 500);
		Libro l2 = new Libro ("Antartica", "el camino del amor","nicholas Spark",300);
		
		System.out.println(l1.toString());
		System.out.println(l2.toString());
		
		if (l1.getNumPagi()>l2.getNumPagi()) {
			System.out.println("El libro "+l1.getTitulo()+" tiene mas numeros de paginas que el libro "+l2.getTitulo());
		}else {
			System.out.println("El libro "+l2.getTitulo()+" tiene mas numeros de paginas que el libro "+l1.getTitulo());
		}
		

	}

}