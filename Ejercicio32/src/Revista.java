
public class Revista implements Publicacion {
	
	private String nombre;
	private boolean prestado;
	private int anioPublicacion;
	
	public Revista() {
	}
	
		public Revista(String nombre, boolean prestado, int anioPublicacion) {
			this.prestado = prestado;
			this.anioPublicacion = anioPublicacion;
	}

		public int getAnioPublicacion() {
			return this.anioPublicacion;
	}

		public boolean esPrestado() {
			return this.prestado;
	}
	
		public String getNombre() {
			return nombre;
	}
	
		public void setNombre(String nombre) {
			this.nombre = nombre;
	}
}