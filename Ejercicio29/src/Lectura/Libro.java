package Lectura;

public class Libro{
	
	private String Editorial;
	private String titulo;
	private String autor;
	private int numPagi;
	
	public Libro(String Editorial, String titulo, String autor, int numPagi) {
		this.Editorial = Editorial;
		this.titulo = titulo;
		this.autor = autor;
		this.numPagi = numPagi;
	}

	public String getEditorial() {
		return Editorial;
	}

	public void setEditorial(String Editorial) {
		Editorial = Editorial;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getNumPagi() {
		return numPagi;
	}

	public void setNumPagi(int numPagi) {
		this.numPagi = numPagi;
	}

	public String toString() {
		return "El libro Editorial " + Editorial + ", titulo " + titulo + ", creado por el autor " + autor + ",tiene " + numPagi + " paginas";
	}	}
